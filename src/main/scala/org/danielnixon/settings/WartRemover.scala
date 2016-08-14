package org.danielnixon.settings

import sbt._

object WartRemover extends GeneratedFilesIgnorer {
  override protected def ignoreSettingsUnsafe: IgnoreSettings = new IgnoreSettings {
    import play.sbt.routes.RoutesKeys.routes
    import wartremover.WartRemover.autoImport.wartremoverExcluded

    override def projectSettings: Seq[Setting[_]] = {
      Seq(wartremoverExcluded ++= routes.in(Compile).value)
    }

    override def plugin: AutoPlugin = wartremover.WartRemover
  }
}
