#!/bin/bash

##########################################################################
## This script is to automate ontology/xocl/incubator release process   ##
## It will perform following steps                                      ##
## 1. verify compilation                                                ##
## 2. Tag for release                                                   ##
## 3. build and deploy release to nexus                                 ##
## Assumes svn/maven installation and maven credentials                 ##
## to be set for deployment. If unsure run using Jenkins                ##
##########################################################################

usage()
{
cat << EOF
usage: $0 [options]

OPTIONS:
   -h      show this message   
   -u      svn userid
   -p      svn password
   -r      can be either of ontology/xocl/xocl-incubator
Example: $0 -u johndoe -p secret -r xocl
EOF
}

verify_install() {
    rm -rf "${PROJ}_trunk"
	svn co $REPO/trunk "${PROJ}_trunk"
	cd "${PROJ}_trunk"
	mvn install
	cd ..
}

release() {
    rm -rf "${PROJ}_trunk_for_tagging"
	svn co --trust-server-cert  --non-interactive $REPO/trunk "${PROJ}_trunk_for_tagging"
	cd "${PROJ}_trunk_for_tagging"
	set +x 
	mvn --batch-mode release:prepare -Dusername=$SVN_USER -Dpassword=$SVN_PASS
	set -x
	cd ..
}

build_deploy() {	
	str=`svn --trust-server-cert --non-interactive ls $REPO/tags| sort -V | tail -1`
	tag="${str%?}"
	RELEASE_TAG_URL="${REPO}/tags/${tag}"	
	rm -rf "${PROJ}_trunk_tagged"
	svn co $RELEASE_TAG_URL "${PROJ}_trunk_tagged"
	cd "${PROJ}_trunk_tagged"
	mvn install deploy
	cd ..
}

while getopts u:p:r:h OPTION
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
             PROJ=$OPTARG
             ;;
         ?)
             usage
             exit 1
             ;;
     esac
done

ONTOLOGY="ontology"
XOCL="xocl"
INCUBATOR="xocl-incubator"

if [[ -z "$SVN_USER" ]] || [[ -z "$SVN_PASS" ]] || [[ -z "$PROJ" ]]
then
     usage
     exit 1
fi

if [[ "$PROJ" != "ontology" ]] && [[ "$PROJ" != "xocl" ]] && [[ "$PROJ" != "xocl-incubator" ]]
then
	usage
	exit 1
fi
set -xe
declare -A repo
repo=( ["ontology"]="https://svn.corp.x.com:8080/svn/x/Ontology" ["xocl"]="https://svn.corp.x.com:8080/svn/x/xocl" ["xocl-incubator"]="https://svn.corp.x.com:8080/svn/x/xocl")
REPO="${repo["${PROJ}"]}"
verify_install
release
build_deploy

