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

object TermsAndConditionsPage extends BasePage {

  val url: String = s"${testConfig.selfServiceTimeToPayFrontendUrl}/arrangement/terms-and-conditions"

  def expectedPageTitle = {
    if (langToggle == Language.welsh) "Telerau ac amodau - Trefnu cynllun talu - GOV.UK"
    else "Terms and conditions - Set up a Self Assessment payment plan - GOV.UK"
  }
  def expectedPageHeader = {
    if (langToggle == Language.welsh) "Telerau ac amodau"
    else "Terms and conditions"
  }

  def expectedPageTitleError: String = "Error: " + expectedPageTitle

  def pageContent: String = id("main-content").webElement.getText

  def warningMessage: String = cssSelector("#content > div.govuk-warning-text > strong").webElement.getText

  def postalAddress: String = cssSelector("#content > div:nth-child(4) > pre").webElement.getText

  def assertContent(): Assertion =  {
    if (langToggle == Language.welsh) pageContent should be(WelshContent.termsAndConditionsContent())
    else pageContent should be(EnglishContent.termsAndConditionsContent())
  }

}
