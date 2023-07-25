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

package uk.gov.hmrc.test.ui.pages.journey.affordability

import org.openqa.selenium.WebElement
import org.scalatest.Assertion
import uk.gov.hmrc.test.ui.pages.BasePage
import uk.gov.hmrc.test.ui.pages.content.{EnglishContent, WelshContent}
import uk.gov.hmrc.test.ui.testdata.Language
import uk.gov.hmrc.test.ui.utils.Configuration.testConfig

object AddIncomePage extends BasePage {

  val url: String = s"${testConfig.selfServiceTimeToPayFrontendUrl}/monthly-income"

  def monthlyIncome: WebElement = id("monthlyIncome").webElement
  def benefits: WebElement = id("benefits").webElement
  def otherIncome: WebElement = id("otherIncome").webElement

  def expectedPageTitle: String = {
    if (langToggle == Language.welsh) "Eich incwm misol - Trefnu cynllun talu - GOV.UK"
    else "Your monthly income - Set up a Self Assessment payment plan - GOV.UK"
  }

  def expectedPageHeader: String = {
    if (langToggle == Language.welsh) "Eich incwm misol"
    else "Your monthly income"
  }

  def expectedPageTitleError: String = "Error: " + expectedPageTitle

  def pageContent: String = id("main-content").webElement.getText

    def assertContent(): Assertion =  {
      if (langToggle == Language.welsh) pageContent should be(WelshContent.addIncomeContent())
      else pageContent should be(EnglishContent.addIncomeContent())
    }

  def enterIncomeDetails(monthlyAmount: String, benefitAmount: String, otherAmount: String): Unit = {
    monthlyIncome.sendKeys(monthlyAmount)
    benefits.sendKeys(benefitAmount)
    otherIncome.sendKeys(otherAmount)
  }

  def enterMonthlyIncome(input: String): Unit = monthlyIncome.sendKeys(input)
  def enterBenefits(input: String): Unit = benefits.sendKeys(input)
  def enterOtherIncome(input: String): Unit = otherIncome.sendKeys(input)

  def clearMonthlyIncome(): Unit = monthlyIncome.clear()
  def clearBenefits(): Unit = benefits.clear()
  def clearOtherIncome(): Unit = otherIncome.clear()

  def clearIncomeDetails(): Unit = {
    monthlyIncome.clear()
    benefits.clear()
    otherIncome.clear()
  }

}
