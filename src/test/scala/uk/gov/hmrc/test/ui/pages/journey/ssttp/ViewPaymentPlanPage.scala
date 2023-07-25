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

import org.scalatest.Assertion
import uk.gov.hmrc.test.ui.pages.BasePage
import uk.gov.hmrc.test.ui.pages.content.{EnglishContent, WelshContent}
import uk.gov.hmrc.test.ui.testdata.Language
import uk.gov.hmrc.test.ui.utils.Configuration.testConfig
import uk.gov.hmrc.test.ui.utils.Configuration.serviceType

object ViewPaymentPlanPage extends BasePage {

  val url: String = s"${testConfig.selfServiceTimeToPayFrontendUrl}/arrangement/view-payment-plan"

  def expectedPageTitle: String = {
    if (langToggle == Language.welsh) "Eich cynllun talu - Trefnu cynllun talu - GOV.UK"
    else "Your payment plan - Set up a Self Assessment payment plan - GOV.UK"
  }

  def expectedPageHeader: String = {
    if (langToggle == Language.welsh) "Eich cynllun talu"
    else "Your payment plan"
  }

  def pageContent: String = id("main-content").webElement.getText

  def expectedPageTitleError: String = "Error: " + expectedPageTitle

  def assertContent(): Assertion = {
    if (serviceType == "Legacy")
      if (langToggle == Language.welsh) pageContent should be(WelshContent.viewPaymentPlanContentLegacy())
      else pageContent should be(EnglishContent.viewPaymentPlanContentLegacy())
    else
      if (langToggle == Language.welsh) pageContent should be(WelshContent.viewPaymentPlanContent())
      else pageContent should be(EnglishContent.viewPaymentPlanContent())
  }

}
