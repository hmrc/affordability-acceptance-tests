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

import org.scalatest.Assertion
import uk.gov.hmrc.test.ui.pages.BasePage
import uk.gov.hmrc.test.ui.pages.content.{EnglishContent, WelshContent}
import uk.gov.hmrc.test.ui.testdata.Language
import uk.gov.hmrc.test.ui.utils.Configuration.{serviceType, testConfig}

object HowManyMonthsPage extends BasePage {

  val url: String = s"${testConfig.selfServiceTimeToPayFrontendUrl}/calculator/instalments"

  def expectedPageTitle = {
    if (langToggle == Language.welsh) "Faint y gallwch ei dalu bob mis? - Trefnu cynllun talu - GOV.UK"
    else "How much can you pay each month? - Set up a Self Assessment payment plan - GOV.UK"
  }

  def expectedPageHeader = {
    if (langToggle == Language.welsh) "Faint y gallwch ei dalu bob mis?"
    else "How much can you pay each month?"
  }

  def expectedPageTitleError: String = "Error: " + expectedPageTitle

  def pageContent: String = id("main-content").webElement.getText

  def assertContent(): Assertion = {
    expandOtherAmount()
    expandLink()
    if (serviceType == "Legacy") {
      if (langToggle == Language.welsh) pageContent should be(WelshContent.howManyMonthsTextLegacy())
      else pageContent should be(EnglishContent.howManyMonthsTextLegacy())
    }
    else {
      if (langToggle == Language.welsh) pageContent should be(WelshContent.howManyMonthsText())
      else pageContent should be(EnglishContent.howManyMonthsText())
    }
  }

  def assertContentCustom(): Assertion = {
    expandOtherAmount()
    expandLink()
    if (serviceType == "Legacy") {
      if (langToggle == Language.welsh) pageContent should be(WelshContent.howManyMonthsCustomTextLegacy())
      else pageContent should be(EnglishContent.howManyMonthsCustomTextLegacy())
    }
    else {
      if (langToggle == Language.welsh) pageContent should be(WelshContent.howManyMonthsCustomText())
      else pageContent should be(EnglishContent.howManyMonthsCustomText())
    }
  }

  def enterAmountOfMonths(amount: String) = {
    amount match {
      case "50 percent" => id("basic").webElement.click()
      case "60 percent" => id("higher").webElement.click()
      case "80 percent" => id("additional").webElement.click()
      case "custom amount" => id("customAmountOption").webElement.click()
        id("custom-amount-input").webElement.sendKeys("300")
      case "user specified" => id("custom").webElement.click()
      case _ => id("customAmountOption").webElement.click()
        id("custom-amount-input").webElement.sendKeys(amount)
    }
  }

  def expandLink(): Unit = {
    click on cssSelector("#paymentTodayForm > details > summary > span")
  }

  def expandOtherAmount(): Unit = {
    id("customAmountOption").webElement.click()
  }


}
