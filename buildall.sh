#! /usr/bin/env bash

function build() {
	echo "build project $1"
	cd $1 && chmod +x ./gradlew && ./gradlew build
}

function scan() {
	for f in $1/*; do
		if [ -d $f ]; then
			if [ -f $f/gradlew ]; then
				build $f
			fi
		fi
	done
}

scan $(pwd)