#!/bin/bash

###########################################################
## This script is to automate ontology release process   ##
## It will perform following steps                       ##
## 1. verify compilation                                 ##
## 2. Tag for release                                    ##
## 3. build and deploy release to nexus                  ##
## Assumes svn/maven installation and maven credentials  ##
## to be set for deployment. If unsure run using Jenkins ##
###########################################################

usage()
{
cat << EOF
usage: $0 [required-options] [optional-options]

OPTIONS:
   -h      show this message   
   -u      svn userid
   -p      svn password
   -r      svn repository url <optional>
   -t      svn tagbase <optional>
Example: $0 -u johndoe -p secret -r https://svn.corp.x.com:8080/svn/x/Ontology/trunk/ -t https://svn.corp.x.com:8080/svn/x/Ontology/trunk/
EOF
}

verify_install() {
    rm -rf OntologyTrunk
	svn co $REPO OntologyTrunk
	cd OntologyTrunk
	mvn install
	cd ..
}

release() {
    rm -rf OntologyTrunkForTagging
	svn co --trust-server-cert  --non-interactive $REPO OntologyTrunkForTagging
	cd OntologyTrunkForTagging
	set +x 
	mvn --batch-mode release:prepare -Dusername=$SVN_USER -Dpassword=$SVN_PASS
	set -x
	cd ..
}

build_deploy() {
	rm -rf OntologyTrunkTagged
	str=`svn --trust-server-cert  --non-interactive log $TAGBASE --limit 1| grep ontology`
	tag=${str##*ontology-}
	RELEASE_TAG_URL=https://svn.corp.x.com:8080/svn/x/Ontology/tags/ontology-$tag
	svn co $RELEASE_TAG_URL OntologyTrunkTagged
	cd OntologyTrunkTagged
	mvn install deploy
	cd ..
}

while getopts u:p:hrt OPTION
do
     case $OPTION in
         h)
             usage
             exit 1
             ;;
         u)
             SVN_USER=$OPTARG
             ;;
         p)
             SVN_PASS=$OPTARG
             ;;
         r)
             REPO=$OPTARG
             ;;
         t)
             TAGBASE=$OPTARG
             ;;
         ?)
             usage
             exit 1
             ;;
     esac
done

if [[ -z "$SVN_USER" ]] || [[ -z "$SVN_PASS" ]]
then
     usage
     exit 1
fi

if [[ -z "$REPO" ]]
then
	REPO=https://svn.corp.x.com:8080/svn/x/Ontology/trunk/
fi

if [[ -z "$TAGBASE" ]]
then
	TAGBASE=https://svn.corp.x.com:8080/svn/x/Ontology/tags/
fi

set -xe
verify_install
release
build_deploy

