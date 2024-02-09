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

package uk.gov.hmrc.test.ui.stepdefs.pages.affordability

import uk.gov.hmrc.test.ui.pages.journey.affordability.{AddIncomeAndSpendingPage, AddIncomePage, AddSpendingPage, AffordabilityCheckPaymentPlanPage, CannotAgreePlanPage, DirectDebitAssistancePage, DirectDebitErrorPage}
import uk.gov.hmrc.test.ui.stepdefs.other.DriverActions

class AffordabilityPagesStepDef extends DriverActions {

  And("""^the user clicks on the (.*) link$""") { (link: String) =>
    link match {
      case "add income" => AddIncomeAndSpendingPage.clicksLink(link)
      case "add spending" => AddIncomeAndSpendingPage.clicksLink(link)
      case "change income and spending" => CannotAgreePlanPage.clickChangeYourIncomeLink()
    }
  }

  And("""^the user adds monthly income of (.*), benefits of (.*) and other income of (.*)$""") { (monthly: String, benefit: String, other: String) =>
    AddIncomePage.enterIncomeDetails(monthly, benefit, other)
  }

  And("""^the user adds monthly spending of (.*) to all fields$""") { (amount: String) =>
    AddSpendingPage.enterAllSpendingDetails(amount)
  }

  And("""^the choosing more than 50 percent warning message shows$""") { () =>
    AffordabilityCheckPaymentPlanPage.warningText()
  }

  When("""^there is an error with direct debit setup (assistance|error)$""") { (tyype: String) =>
    tyype match {
      case "assistance" => goTo(DirectDebitAssistancePage.url)
      case "error" => goTo(DirectDebitErrorPage.url)
    }
  }

}