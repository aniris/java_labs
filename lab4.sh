#!/bin/sh

cd ./lab4

if [ ! -d 'bin' ];\
	then mkdir 'bin';\
fi

javac -d bin src/Lab4.java
java -classpath bin Lab4 $1

cd ..
