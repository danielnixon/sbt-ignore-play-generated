# sbt-ignore-play-generated

[![Build Status](https://travis-ci.org/danielnixon/sbt-ignore-play-generated.svg?branch=master)](https://travis-ci.org/danielnixon/sbt-ignore-play-generated)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.danielnixon/sbt-ignore-play-generated/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.danielnixon/sbt-ignore-play-generated)

An SBT plugin that will configure other plugins to ignore Play's generated source files.

Play generates Scala source code based on your routes definitions, which you typically won't want to include in coverage metrics,
static analysis (linters), etc. It can be annoying to configure such plugins to exclude Play's generated sources because they each
require slightly different configuration. This plugin takes care of it for you.

## Usage

Add the following to your `plugins.sbt`:

    ```scala
    addSbtPlugin("org.danielnixon" % "sbt-ignore-play-generated" % "0.1")
    ```

If you use any of the supported SBT plugins (below), they will now be configured to ignore Play's generated sources.

# Supported plugins

* [sbt-scalariform](https://github.com/sbt/sbt-scalariform)
* [sbt-scapegoat](https://github.com/sksamuel/sbt-scapegoat)
* [sbt-wartremover](https://github.com/puffnfresh/wartremover)
* [sbt-scoverage](https://github.com/scoverage/sbt-scoverage)
