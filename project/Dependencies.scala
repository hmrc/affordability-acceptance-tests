import sbt._

object Dependencies {

  val test = Seq(
    "com.typesafe" % "config" % "1.4.6" % Test,
    "com.vladsch.flexmark" % "flexmark-all" % "0.64.8" % Test,
    "org.scalatest" %% "scalatest" % "3.2.19" % Test,
    "org.scalatestplus" %% "selenium-4-2" % "3.2.13.0" % Test,
    "io.cucumber" %% "cucumber-scala" % "8.39.1" % Test,
    "io.cucumber" % "cucumber-junit" % "7.34.3" % Test,
    "junit" % "junit" % "4.13.2" % Test,
    "uk.gov.hmrc" %% "ui-test-runner" % "0.53.0" % Test,
    "com.novocode" % "junit-interface" % "0.11" % Test,
    "io.cucumber" % "cucumber-picocontainer" % "7.24.0" % Test,
    "org.playframework" %% "play-json" % "3.0.6" % Test,
    ("org.mongodb.scala" %% "mongo-scala-driver" % "5.5.1").cross(CrossVersion.for3Use2_13)
  )

}
