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
package uk.gov.hmrc.test.ui.pages.journey.affordability

import org.openqa.selenium.WebElement
import org.scalatest.Assertion
import uk.gov.hmrc.test.ui.pages.BasePage
import uk.gov.hmrc.test.ui.pages.content.{EnglishContent, WelshContent}
import uk.gov.hmrc.test.ui.testdata.Language
import uk.gov.hmrc.test.ui.utils.Configuration.testConfig

object AddIncomeAndSpendingPage extends BasePage {

  val url: String = s"${testConfig.selfServiceTimeToPayFrontendUrl}/add-income-spending"

  def addIncomeLink: WebElement = id("monthly-income").webElement
  def addSpendingLink: WebElement = cssSelector("li:nth-child(2) > span > a").webElement

  def expectedPageTitle = {
    if (langToggle == Language.welsh) "Ychwanegu eich incwm a’ch gwariant - Trefnu cynllun talu - GOV.UK"
    else "Add your income and spending - Set up a Self Assessment payment plan - GOV.UK"
  }

  def expectedPageHeader = {
    if (langToggle == Language.welsh) "Ychwanegu eich incwm a’ch gwariant"
    else "Add your income and spending"
  }

  def expectedPageTitleError: String = "Error: " + expectedPageTitle

  def pageContent: String = id("main-content").webElement.getText

  def assertContentBlank(): Assertion = {
    if (langToggle == Language.welsh) pageContent should be(WelshContent.addIncomeAndSpendingContentBlank())
    else pageContent should be(EnglishContent.addIncomeAndSpendingContentBlank())
  }

  def clicksLink(link: String): Unit = {
    link.toLowerCase() match {
      case "income" => click on addIncomeLink
      case "spending" => click on addSpendingLink
    }
  }

}
