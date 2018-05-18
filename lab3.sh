#!/bin/sh

cd ./lab3

if [ ! -d 'bin' ];\
	then mkdir 'bin';\
fi

javac -d bin src/Lab3.java
java -classpath bin Lab3 $1 $2

cd ..
