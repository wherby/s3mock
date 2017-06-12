java -Dfile.encoding=UTF8 -Xmx1536M -Xss1M -XX:+CMSClassUnloadingEnabled -XX:MaxMetaspaceSize=256m -jar `dirname $0`/sbt-launch.jar "$@"
