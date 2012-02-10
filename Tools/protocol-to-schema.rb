#!/usr/bin/env ruby

# for prot in "com.x.marketplace.v1"; do pushd $prot; for schema in *; do name=`echo $schema | sed -e"s#-.*##"`; version=`echo $schema | sed -e"s#.*-##" | sed -e"s#\^.*##"`; topic=`echo $schema | sed -e"s#.*^##"`; curl -XPOST -d`cat $schema` -k https://ocl.xcommercecloud.com/$prot/$name/$version/$topic; done; popd; done

require 'stringio'
require 'rubygems'
require 'avro'
require 'json'
require 'set'
require 'net/http'
require 'net/https'

def write_type(buf, schema, delim, written, namespace = nil)
  buf.print delim if delim

  if schema.class == Avro::Schema::UnionSchema
    buf.print '['
    delim = ''
    nullable = false
    schema.schemas.each do |subschema|
      nullable = nullable || (subschema.to_s == '"null"')
      write_type(buf, subschema, delim, written)
      delim = ','
    end
    buf.print ']'
    if nullable
      buf.print ',"default":null'
    end
  elsif schema.class == Avro::Schema::RecordSchema
    if !written.include?(schema.name)
      written.add(schema.name)
      
      buf.print "{\"type\":\"record\",\"name\":\"#{schema.name}\", \"version\":\"#{schema.props['version']}\""
      if namespace
        buf.print ",\"namespace\":\"#{namespace}\""
      end
      buf.print ",\"fields\":["
      
      delim = ''
      
      schema.fields.each do |field|
        buf.print delim
        buf.print "{\"name\":\"#{field.name}\",\"type\":"
        write_type(buf, field.type, '', written)
        buf.print '}'
        delim = ','
      end

      buf.print "]}"
    else
      buf.print "\"#{schema.name}\""
    end
  elsif schema.class == Avro::Schema::ArraySchema
    buf.print "{\"type\":\"array\",\"items\":"

    write_type(buf, schema.items, '', written)

    buf.print "}"
  else
    json = schema.to_json()[1..-2].gsub('"\\"', '"').gsub('\\"', '"')
    buf.print json
  end
end

def process_protocol(protocol_file_name)
  protocol_file = File.open(protocol_file_name)
  protocol_text = protocol_file.read

  begin
    protocol = Avro::Protocol.parse(protocol_text)
  rescue
    $stderr.puts "Failed to parse #{protocol_file_name}"
    return
  end

  http = Net::HTTP.new('ocl.cloud.x.com', 443)
  http.use_ssl = true
  #http = Net::HTTP.new('localhost',3010)
  
  protocol.types.each do |type|
    if type.class == Avro::Schema::RecordSchema && type.props['version']
      buf = StringIO.new
      
      written = Set.new
      
      print "Publishing #{type.name}"...
      
      write_type(buf, type, '', written, protocol.namespace)
      
      buf.rewind
      
#      out = File.open(protocol.namespace + '.' + type.name + '.avsc', 'w')
#      out.print buf.read
#      out.close
      
      # I moved the topic check here as not all the schemas that needed to be uploaded had topics but
      # all had versions. Not sure if this will adversly effect the other end of the schema server.
      path = "/#{protocol.namespace}/#{type.name}/#{type.props['version']}"
      if type.props['topic']
        path += "?topic=#{type.props['topic'][1..-1]}&namespace=#{protocol.namespace}"
      end
      
      resp, data = http.post(path, buf.read, {})
      puts "done: #{resp}"
    end
  end
end

jar_path = File.join(Dir.pwd, 'Tools', 'avro-tools-1.6.1.jar')

Dir['all/**/*'].each do |d|
  if File.directory? d
    Dir.chdir d do
      Dir['*'].each do |f|
        if f.match /\.avdl$/
          puts "Compiling #{f}"
          `java -jar #{jar_path} idl #{f} > #{f}.avpr`
          puts "Processing #{f}.avpr"
          process_protocol("#{f}.avpr")
        end
      end
    end
  end
end
