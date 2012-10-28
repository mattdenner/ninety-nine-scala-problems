import sbt._
import sbt.Keys._

object NinetyNineScalaProblemsBuild extends Build {

  lazy val ninetyNineScalaProblems = Project(
    id = "ninety-nine-scala-problems",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "Ninety Nine Scala Problems",
      organization := "com.denner",
      version := "0.1-SNAPSHOT",
      scalaVersion := "2.9.2",
      // add other settings here
      libraryDependencies ++= Seq(
        "org.specs2" %% "specs2" % "1.12.2" % "test"
      ),
      resolvers ++= Seq(
        "snapshots" at "http://oss.sonatype.org/content/repositories/snapshots",
        "releases"  at "http://oss.sonatype.org/content/repositories/releases"
      )
    )
  )
}
