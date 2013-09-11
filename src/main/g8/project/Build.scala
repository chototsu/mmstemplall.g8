import sbt._
import Keys._
import android.Keys._
import android.Dependencies.{apklib,aar}

object HelloBuild extends Build {
  lazy val root = Project(id = "root",
    base = file(".")) aggregate(common, androidProject, pc)

    lazy val androidProject = Project(id = "android-project" ,
    base = file("android")) dependsOn(common)

  lazy val pc = Project(id = "pc" ,
    base = file("pc")) dependsOn(common)

  lazy val common = Project(id = "common" ,
    base = file("common"))
}
