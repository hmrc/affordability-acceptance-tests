package uk.gov.hmrc.test.ui.stepdefs.pages.affordability

import uk.gov.hmrc.test.ui.pages.journey.affordability.AddIncomeAndSpendingPage
import uk.gov.hmrc.test.ui.stepdefs.other.{DriverActions, Steps}

class AffordabilityPagesStepDef extends Steps with DriverActions {

  And("""^the user clicks on the add (income|spending) link$""") { (link: String) =>
    AddIncomeAndSpendingPage.clicksLink(link)
  }

}