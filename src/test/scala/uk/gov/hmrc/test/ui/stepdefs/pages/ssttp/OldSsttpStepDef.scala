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

package uk.gov.hmrc.test.ui.stepdefs.pages.ssttp

import uk.gov.hmrc.test.ui.pages.journey.affordability.{AffordabilityCheckPaymentPlanPage, HowManyMonthsPage}
import uk.gov.hmrc.test.ui.pages.journey.ssttp._
import uk.gov.hmrc.test.ui.stepdefs.other.DriverActions
import uk.gov.hmrc.test.ui.testdata.{BankDetails, ScenarioContext}


class OldSsttpStepDef extends DriverActions {

  Given("""^the user clicks (yes|no) on the (.*) page$""") { (option: String, page: String) =>
    page match {
      case "upfront payment" => UpfrontPaymentPage.selectRadio(option)
      case _ => throw new IllegalArgumentException(s"$page page not recognised")
    }
  }

  When("""^the user enters (.*) on the (.*) page$""") { (value: String, page: String) =>
    page match {
      case "how much can you afford each month" => HowMuchEachMonthPaymentPage.enterAmount(value)
      case "what day of the month" => WhatDayOfMonthPage.enterDayOfMonth(value)
      case "how many months" => HowManyMonthsPage.enterAmountOfMonths(value)
      case "upfront payment amount" => HowMuchUpfrontPaymentPage.enterAmount(value)
    }
  }

  When("""^the submission has been successful$""") { () =>
    SuccessConfirmationPage.summaryBoxDisplayed()
  }

  When("""^the user selects (business|personal|no bank account type) and (is|isn't|no selection for) the account holder on the About account page$""") { (accountType: String, holder: String) =>
    TypeOfAccountPage.clickRadio(accountType)
    TypeOfAccountPage.clickAccountHolder(holder)
  }

  When("""^the user clicks on the change (.*) link on the (.*)$""") { (element: String, page: String) =>
    page match {
      case "ConfirmDirectDebitDetailsPage" =>
        ConfirmDirectDebitDetailsPage.clickChangeLink(element)
      case "AffordabilityCheckPaymentPlanPage" =>
        AffordabilityCheckPaymentPlanPage.clickChangeLink(element)
      case _ =>
        println("Check page passed in step")
    }
  }

  When("""^the user enters (.*) bank details$""") { state: String =>
    ScenarioContext.set("bankDetails", state match {
      case "amended" => BankDetails.amendedAccount
      case "invalid" => BankDetails.invalidAccount
      case "invalidName" => BankDetails.invalidNameAccount
      case "indeterminate" => BankDetails.indeterminateAccount
      case "validBusiness" => BankDetails.businessAccount
      case "invalidBusiness" => BankDetails.invalidBusinessAccount
      case "invalidNameBusiness" => BankDetails.invalidBusinessNameAccount
      case "amendedBusiness" => BankDetails.amendedBusinessAccount
      case "indeterminateBusiness" => BankDetails.indeterminateBusinessAccount
      case "wellFormatted=No" => BankDetails.wellFormattedNoAccount
      case "supportsDirectDebit=No" => BankDetails.supportsDirectDebitNoAccount
      case "onEISCD=No" => BankDetails.onEISCDNoAccount
      case "denyList" => BankDetails.denyListAccount
      case "partialNameBusiness" => BankDetails.partialNameBusinessAccount
      case "partialName" => BankDetails.partialNameAccount
      case _ => BankDetails.validAccount
    })

    val bankDetails: BankDetails = ScenarioContext.get[BankDetails]("bankDetails")

    SetUpDirectDebitPage.enterBankDetails(bankDetails)
  }


  When("""^an empty form is submitted$""") { () =>
    continue()
  }


  When("""^the conditional sentence for Upfront payment is displayed$""") { () =>
    SuccessConfirmationPage.assertUpfrontPaymentSentence()
  }


  When("""^the user clicks View your payment plan$""") { () =>
    SuccessConfirmationPage.viewPlanText.click()
    waitForPageToLoad()
    ViewPaymentPlanPage.assertCurrentPageHeader()
  }

}
