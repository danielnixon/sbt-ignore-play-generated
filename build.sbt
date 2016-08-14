sbtPlugin := true
organization := "org.danielnixon"
name := "sbt-ignore-play-generated"
version := "0.1-SNAPSHOT"
scalaVersion := "2.10.6"

scalacOptions ++= Seq(
  "-deprecation",
  "-feature",
  "-unchecked",
  "-Xfatal-warnings",
  "-Xlint",
  "-Ywarn-dead-code",
  "-Ywarn-inaccessible",
  "-Ywarn-value-discard",
  "-Ywarn-numeric-widen",
  "-Ywarn-nullary-override")

addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.5.4" % Provided)
addSbtPlugin("org.scalariform" % "sbt-scalariform" % "1.6.0" % Optional)
addSbtPlugin("com.sksamuel.scapegoat" % "sbt-scapegoat" % "1.0.4" % Optional)
addSbtPlugin("org.wartremover" % "sbt-wartremover" % "1.1.0" % Optional)
addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.3.5" % Optional)

import scalariform.formatter.preferences.{DoubleIndentClassDeclaration, PlaceScaladocAsterisksBeneathSecondAsterisk, _}

scalariformPreferences := scalariformPreferences.value
  .setPreference(DoubleIndentClassDeclaration, true)
  .setPreference(PlaceScaladocAsterisksBeneathSecondAsterisk, true)
