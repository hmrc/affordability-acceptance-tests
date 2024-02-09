/*
 * Copyright 2023 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.gov.hmrc.test.ui.stepdefs.other

import java.time.Duration
import java.util.concurrent.TimeUnit
import org.openqa.selenium.support.ui.ExpectedConditions.{urlToBe, visibilityOfElementLocated}
import org.openqa.selenium.support.ui.{ExpectedCondition, WebDriverWait}
import org.openqa.selenium.{By, WebDriver, WebElement}
import org.scalatestplus.selenium.WebBrowser
import uk.gov.hmrc.test.ui.testdata.{Language, ScenarioContext}
import com.typesafe.scalalogging.LazyLogging
import io.cucumber.scala.{EN, ScalaDsl}
import org.scalatest.concurrent.Eventually
import org.scalatest.matchers.should.Matchers
import uk.gov.hmrc.selenium.webdriver.Driver

trait DriverActions extends ScalaDsl with EN with WebBrowser with LazyLogging with Eventually with Matchers {

  implicit lazy val driver: WebDriver = Driver.instance

  def navigateTo(url: String): Unit = Driver.instance.navigate().to(url)

  def back(): Unit = click on cssSelector("div.js-visible > a")

  def continue(): Unit = click on id("continue")

  def langToggle: String = ScenarioContext.getOrElse[String]("langToggle", Language.english)

  def signOut(): Unit = {
    //click on id("homeNavHref")
    if (langToggle == "cy") click on linkText("Allgofnodi")
    else if (langToggle == "en") click on linkText("Sign out")
  }

  def browserBack(): Unit = driver.navigate().back()

  def waitFor[T](condition: ExpectedCondition[T]): T = {
    val wait = new WebDriverWait(driver, Duration.ofSeconds(10))
    wait.until(condition)
  }

  def waitForRedirect(url: String): Boolean = waitFor(urlToBe(url))

  def waitForPageToLoad(): WebElement = waitFor(visibilityOfElementLocated(By.tagName("body")))

  def waitForMillis(time: Int): Unit = TimeUnit.MILLISECONDS.sleep(time)
}
