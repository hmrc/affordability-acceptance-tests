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

package uk.gov.hmrc.test.ui.stepdefs.other

import uk.gov.hmrc.test.ui.pages._
import uk.gov.hmrc.test.ui.pages.journey.ssttp.{HowManyMonthsPage, HowMuchEachMonthPaymentPage, StartPage, UpfrontPaymentPage, WhatDayOfMonthPage}
import uk.gov.hmrc.test.ui.pages.support.HelperFunctions
import uk.gov.hmrc.test.ui.pages.testonly.TestOnlyStartPage
import uk.gov.hmrc.test.ui.testdata.{Language, ScenarioContext}

class CommonSteps extends Steps with DriverActions {

  Given("""^A user logs in and gets to the About your bank account page$""") { () =>
    TestOnlyStartPage.createUserAndLogin()
    StartPage.clickStartNow()
    continue()
    UpfrontPaymentPage.selectRadio("no")
    next()
    HowMuchEachMonthPaymentPage.enterAmount("500")
    continue()
    WhatDayOfMonthPage.enterDayOfMonth("28")
    next()
    HowManyMonthsPage.enterAmountOfMonths("6")
    next()
    continue()
  }

  Given("""^A user logs in and clicks link to the (.*)$""") { (page: String) =>
    TestOnlyStartPage.createUserAndGoToPage(page)
  }

  And("""^the user clicks (start|continue|next|continue_button|back|browser back)$""") { (action: String) =>
    action match {
      case "start" => StartPage.clickStartNow()
      //TODO sort out a standard for continue button ids! grr multiple id's used in Frontend code.
      case "continue" => continue()
      case "next" => next()
      case "continue_button" => continueButton()
      case "back" => back()
      case "browser back" => browserBack()
    }
  }

  When("""^the User toggles on (Welsh|English) language$""") { option: String =>
    if (option == "Welsh") {
      HelperFunctions.toggleLangOn(Language.welsh)
      ScenarioContext.set("langToggle", Language.welsh)
    } else {
      HelperFunctions.toggleLangOn(Language.english)
      ScenarioContext.set("langToggle", Language.english)
    }
  }

  Given("""^the user is created and logs in$""") { () =>
    TestOnlyStartPage.createUserAndLogin()
  }

}
