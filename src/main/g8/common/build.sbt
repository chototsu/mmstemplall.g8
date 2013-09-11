import android.Keys._
import android.Dependencies.{apklib,aar}

name := "$name$Common"

version := "0.1-SNAPSHOT"

organization := "$organization$"

scalaVersion := "$scalaVersion$"

javacOptions in compile ++= Seq("-source", "1.6",  "-target", "1.6")

javacOptions in doc ++= Seq("-source", "1.6")

fork in run := true

resolvers += Resolver.url("mmstestrepo",url("https://raw.github.com/chototsu/testrepo/master/ivy2/")) ( Patterns(false,"[organisation]/[module]/[revision]/[type]s/[artifact].[ext]") )

libraryDependencies += "info.projectkyoto" % "mikumikustudio-lib" % "0.2-SNAPSHOT" % "provided->android"

libraryDependencies += "info.projectkyoto" % "mmstestdata" % "0.1-SNAPSHOT"

libraryDependencies ++= Seq(
  "com.typesafe" %% "scalalogging-slf4j" % "1.0.1",
  "org.slf4j" % "slf4j-api" % "1.7.5",
  "ch.qos.logback" % "logback-classic" % "1.0.13"
)

exportJars := true

