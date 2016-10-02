set MAVEN_OPTS=-Xmx512M -XX:MaxPermSize=512M

call mvn -U clean install -DskipTests

date /T
pause
