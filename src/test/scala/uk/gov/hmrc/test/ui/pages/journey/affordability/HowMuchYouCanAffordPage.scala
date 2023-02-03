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

object HowMuchYouCanAffordPage extends BasePage {

  val url: String = s"${testConfig.selfServiceTimeToPayFrontendUrl}/how-much-you-could-afford"

  def addIncomeLink: WebElement = id("monthly-income").webElement
  def addSpendingLink: WebElement = id("monthly-spending").webElement

  def expectedPageTitle = {
    if (langToggle == Language.welsh) "Faint y gallech ei fforddio - Trefnu cynllun talu - GOV.UK"
    else "How much you could afford - Set up a Self Assessment payment plan - GOV.UK"
  }

  def expectedPageHeader = {
    if (langToggle == Language.welsh) "Faint y gallech ei fforddio"
    else "How much you could afford"
  }

  def expectedPageTitleError: String = "Error: " + expectedPageTitle

  def pageContent: String = id("main-content").webElement.getText

  def conditionalParagraph: String = cssSelector("#content > h2").webElement.getText + "\n" + cssSelector("#content > p").webElement.getText

  def assertContentHappy(): Assertion = {
    if (langToggle == Language.welsh) pageContent should be(WelshContent.howMuchYouCouldAffordFullHappy())
    else pageContent should be(EnglishContent.howMuchYouCouldAffordFullHappy())
  }

  def assertContentSpendingMoreThanIncome(): Assertion = {
    if (langToggle == Language.welsh) conditionalParagraph should be(WelshContent.spendingMoreThanIncomeText())
    else conditionalParagraph should be(EnglishContent.spendingMoreThanIncomeText())
  }

  def assertContentSpendingSameAsIncome(): Assertion = {
    if (langToggle == Language.welsh) conditionalParagraph should be(WelshContent.spendingSameAsIncomeText())
    else conditionalParagraph should be(EnglishContent.spendingSameAsIncomeText())
  }

  def clicksLink(link: String): Unit = {
    link.toLowerCase() match {
      case "income" => click on addIncomeLink
      case "spending" => click on addSpendingLink
    }
  }

}
