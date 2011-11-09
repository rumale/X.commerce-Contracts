Each domain contract will reside in their own folder.  Within a domain folder,
the "current" folder contain the domain's latest currently released contract.
The "previous" folder will contain ONE SUB-FOLDER FOR EACH PREVIOUSLY RELEASED 
MAJOR version.  If there are more than one minor update released for the same
major version, only the newest minor release of that major version will be
included.

avro
  / <domain>
    / current
      / <domain>.avdl
      /...
    / previous
      /1.x
        / <domain>.avdl
      /2.x
        / <domain>.avdl
      /etc...