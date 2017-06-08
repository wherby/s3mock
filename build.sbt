name := "s3mockforwindows"

version := "0.2.5"

organization := "io.findify"

scalaVersion := "2.11.7"

crossScalaVersions := Seq("2.11.7", "2.12.2")

val akkaVersion = "2.5.1"

licenses := Seq("MIT" -> url("https://opensource.org/licenses/MIT"))

homepage := Some(url("https://github.com/findify/s3mock"))

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-stream" % akkaVersion,
  "com.typesafe.akka" %% "akka-http" % "10.0.6",
  "com.typesafe.akka" %% "akka-stream-testkit" % akkaVersion % "test",
  "org.scala-lang.modules" %% "scala-xml" % "1.0.6",
  "com.github.pathikrit" %% "better-files" % "2.17.1",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.5.0",
  "com.amazonaws" % "aws-java-sdk-s3" % "1.11.133",
  "org.scalatest" %% "scalatest" % "3.0.3" % "test",
  "ch.qos.logback" % "logback-classic" % "1.2.3" % "test",
  "org.iq80.leveldb" % "leveldb" % "0.9",
  "com.lightbend.akka" %% "akka-stream-alpakka-s3" % "0.8" % "test"
)

parallelExecution in Test := false

publishMavenStyle := true

publishTo := {
  val nexus = "https://art-bobcat.autodesk.com/"
  if (isSnapshot.value)
    Some("Snapshots" at nexus + "artifactory/snapshots")
  else
    Some("Release" at nexus + "artifactory/releases")
}

/*
pomExtra := (
    <scm>
      <url>git@github.com:findify/s3mock.git</url>
      <connection>scm:git:git@github.com:findify/s3mock.git</connection>
    </scm>
    <developers>
      <developer>
        <id>romangrebennikov</id>
        <name>Roman Grebennikov</name>
        <url>http://www.dfdx.me</url>
      </developer>
    </developers>)*/
