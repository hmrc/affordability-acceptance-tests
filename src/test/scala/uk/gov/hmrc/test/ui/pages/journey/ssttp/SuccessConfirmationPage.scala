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
package uk.gov.hmrc.test.ui.pages.journey.ssttp

import uk.gov.hmrc.test.ui.pages.BasePage
import uk.gov.hmrc.test.ui.testdata.Language
import uk.gov.hmrc.test.ui.utils.Configuration.testConfig

object SuccessConfirmationPage extends BasePage {

  val url: String = s"${testConfig.selfServiceTimeToPayFrontendUrl}/arrangement/summary"
  def summaryBox = cssSelector("#content > div.govuk-panel.govuk-panel--confirmation.govuk-\\!-display-none-print").webElement.getText

  def expectedPageTitle = {
    if (langToggle == Language.welsh) "Cais yn llwyddiannus - Trefnu cynllun talu - GOV.UK"
    else "Your payment plan is set up - Set up a Self Assessment payment plan - GOV.UK"
  }
  def expectedPageHeader = {
    if (langToggle == Language.welsh) "Cais yn llwyddiannus"
    else "Your payment plan is set up"
  }

  def expectedPageTitleError: String = "Error: " + expectedPageTitle

  def pageContent: String = id("main-content").webElement.getText

//  def assertContent(): Assertion =  {
//    if (langToggle == Language.welsh) pageContent should be(WelshContent.accountOnFilePageText())
//    else pageContent should be(EnglishContent.accountOnFilePageText())
//  }

  def summaryBoxDisplayed(): Unit ={
    summaryBox should be("Your payment plan is set up\nYour Direct Debit mandate reference:\nABCDabcd1234")
  }

}