set MAVEN_OPTS=-Xmx512M -XX:MaxPermSize=512M

call mvn install -DskipTests

date /T
pause
