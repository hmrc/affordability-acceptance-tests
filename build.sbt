credentials += Credentials(Path.userHome / ".sbt" / ".credentials")

lazy val testSuite            = (project in file("."))
  .disablePlugins(JUnitXmlReportPlugin) //Required to prevent https://github.com/scalatest/scalatest/issues/1427
  .settings(
      name := "affordability-acceptance-tests",
      version := "0.1.0",
      scalaVersion := "3.6.4",
      scalacOptions ++= Seq("-feature"),
      Test / testOptions := Seq.empty,
      libraryDependencies ++= Dependencies.test
      //The testOptions from SbtAutoBuildPlugin supports only ScalaTest. Resetting testOptions for Cucumber Tests.
  )
  .settings(SbtUpdatesSettings.sbtUpdatesSettings: _*)