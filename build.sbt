sbtPlugin := true
organization := "org.danielnixon"
licenses := Seq("The Apache Software License, Version 2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0.txt"))
name := "sbt-ignore-play-generated"
version := "0.2-SNAPSHOT"
scalaVersion := "2.10.6"

publishMavenStyle := true
publishArtifact in Test := false
publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}
homepage := Some(url("https://github.com/danielnixon/sbt-ignore-play-generated"))
pomExtra := (
  <scm>
    <url>git@github.com:danielnixon/sbt-ignore-play-generated.git</url>
    <connection>scm:git:git@github.com:danielnixon/sbt-ignore-play-generated.git</connection>
  </scm>
    <developers>
      <developer>
        <id>danielnixon</id>
        <name>Daniel Nixon</name>
        <url>https://danielnixon.org/</url>
      </developer>
    </developers>)

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

addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.5.9" % Provided)
addSbtPlugin("org.scalariform" % "sbt-scalariform" % "1.6.0" % Optional)
addSbtPlugin("com.sksamuel.scapegoat" % "sbt-scapegoat" % "1.0.4" % Optional)
addSbtPlugin("org.wartremover" % "sbt-wartremover" % "1.2.1" % Optional)
addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.5.0" % Optional)

import scalariform.formatter.preferences.{DoubleIndentClassDeclaration, PlaceScaladocAsterisksBeneathSecondAsterisk, _}

scalariformPreferences := scalariformPreferences.value
  .setPreference(DoubleIndentClassDeclaration, true)
  .setPreference(PlaceScaladocAsterisksBeneathSecondAsterisk, true)

wartremoverErrors ++= Seq(
  Wart.Any,
  Wart.AsInstanceOf,
  Wart.IsInstanceOf,
  Wart.EitherProjectionPartial,
  Wart.Enumeration,
  Wart.Equals,
  Wart.ExplicitImplicitTypes,
  Wart.FinalCaseClass,
  Wart.JavaConversions,
  Wart.LeakingSealed,
  Wart.ListOps,
  Wart.MutableDataStructures,
  Wart.Nothing,
  Wart.Null,
  Wart.OptionPartial,
  Wart.Product,
  Wart.Return,
  Wart.Serializable,
  Wart.StringPlusAny,
  Wart.Throw,
  Wart.ToString,
  Wart.TryPartial,
  Wart.Var,
  Wart.While)