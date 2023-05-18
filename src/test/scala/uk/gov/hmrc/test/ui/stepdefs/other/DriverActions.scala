/*
 * Copyright 2022 HM Revenue & Customs
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

import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.support.ui.{ExpectedCondition, WebDriverWait}
import org.openqa.selenium.support.ui.ExpectedConditions.{urlToBe, visibilityOfElementLocated}
import org.openqa.selenium.{By, JavascriptExecutor, WebDriver, WebElement}
import org.scalatest.selenium.WebBrowser
import uk.gov.hmrc.test.ui.testdata.{Language, ScenarioContext}
import uk.gov.hmrc.webdriver.SingletonDriver

import java.time.Duration
import java.util.concurrent.TimeUnit

trait DriverActions extends WebBrowser {

  implicit def driver: WebDriver = {
    val options = new ChromeOptions
    options.addArguments("--remote-allow-origins=*")
    val runZap = sys.props.getOrElse("zapBrowser", "false").toBoolean
    if (runZap) SingletonDriver.getInstance(Some(options))
    else SingletonDriver.getInstance(Some(options))
  }

  def back(): Unit = click on id("back-link")

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
