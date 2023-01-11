package uk.gov.hmrc.test.ui.stepdefs.pages.affordability

import uk.gov.hmrc.test.ui.pages.journey.affordability.CheckYouCanAffordPage
import uk.gov.hmrc.test.ui.pages.journey.ssttp.WhatDayOfMonthPage
import uk.gov.hmrc.test.ui.stepdefs.other.{DriverActions, Steps}

class AffordabilityPagesStepDef extends Steps with DriverActions {

  //TEMPORARY WHILE AFFORDABILITY PAGES ARE BEING BUILT
  When("""^the user expands on Check you can afford page$""") { () =>
    CheckYouCanAffordPage.clickExpandLink()
  }



}