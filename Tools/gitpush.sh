#!/bin/bash

####################################################################
## This script is to automate push from svn to git                ##
## It will perform following steps                                ##
## 1. Use svn2git to initialize local git repository from svn     ##
## 2. Configure git account                                       ##
## 3. Provide remote repository for git                           ##
## 4. Sync (pull/push)                                            ##
## 5. Create tag of choice                                        ##
## Assumes svn/maven installation and maven credentials           ##
## to be set for deployment. If unsure run using Jenkins          ##
####################################################################

usage()
{
cat << EOF
usage: $0 [options]

OPTIONS:
   -h      show this message  
   -r      project bame (ontology/xocl/xocl-incubator)
   -t      git tag name    
   -u      git userid
   -m      git user email
   -n      git user name
   -k      git keyfile path
Example: $0 -u johndoe -m johndoe@x.com -n "John Doe" -r ontology -t release22
EOF
}

init_git() {	
	svn2git $SVN_REPO --verbose
	git tag
}

configure_git() {
	git config user.name $GIT_USER_NAME
	git config user.email $GIT_USER_EMAIL
	git config github.user $GIT_USER	
}

configure_ssh() {
	rm -rf ~/tmpssh
	mkdir ~/tmpssh
	cat $GIT_USER_KEYFILE_PATH >> ~/tmpssh/id_rsa
	chmod 600 ~/tmpssh/id_rsa
	mv ~/.ssh/config ~/.ssh/config_old
	echo "Host github.com" >> ~/.ssh/config
	echo "  IdentityFile ~/tmpssh/id_rsa" >> ~/.ssh/config
}

reset_ssh_config() {
	rm -rf ~/.ssh/config
	mv ~/.ssh/config_old ~/.ssh/config
}

git_sync() {
	git remote add origin $GIT_REPO
	git pull origin master
	git push origin master
	git push origin $GIT_TAG	
}

while getopts r:t:u:k:m:n:h OPTION
do
     case $OPTION in
         h)
             usage
             exit 1
             ;;
         r)
             PROJ=$OPTARG
             ;;
         t)
             GIT_TAG=$OPTARG
             ;;
         u)
             GIT_USER=$OPTARG
             ;;
         m)
             GIT_USER_EMAIL=$OPTARG
             ;;
         n)
             GIT_USER_NAME=$OPTARG
             ;;
         k)
             GIT_USER_KEYFILE_PATH=$OPTARG
             ;;
         ?)
             usage
             exit 1
             ;;
     esac
done
shift $(($OPTIND - 1))

if [[ -z "$GIT_TAG" ]] || [[ -z "$PROJ" ]] || [[ -z "$GIT_USER" ]] || [[ -z "$GIT_USER_EMAIL" ]] || [[ -z "$GIT_USER_NAME" ]] || [[ -z "$GIT_USER_KEYFILE_PATH" ]]
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
declare -A svn_repos
svn_repos=( ["ontology"]="https://svn.corp.x.com:8080/svn/x/Ontology" ["xocl"]="https://svn.corp.x.com:8080/svn/x/xocl" ["xocl-incubator"]="https://svn.corp.x.com:8080/svn/x/xocl")
SVN_REPO="${svn_repos["${PROJ}"]}"

declare -A git_repos
git_repos=( ["ontology"]="git@github.com:xcommerce/X.commerce-Contracts" ["xocl"]="git@github.com:xcommerce/XOCL" ["xocl-incubator"]="git@github.com:xcommerce/XOCL")
GIT_REPO="${git_repos["${PROJ}"]}"

configure_ssh
rm -rf gitsync
mkdir gitsync
cd gitsync
init_git
configure_git
git_sync
cd ..
reset_ssh_config
