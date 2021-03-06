import Dependencies._

ThisBuild / scalaVersion := "2.13.3"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.github.anshulbajpai"
ThisBuild / organizationName := "anshulbajpai"

lazy val root = (project in file("."))
  .settings(name := "$name$", libraryDependencies += scalaTest % Test)

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.

wartremoverErrors ++= Warts.unsafe
scalafmtOnCompile := true
