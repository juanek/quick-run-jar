#!/bin/bash

#export JAVA_HOME=/usr/lib/jvm/java-1.8.0-openjdk-amd64
#export PATH=$JAVA_HOME/bin:$PATH

java -jar target/${artifactId}.jar "$@"
