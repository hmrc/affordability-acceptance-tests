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

package uk.gov.hmrc.test.ui.pages.testonly

import uk.gov.hmrc.test.ui.pages.BasePage
import uk.gov.hmrc.test.ui.pages.support.HelperFunctions
import uk.gov.hmrc.test.ui.testdata.Language
import uk.gov.hmrc.test.ui.utils.Configuration.testConfig

object TestOnlyStartPage extends BasePage {

  val url: String = s"${testConfig.selfServiceTimeToPayFrontendUrl}/test-only/inspector"

  def expectedPageTitle = "TBC"

  def expectedPageHeader = "TBC"

  def expectedPageTitleError: String = "Error: " + expectedPageTitle

  def createUserAndLogin(): Unit = {
    go to TestOnlyStartPage.url
    waitForPageToLoad()
    linkText("clear play session").webElement.click()
    linkText("create user and log in").webElement.click()
    waitForPageToLoad()
    cssSelector("#content > form > button").webElement.click()
    go to "http://localhost:9063/pay-what-you-owe-in-instalments"
  }

  def createUserAndGoToPage(page: String): Unit ={
    go to TestOnlyStartPage.url
    waitForPageToLoad()
    linkText("clear play session").webElement.click()
    linkText("create user and log in").webElement.click()
    waitForPageToLoad()
    //TODO test data setup for each scenario / kickout eligibility
//    page match {
//      case "NeedToFilePage" =>
//      case "CallUsNotEligiblePage" =>
//      case "CallUsNotEnrolledPage" =>
//      case "CallUsDebtTooLargePage" =>
//      case "CallUsDebtTooOldPage" =>
    cssSelector("#content > form > button").webElement.click()
    //TODO remove once test data is setup for scenarios instead of shortcuts
    page match {
      case "NeedToFilePage" => cssSelector("#content > ul:nth-child(9) > li:nth-child(13) > a").webElement.click()
      case "CallUsNotEligiblePage" => cssSelector("#content > ul:nth-child(9) > li:nth-child(14) > a").webElement.click()
      case "CallUsNotEnrolledPage" => cssSelector("#content > ul:nth-child(9) > li:nth-child(15) > a").webElement.click()
      case "CallUsDebtTooLargePage" => cssSelector("#content > ul:nth-child(9) > li:nth-child(16) > a").webElement.click()
      case "CallUsDebtTooOldPage" => cssSelector("#content > ul:nth-child(9) > li:nth-child(17) > a").webElement.click()
      case "CallUsAlreadyHavePlanPage" =>
        click on linkText("create user and log in")
        click on id("hasExistingDirectDebit")
        click on cssSelector("#content > form > button")
        click on cssSelector("#content > ul:nth-child(9) > li:nth-child(1) > a")
        click on id("start-now")
    }
  }

  def languageToEnglish(): Unit = {
    go to TestOnlyStartPage.url
    HelperFunctions.toggleLangOn(Language.english)
  }

}
