package uk.gov.hmrc.test.ui.stepdefs.pages.affordability

import uk.gov.hmrc.test.ui.pages.journey.affordability.{AddIncomeAndSpendingPage, AddIncomePage, AddSpendingPage, AffordabilityCheckPaymentPlanPage, CannotAgreePlanPage}
import uk.gov.hmrc.test.ui.stepdefs.other.{DriverActions, Steps}

class AffordabilityPagesStepDef extends Steps with DriverActions {

  And("""^the user clicks on the (.*) link$""") { (link: String) =>
    link match {
      case "add income" => AddIncomeAndSpendingPage.clicksLink(link)
      case "add spending" => AddIncomeAndSpendingPage.clicksLink(link)
      case "change income and spending" => CannotAgreePlanPage.clickChangeYourIncomeLink()
    }
  }

  And("""^the user adds monthly income of (.*), benefits of (.*) and other income of (.*)$""") { (monthly: String, benefit: String, other: String) =>
    AddIncomePage.enterIncomeDetails(monthly,benefit,other)
  }

  And("""^the user adds monthly spending of (.*) to all fields$""") { (amount: String) =>
    AddSpendingPage.enterAllSpendingDetails(amount)
  }

  And("""^the choosing more than 50 percent warning message shows$""") { () =>
    AffordabilityCheckPaymentPlanPage.warningText()
  }

}