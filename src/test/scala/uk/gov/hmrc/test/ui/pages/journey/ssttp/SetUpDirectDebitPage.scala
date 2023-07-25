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
import uk.gov.hmrc.test.ui.testdata.{BankDetails, Language}
import uk.gov.hmrc.test.ui.utils.Configuration.testConfig

object SetUpDirectDebitPage extends BasePage {

  val url: String = s"${testConfig.selfServiceTimeToPayFrontendUrl}/arrangement/direct-debit"

  def accountName: WebElement = id("accountName").webElement
  def sortCode: WebElement = id("sortCode").webElement
  def accountNumber: WebElement = id("accountNumber").webElement

  def expectedPageTitle = {
    if (langToggle == Language.welsh) "Trefnu Debyd Uniongyrchol - Trefnu cynllun talu - GOV.UK"
    else "Set up Direct Debit - Set up a Self Assessment payment plan - GOV.UK"
  }

  def expectedPageHeader = {
    if (langToggle == Language.welsh) "Trefnu Debyd Uniongyrchol"
    else "Set up Direct Debit"
  }

  def expectedPageTitleError: String = "Error: " + expectedPageTitle

  def pageContent: String = id("main-content").webElement.getText

    def assertContent(): Assertion =  {
      if (langToggle == Language.welsh) pageContent should be(WelshContent.setupDirectDebitContent())
      else pageContent should be(EnglishContent.setupDirectDebitContent())
    }

  def enterBankDetails(bankDetails: BankDetails): Unit = {
    accountName.sendKeys(bankDetails.name)
    sortCode.sendKeys(bankDetails.sortcode)
    accountNumber.sendKeys(bankDetails.accNumber)
  }

  def enterAccountName(input: String): Unit = accountName.sendKeys(input)
  def enterSortcode(input: String): Unit = sortCode.sendKeys(input)
  def enterAccountNumber(input: String): Unit = accountNumber.sendKeys(input)

  def clearAccountName(): Unit = accountName.clear()
  def clearSortcode(): Unit = sortCode.clear()
  def clearAccountNumber(): Unit = accountNumber.clear()

  def clearBankDetails(): Unit = {
    accountName.clear()
    sortCode.clear()
    accountNumber.clear()
  }

}
