name := """play-slick-quickstart"""

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.5" // or "2.10.4"

libraryDependencies ++= Seq(
  "com.typesafe.play" %% "play-slick" % "1.0.0",
  "com.typesafe.slick" %% "slick" % "3.0.0",
  "org.postgresql" % "postgresql" % "9.3-1103-jdbc4"
)

fork in Test := false

lazy val root = (project in file(".")).enablePlugins(PlayScala)

fork in run := true