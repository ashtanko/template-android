#! /usr/bin/env bash

build_dir_count=0

function clean(){
	for f in $1/*; do
		if [ -d $f ]; then
			cd $f
			if [ -d $f/build ]; then
				let "build_dir_count = $build_dir_count + 1"
				echo "build dir was removed from: $f/build"
				rm -rf $f/build
			fi
		clean $f
		fi
	done
}

function cleanDependencies(){

echo "a" | grep -F -w "b"
echo $?

#   echo $1
# grep -r "Android" $1
}

function scan(){
	for f in $1/*; do
		if [ -d $f ]; then
            cleanDependencies $f
#clean $f
		fi
	done
}

scan $(pwd)
echo ""
echo "Result: build dir count: $build_dir_count"
