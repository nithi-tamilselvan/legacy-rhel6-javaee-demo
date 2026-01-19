#!/bin/bash
# Legacy RHEL6 style startup
export JAVA_HOME=/usr/lib/jvm/java-1.8.0
export PATH=$JAVA_HOME/bin:$PATH
java -jar legacy-rhel6-javaee-demo.jar