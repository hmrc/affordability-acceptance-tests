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

object AddSpendingPage extends BasePage {

  val url: String = s"${testConfig.selfServiceTimeToPayFrontendUrl}/monthly-spending"

  def housing: WebElement = id("housing").webElement
  def pension: WebElement = id("pension-contributions").webElement
  def councilTax: WebElement = id("council-tax").webElement
  def utilities: WebElement = id("utilities").webElement
  def debtRepayments: WebElement = id("debt-repayments").webElement
  def travel: WebElement = id("travel").webElement
  def childcare: WebElement = id("childcare").webElement
  def insurance: WebElement = id("insurance").webElement
  def groceries: WebElement = id("groceries").webElement
  def health: WebElement = id("health").webElement

  def expectedPageTitle = {
    if (langToggle == Language.welsh) "Eich gwariant misol - Trefnu cynllun talu - GOV.UK"
    else "Your monthly spending - Set up a Self Assessment payment plan - GOV.UK"
  }

  def expectedPageHeader = {
    if (langToggle == Language.welsh) "Eich gwariant misol"
    else "Your monthly spending"
  }

  def expectedPageTitleError: String = "Error: " + expectedPageTitle

  def pageContent: String = id("main-content").webElement.getText

    def assertContent(): Assertion =  {
      if (langToggle == Language.welsh) pageContent should be(WelshContent.addSpendingContent())
      else pageContent should be(EnglishContent.addSpendingContent())
    }

  def enterHousing(input: String): Unit = housing.sendKeys(input)
  def enterPension(input: String): Unit = pension.sendKeys(input)
  def enterCouncilTax(input: String): Unit = councilTax.sendKeys(input)
  def enterUtilities(input: String): Unit = utilities.sendKeys(input)
  def enterDebtRepayments(input: String): Unit = debtRepayments.sendKeys(input)
  def enterTravel(input: String): Unit = travel.sendKeys(input)
  def enterChildcare(input: String): Unit = childcare.sendKeys(input)
  def enterInsurance(input: String): Unit = insurance.sendKeys(input)
  def enterGroceries(input: String): Unit = groceries.sendKeys(input)
  def enterHealth(input: String): Unit = health.sendKeys(input)

  def clearHousing(): Unit = housing.clear()
  def clearPension(): Unit = pension.clear()
  def clearCouncilTax(): Unit = councilTax.clear()
  def clearUtilities(): Unit = utilities.clear()
  def clearDebtRepayments(): Unit = debtRepayments.clear()
  def clearTravel(): Unit = travel.clear()
  def clearChildcare(): Unit = childcare.clear()
  def clearInsurance(): Unit = insurance.clear()
  def clearGroceries(): Unit = groceries.clear()
  def clearHealth(): Unit = health.clear()

  def clearSpendingDetails(): Unit = {
    clearHousing()
    clearPension()
    clearCouncilTax()
    clearUtilities()
    clearDebtRepayments()
    clearTravel()
    clearChildcare()
    clearInsurance()
    clearGroceries()
    clearHealth()
  }

  def enterAllSpendingDetails(value: String): Unit = {
    enterHousing(value)
    enterPension(value)
    enterCouncilTax(value)
    enterUtilities(value)
    enterDebtRepayments(value)
    enterTravel(value)
    enterChildcare(value)
    enterInsurance(value)
    enterGroceries(value)
    enterHealth(value)
  }

}
