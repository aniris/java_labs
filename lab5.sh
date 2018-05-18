#!/bin/sh

cd ./lab5

if [ ! -d 'bin' ];\
	then mkdir 'bin';\
fi

javac -d bin src/*.java
java -classpath bin lab5.Lab5 $1

cd ..
