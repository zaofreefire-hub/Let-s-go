#!/usr/bin/env sh

JAVA_CMD="java"

if [ -n "$JAVA_HOME" ] ; then
    JAVA_CMD="$JAVA_HOME/bin/java"
fi

exec "$JAVA_CMD" -jar "$(dirname "$0")/gradle/wrapper/gradle-wrapper.jar" "$@"
