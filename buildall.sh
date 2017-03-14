#! /usr/bin/env bash

echo "Script is runing"
echo "project path: $(pwd)"
echo "OS: $OSTYPE"
echo "$(ls -a)"
echo "$HOME"
echo ""

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
