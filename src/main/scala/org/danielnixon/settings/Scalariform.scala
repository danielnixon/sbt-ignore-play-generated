package org.danielnixon.settings

import sbt._
import sbt.Keys._

object Scalariform extends GeneratedFilesIgnorer {
  override protected def ignoreSettingsUnsafe: IgnoreSettings = new IgnoreSettings {
    override def projectSettings: Seq[Setting[_]] = {
      import com.typesafe.sbt.SbtScalariform.autoImport.scalariformFormat
      Seq(
        excludeFilter in scalariformFormat := (excludeFilter in scalariformFormat).value ||
          "Routes.scala" ||
          "ReverseRoutes.scala" ||
          "JavaScriptReverseRoutes.scala" ||
          "RoutesPrefix.scala"
      )
    }

    override def plugin: AutoPlugin = com.typesafe.sbt.SbtScalariform
  }
}
