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

package uk.gov.hmrc.test.ui.stepdefs.pages.ssttp

import uk.gov.hmrc.test.ui.pages.journey.ssttp.{HowManyMonthsPage, HowMuchEachMonthPaymentPage, SuccessConfirmationPage, UpfrontPaymentPage, WhatDayOfMonthPage}
import uk.gov.hmrc.test.ui.stepdefs.other.{DriverActions, Steps}


class OldSsttpStepDef extends Steps with DriverActions {

  Given("""^the user clicks (yes|no) on the (.*) page$""") { (option: String, page: String) =>
    page match {
      case "upfront payment" => UpfrontPaymentPage.selectRadio(option)
    }
  }

  When("""^the user enters (.*) on the (.*) page$""") { (value: String, page: String) =>
    page match {
      case "how much can you afford each month" => HowMuchEachMonthPaymentPage.enterAmount(value)
      case "what day of the month" => WhatDayOfMonthPage.enterDayOfMonth(value)
      case "how many months" => HowManyMonthsPage.enterAmountOfMonths(value)
    }
  }

  When("""^the submission has been successful$""") { () =>
    SuccessConfirmationPage.summaryBoxDisplayed()
  }

}
