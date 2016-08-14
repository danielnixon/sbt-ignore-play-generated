package org.danielnixon

import org.danielnixon.settings._
import play.sbt.PlayScala
import sbt._

object PlayIgnoreGenerated extends AutoPlugin {

  override def trigger: PluginTrigger = allRequirements

  override def requires: Plugins = {
    val allPlugins = PlayScala +: ignoreSettings.map(_.plugin)
    val plugin = allPlugins.reduceLeftOption[Plugins](_ && _)
    plugin.getOrElse(Plugins.empty)
  }

  override def projectSettings: Seq[Setting[_]] = ignoreSettings.flatMap(_.projectSettings)

  private def ignoreSettings: Seq[IgnoreSettings] = {
    val ignorers = Seq(Scalariform, Scapegoat, Scoverage, WartRemover)
    ignorers.flatMap(_.ignoreSettings)
  }
}
