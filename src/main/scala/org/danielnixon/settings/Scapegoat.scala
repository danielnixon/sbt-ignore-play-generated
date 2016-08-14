package org.danielnixon.settings

import sbt._

object Scapegoat extends GeneratedFilesIgnorer {
  override protected def ignoreSettingsUnsafe: IgnoreSettings = new IgnoreSettings {
    import com.sksamuel.scapegoat.sbt.ScapegoatSbtPlugin.autoImport.scapegoatIgnoredFiles
    override def projectSettings: Seq[Setting[_]] = {
      Seq(
        scapegoatIgnoredFiles := Seq(
          ".*/Routes.scala",
          ".*/JavaScriptReverseRoutes.scala",
          ".*/RoutesPrefix.scala",
          ".*/ReverseRoutes.scala"
        )
      )
    }

    override def plugin: AutoPlugin = com.sksamuel.scapegoat.sbt.ScapegoatSbtPlugin
  }
}
