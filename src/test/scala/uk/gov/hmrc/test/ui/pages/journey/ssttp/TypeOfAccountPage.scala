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

package uk.gov.hmrc.test.ui.pages.journey.ssttp

import org.openqa.selenium.WebElement
import org.scalatest.Assertion
import uk.gov.hmrc.test.ui.pages.BasePage
import uk.gov.hmrc.test.ui.pages.content.{EnglishContent, WelshContent}
import uk.gov.hmrc.test.ui.testdata.Language
import uk.gov.hmrc.test.ui.utils.Configuration.testConfig

object TypeOfAccountPage extends BasePage {

  val url: String = s"${testConfig.selfServiceTimeToPayFrontendUrl}/arrangement/about-your-bank-account"

  def businessRadio: WebElement = id("typeOfAccount").webElement

  def personalRadio: WebElement = id("typeOfAccount-2").webElement

  def accountHolderYes: WebElement = id("isSoleSignatory").webElement

  def accountHolderNo: WebElement = id("isSoleSignatory-2").webElement

  def expectedPageTitle = {
    if (langToggle == Language.welsh) "Ynglŷn â’ch cyfrif banc - Trefnu cynllun talu - GOV.UK"
    else "About your bank account - Set up a Self Assessment payment plan - GOV.UK"
  }

  def expectedPageHeader = {
    if (langToggle == Language.welsh) "Ynglŷn â’ch cyfrif banc"
    else "About your bank account"
  }

  def expectedPageTitleError: String = "Error: " + expectedPageTitle

  def pageContent: String = id("main-content").webElement.getText

  def assertContent(): Assertion = {
    if (langToggle == Language.welsh) pageContent should be(WelshContent.aboutBankAccountContent())
    else pageContent should be(EnglishContent.aboutBankAccountContent())
  }


  def clickRadio(accountType: String): Unit = {
    accountType match {
      case "business" => businessRadio.click()
      case "personal" => personalRadio.click()
      case "no bank account type" =>
    }
  }

  def clickAccountHolder(holder: String): Unit = {
    holder match {
      case "is" => accountHolderYes.click()
      case "isn't" => accountHolderNo.click()
      case "no selection for" =>
    }
  }
}
