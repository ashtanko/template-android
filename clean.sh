#! /usr/bin/env bash

function scan(){
	echo "$1"
for f in $1/*; do
if [ -d $f ]; then
echo "$f"
fi
done
}

scan $(pwd)
