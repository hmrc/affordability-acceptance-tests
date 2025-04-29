import com.timushev.sbt.updates.UpdatesKeys.{dependencyUpdates, dependencyUpdatesFailBuild, dependencyUpdatesFilter}
import com.timushev.sbt.updates.UpdatesPlugin.autoImport.moduleFilterRemoveValue
import sbt.Keys.*
import sbt.{moduleFilter, *}

object SbtUpdatesSettings {

  lazy val sbtUpdatesSettings = Seq(
    dependencyUpdatesFailBuild := true,
    (Compile / compile) := ((Compile / compile) dependsOn dependencyUpdates).value,
    dependencyUpdatesFilter -= moduleFilter("org.scala-lang"),
    dependencyUpdatesFilter -= moduleFilter("com.typesafe.play"),
//     later versions result in this error:
//     ---
//     java.lang.UnsupportedClassVersionError: com/vladsch/flexmark/util/ast/Node has been
//     compiled by a more recent version of the Java Runtime (class file version 55.0), this
//     version of the Java Runtime only recognizes class file versions up to 52.0
//     ---
    dependencyUpdatesFilter -= moduleFilter("com.vladsch.flexmark", "flexmark-all")
  )

}
