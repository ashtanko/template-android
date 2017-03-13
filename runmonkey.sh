#! /usr/bin/env bash

function run() {
	if which adb >/dev/null; then
		echo "enter an app package name"
		read -r packagename
		echo "enter pseudo-random events count, example 500"
		read -r count
		adb shell monkey -p $packagename -v $count
	else
		echo "Error: adb does not exist"
		exit 1
	fi
}

run
