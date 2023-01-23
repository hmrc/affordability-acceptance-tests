package uk.gov.hmrc.test.ui.stepdefs.pages.affordability

import uk.gov.hmrc.test.ui.pages.journey.affordability.{AddIncomeAndSpendingPage, AddIncomePage}
import uk.gov.hmrc.test.ui.stepdefs.other.{DriverActions, Steps}

class AffordabilityPagesStepDef extends Steps with DriverActions {

  And("""^the user clicks on the add (income|spending) link$""") { (link: String) =>
    AddIncomeAndSpendingPage.clicksLink(link)
  }

  And("""^the user adds monthly income of (.*), benefits of (.*) and other income of (.*)$""") { (monthly: String, benefit: String, other: String) =>
    AddIncomePage.enterIncomeDetails(monthly,benefit,other)
  }

}