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

object HowManyMonthsPage extends BasePage {

  val url: String = s"${testConfig.selfServiceTimeToPayFrontendUrl}/calculator/instalments"

  def expectedPageTitle = {
    if (langToggle == Language.welsh) "Dros sawl mis yr hoffech dalu? - Trefnu cynllun talu - GOV.UK"
    else "How many months do you want to pay over? - Set up a Self Assessment payment plan - GOV.UK"
  }

  def expectedPageHeader = {
    if (langToggle == Language.welsh) "Dros sawl mis yr hoffech dalu?"
    else "How many months do you want to pay over?"
  }

  def expectedPageTitleError: String = "Error: " + expectedPageTitle

  def pageContent: String = id("main-content").webElement.getText

  //  def assertContent(): Assertion =  {
  //    if (langToggle == Language.welsh) pageContent should be(WelshContent.accountOnFilePageText())
  //    else pageContent should be(EnglishContent.accountOnFilePageText())
  //  }

  def enterAmountOfMonths(amount: String) = {
    //TODO Ask devs to change id's to percentages rather than calculated values as the change all the time
    amount match {
      case "12" => id("250.0").webElement.click()
      case "10" => id("300.0").webElement.click()
      case "8" => id("400.0").webElement.click()
    }
  }


}
