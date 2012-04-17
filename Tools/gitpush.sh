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
usage: $0 [required-options] [optional-options]

OPTIONS:
   -h      show this message  
   -l      svn url <optional>
   -r      git url <optioanl>
   -t      git tag name    
   -u      git userid <optional>
   -m      git user email <optional>
   -n      git user name <optional>
   -k      git keyfile path <optional>
Example: $0 -u johndoe -m johndoe@x.com -l https://svn.corp.x.com:8080/svn/x/Ontology -r git@github.com:xcommerce/X.commerce-Contracts -t release22
EOF
}

SVN_REPO=https://svn.corp.x.com:8080/svn/x/Ontology/trunk/
GIT_REPO=git@github.com:xcommerce/X.commerce-Contracts
GIT_USER=rumale
GIT_USER_EMAIL=rumale@x.com
GIT_USER_NAME=Ramashri Umale
GIT_USER_KEYFILE_PATH=~/tmp/ontology/id_rsa

while getopts l:r:t:k:humnk OPTION
do
     case $OPTION in
         h)
             usage
             exit 1
             ;;
         l)
             SVN_REPO=$OPTARG
             ;;
         r)
             GIT_REPO=$OPTARG
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

if [[ -z "$GIT_TAG" ]] || 
then
     usage
     exit 1
fi

init_git{
	rm -rf gitsync
	mkdir gitsync
	cd gitsync
	svn2git $SVN_REPO --verbose
	git tag
	cd ..
}

configure_git{
	git config user.name $GIT_USER_NAME
	git config user.email $GIT_USER_EMAIL
	git config github.user $GIT_USER	
}

configure_ssh{
	rm -rf ~/tmpssh
	mkdir ~/tmpssh
	cat $GIT_USER_KEYFILE_PATH >> ~/tmpssh/id_rsa
	mv ~/.ssh/config ~/.ssh/config_old
	echo "Host github.com" >> ~/.ssh/config
	echo "  IdentityFile ~/tmpssh/id_rsa" >> ~/.ssh/config
}

reset_ssh_config{
	rm -rf ~/.ssh/config
	mv ~/.ssh/config_old ~/.ssh/config
}

git_sync{
	cd gitsync
	git remote add origin $GIT_REPO
	git pull origin master
	git push origin master
	git push origin tag $GIT_TAG	
	cd ..
}
set -xe
configure_ssh
init_git
configure_git
git_sync
reset_ssh_config
