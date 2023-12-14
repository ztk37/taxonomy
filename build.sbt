ThisBuild / version := "0.0.0-SNAPSHOT"
ThisBuild / organization := "dev.ztk"
ThisBuild / scalaVersion := "3.3.1"

lazy val root = project
  .in(file("."))
  .settings(name := "taxonomy")
