package org.danielnixon.settings

import sbt._

object Scoverage extends GeneratedFilesIgnorer {
  override protected def ignoreSettingsUnsafe: IgnoreSettings = new IgnoreSettings {

    override def projectSettings: Seq[Setting[_]] = {
      Seq(scoverage.ScoverageKeys.coverageExcludedPackages := "controllers.javascript*;controllers.ref*;router*")
    }

    override def plugin: AutoPlugin = scoverage.ScoverageSbtPlugin
  }
}
