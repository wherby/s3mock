set SCRIPT_DIR=%~dp0
java -Xms512M -Xmx1024M -XX:MaxMetaspaceSize=256m -jar "%SCRIPT_DIR%sbt-launch.jar" %*