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

import org.openqa.selenium.WebElement
import uk.gov.hmrc.test.ui.pages.BasePage
import uk.gov.hmrc.test.ui.testdata.Language
import uk.gov.hmrc.test.ui.utils.Configuration.testConfig

object UpfrontPaymentPage extends BasePage {

  val url: String = s"${testConfig.selfServiceTimeToPayFrontendUrl}/calculator/payment-today-question"

  def yesButton: WebElement = id("paytoday-true").webElement
  def noButton: WebElement = id("paytoday-false").webElement

  def expectedPageTitle = {
    if (langToggle == Language.welsh) "A allwch wneud taliad ymlaen llaw? - Trefnu cynllun talu - GOV.UK"
    else "Can you make an upfront payment? - Set up a Self Assessment payment plan - GOV.UK"
  }
  def expectedPageHeader = {
    if (langToggle == Language.welsh) "A allwch wneud taliad ymlaen llaw?"
    else "Can you make an upfront payment?"
  }

  def expectedPageTitleError: String = "Error: " + expectedPageTitle

  def pageContent: String = id("main-content").webElement.getText

//  def assertContent(): Assertion =  {
//    if (langToggle == Language.welsh) pageContent should be(WelshContent.accountOnFilePageText())
//    else pageContent should be(EnglishContent.accountOnFilePageText())
//  }

  def selectRadio(option: String): Unit ={
    option match {
      case "yes" => yesButton.click()
      case "no" => noButton.click()
    }
  }


}
