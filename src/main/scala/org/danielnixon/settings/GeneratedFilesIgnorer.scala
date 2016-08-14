package org.danielnixon.settings

import sbt._

import scala.util.control.Exception._

abstract class GeneratedFilesIgnorer {

  protected def ignoreSettingsUnsafe: IgnoreSettings

  def ignoreSettings: Option[IgnoreSettings] = catching[IgnoreSettings](classOf[NoClassDefFoundError]) opt ignoreSettingsUnsafe
}

abstract class IgnoreSettings {
  def projectSettings: Seq[Setting[_]]

  def plugin: AutoPlugin
}