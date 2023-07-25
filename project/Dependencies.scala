import sbt._

object Dependencies {

  val test: Seq[ModuleID] = Seq(
    "org.scalatest"           %% "scalatest"            % "3.2.16",
    "org.scalatestplus"       %% "selenium-4-9"         % "3.2.16.0",
    "org.seleniumhq.selenium"  % "selenium-java"        % "4.8.1",
    "io.cucumber"             %% "cucumber-scala"       % "8.16.0",
    "io.cucumber"              % "cucumber-junit"       % "7.13.0",
    "uk.gov.hmrc"             %% "webdriver-factory"    % "0.45.0",
    "com.novocode"             %  "junit-interface"     % "0.11",
    "org.mongodb.scala"       %% "mongo-scala-driver"   % "2.7.0"
  ).map(_ % Test)

}