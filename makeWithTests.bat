set MAVEN_OPTS=-Xmx512M -XX:MaxPermSize=512M

call mvn clean install -Dmaven.test.failure.ignore=true

date /T
pause
