#!/bin/sh

cd ./Lab1

if [ ! -d 'bin' ];\
	then mkdir 'bin';\
fi

javac -d bin src/Lab1.java
java -classpath bin Lab1 $1 $2 $3

cd ..