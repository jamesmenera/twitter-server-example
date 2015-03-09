import NativePackagerKeys._

enablePlugins(JavaAppPackaging)

name := "sample"

version := "1.0"

scalaVersion := "2.10.5"

resolvers += "twttr" at "http://maven.twttr.com/"

libraryDependencies ++= Seq(
  "com.twitter" % "finagle-http_2.10" % "6.24.0",
  "com.twitter" % "twitter-server_2.10" % "1.9.0",
  "org.postgresql" % "postgresql" % "9.4-1201-jdbc41"
)
