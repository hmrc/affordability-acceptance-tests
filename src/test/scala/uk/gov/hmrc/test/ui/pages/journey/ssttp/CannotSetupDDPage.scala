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

object CannotSetupDDPage extends BasePage {

  val url: String = s"${testConfig.selfServiceTimeToPayFrontendUrl}/eligibility/not-sole-signatory"

  def phoneNumber: String = cssSelector("#content > p:nth-child(3) > strong > span").webElement.getText

  def expectedPageTitle = {
    if (langToggle == Language.welsh) "Ni allwch drefnu Debyd Uniongyrchol ar-lein - Trefnu cynllun talu - GOV.UK"
    else "You cannot set up a Direct Debit online - Set up a Self Assessment payment plan - GOV.UK"
  }

  def expectedPageHeader = {
    if (langToggle == Language.welsh) "Ni allwch drefnu Debyd Uniongyrchol ar-lein"
    else "You cannot set up a Direct Debit online"
  }

  def expectedPageTitleError: String = "Error: " + expectedPageTitle

  def pageContent: String = id("main-content").webElement.getText

    def assertContent(): Assertion =  {
      if (langToggle == Language.welsh) pageContent should be(WelshContent.cannotSetupDDContent())
      else pageContent should be(EnglishContent.cannotSetupDDContent())
    }

  def assertPhoneNumber(lang: String): Unit = {
    lang match {
      case "english" => phoneNumber should be("0300 123 1813")
      case "welsh" => phoneNumber should be("0300 200 1900")
    }
  }


}
