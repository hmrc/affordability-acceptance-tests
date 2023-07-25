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

object TaxLiabilitiesPage extends BasePage {

  val url: String = s"${testConfig.selfServiceTimeToPayFrontendUrl}/calculator/tax-liabilities"

  def expectedPageTitle = {
    if (langToggle == Language.welsh) "Mae’ch bil treth Hunanasesiad yn dod i gyfanswm o £3,012.55 - Trefnu cynllun talu - GOV.UK"
    else "Your Self Assessment tax bill is £3,012.55 - Set up a Self Assessment payment plan - GOV.UK"
  }
  def expectedPageHeader = {
    if (langToggle == Language.welsh) "Mae’ch bil treth Hunanasesiad yn dod i gyfanswm o £3,012.55"
    else "Your Self Assessment tax bill is £3,012.55"
  }

  def expectedPageTitleError: String = "Error: " + expectedPageTitle

  def expandLink(): Unit = {
    cssSelector("#content > details > summary > span").webElement.click()
  }

  def pageContent: String = id("main-content").webElement.getText

  def assertContent(): Assertion =  {
    expandLink()
    if (langToggle == Language.welsh) pageContent should be(WelshContent.taxLiabilitiesContent())
    else pageContent should be(EnglishContent.taxLiabilitiesContent())
  }


}
