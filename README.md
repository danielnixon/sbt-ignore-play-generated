# sbt-ignore-play-generated

An SBT plugin that will configure other plugins to ignore Play's generated source files.

## Usage

Add the following to your `plugins.sbt`:

    ```scala
    addSbtPlugin("org.danielnixon" % "sbt-ignore-play-generated" % "0.1")
    ```

# Supported plugins

* [sbt-scalariform](https://github.com/sbt/sbt-scalariform)
* [sbt-scapegoat](https://github.com/sksamuel/sbt-scapegoat)
* [sbt-wartremover](https://github.com/puffnfresh/wartremover)
* [sbt-scoverage](https://github.com/scoverage/sbt-scoverage)