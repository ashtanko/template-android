#! /usr/bin/env bash

if which adb >/dev/null; then
	adb shell monkey -p your.package.name -v 500
else
	echo "Error: adb does not exist"
exit 1
fi

function run() {
echo "run"
}

