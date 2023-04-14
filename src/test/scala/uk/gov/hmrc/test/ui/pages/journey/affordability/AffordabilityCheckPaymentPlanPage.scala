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

object AffordabilityCheckPaymentPlanPage extends BasePage {

  val url: String = s"${testConfig.selfServiceTimeToPayFrontendUrl}/arrangement/check-your-payment-plan"

  def expectedPageTitle = {
    if (langToggle == Language.welsh) "Gwirio’ch cynllun talu - Trefnu cynllun talu - GOV.UK"
    else "Check your payment plan - Set up a Self Assessment payment plan - GOV.UK"
  }

  def expectedPageHeader = {
    if (langToggle == Language.welsh) "Gwirio’ch cynllun talu"
    else "Check your payment plan"
  }

  def expectedPageTitleError: String = "Error: " + expectedPageTitle

  def pageContent: String = id("main-content").webElement.getText

  def assertContentNoUpfront(): Assertion =  {
    expandSchedule()
    if (serviceType == "Legacy")
      if (langToggle == Language.welsh) pageContent should be(WelshContent.checkYouPaymentPlanContentNoUpfrontLegacy())
      else pageContent should be(EnglishContent.checkYouPaymentPlanContentNoUpfrontLegacy())
    else
      if (langToggle == Language.welsh) pageContent should be(WelshContent.checkYouPaymentPlanContentNoUpfront())
      else pageContent should be(EnglishContent.checkYouPaymentPlanContentNoUpfront())
    }

//  def assertContentWithUpfront(): Assertion = {
//    expandSchedule()
//    if (serviceType == "Legacy")
//      if (langToggle == Language.welsh) pageContent should be(WelshContent.checkYouPaymentPlanContentNoUpfrontLegacy())
//      else pageContent should be(EnglishContent.checkYouPaymentPlanContentNoUpfront())
//    else
//      if (langToggle == Language.welsh) pageContent should be(WelshContent.checkYouPaymentPlanContentNoUpfrontLegacy())
//      else pageContent should be(EnglishContent.checkYouPaymentPlanContentNoUpfront())
//  }

  def clickChangeLink(link: String) = {
    link match {
      case "Upfront Payment Yes No" => id("upfront-payment").webElement.click()
      case "Upfront Payment Amount" => id("upfront-payment-amount").webElement.click()
      case "Collected On" => id("collection-day").webElement.click()
      case "Monthly Payment" => id("monthly-payment").webElement.click()
    }
  }

  def expandSchedule(): Unit ={
    cssSelector("#content > details > summary > span").webElement.click()
  }

  def warningText(): Unit = {
    def text: String = cssSelector("#content > div > strong").webElement.getText

    if (langToggle == Language.welsh) text should be("Warning\nRydych yn dewis cynllun talu lle mae’ch taliadau misol dros hanner eich incwm sydd dros ben. Gwnewch yn siŵr eich bod yn gallu fforddio talu.")
    else text should be("Warning\nYou are choosing a payment plan where your monthly payments are over half of your left over income. Make sure you can afford to pay.")
  }

}
