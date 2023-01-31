package uk.gov.hmrc.test.ui.stepdefs.pages.affordability

import uk.gov.hmrc.test.ui.pages.journey.affordability.{AddIncomeAndSpendingPage, AddIncomePage, AddSpendingPage}
import uk.gov.hmrc.test.ui.stepdefs.other.{DriverActions, Steps}

class AffordabilityPagesStepDef extends Steps with DriverActions {

  And("""^the user clicks on the add (income|spending) link$""") { (link: String) =>
    AddIncomeAndSpendingPage.clicksLink(link)
  }

  And("""^the user adds monthly income of (.*), benefits of (.*) and other income of (.*)$""") { (monthly: String, benefit: String, other: String) =>
    AddIncomePage.enterIncomeDetails(monthly,benefit,other)
  }

  And("""^the user adds monthly spending of (.*) to all fields$""") { (amount: String) =>
    AddSpendingPage.enterAllSpendingDetails(amount)
  }
}