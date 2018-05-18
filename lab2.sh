#!/bin/sh

cd ./Lab2

if [ ! -d 'bin' ];\
	then mkdir 'bin';\
fi

javac -d bin src/*.java
java -classpath bin lab2.Lab2 $1

cd ..
