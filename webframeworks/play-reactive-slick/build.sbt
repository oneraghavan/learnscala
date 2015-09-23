name := """play-reactive-slick"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.4"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws,
  "com.typesafe.slick" %% "slick"      % "3.0.0-RC1",
  "postgresql"          % "postgresql" % "9.1-901.jdbc4",
  "com.fasterxml.jackson.module" % "jackson-module-scala_2.11" % "2.6.0-1"
)


fork in run := true