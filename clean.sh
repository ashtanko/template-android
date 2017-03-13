#! /usr/bin/env bash

build_dir_count=0

function clean(){
	for f in $1/*; do
		if [ -d $f ]; then
			cd $f
			if [ -d $f/build ]; then
				let "build_dir_count = $build_dir_count + 1"
				echo "build dir is found this: $f"
			fi
		clean $f
		fi
	done
}

function scan(){
	for f in $1/*; do
		if [ -d $f ]; then
			clean $f
		fi
	done
}

scan $(pwd)
echo ""
echo "Result: build dir count: $build_dir_count"
