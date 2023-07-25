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

import uk.gov.hmrc.test.ui.pages.BasePage
import uk.gov.hmrc.test.ui.testdata.Language
import uk.gov.hmrc.test.ui.utils.Configuration.testConfig

object CheckPaymentPlanPage extends BasePage {

  val url: String = s"${testConfig.selfServiceTimeToPayFrontendUrl}/calculator/payment-summary"

  def expectedPageTitle = {
    if (langToggle == Language.welsh) "Gwiriwch fanylion eich amserlen talu - Trefnu cynllun talu - GOV.UK"
    else "Check your payment plan - Set up a Self Assessment payment plan - GOV.UK"
  }

  def expectedPageHeader = {
    if (langToggle == Language.welsh) "Gwiriwch fanylion eich amserlen talu"
    else "Check your payment plan"
  }

  def expectedPageTitleError: String = "Error: " + expectedPageTitle

  def pageContent: String = id("main-content").webElement.getText

  //  def assertContent(): Assertion =  {
  //    if (langToggle == Language.welsh) pageContent should be(WelshContent.accountOnFilePageText())
  //    else pageContent should be(EnglishContent.accountOnFilePageText())
  //  }

  def clickChangeLink(link: String) = {
    link match {
      case "Upfront Payment" => cssSelector("#instalment-summary-list > div:nth-child(1) > dd.govuk-summary-list__actions > a").webElement.click()
      case "Collected On" => cssSelector("#instalment-summary-list > div:nth-child(2) > dd.govuk-summary-list__actions > a").webElement.click()
      case "Monthly Payment" => cssSelector("#instalment-summary-list > div:nth-child(3) > dd.govuk-summary-list__actions > a").webElement.click()
    }
  }

}
