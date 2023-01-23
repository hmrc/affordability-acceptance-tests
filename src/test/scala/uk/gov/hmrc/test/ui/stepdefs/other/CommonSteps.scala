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

import org.openqa.selenium.By
import org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated
import uk.gov.hmrc.test.ui.pages.journey.affordability.{AddIncomeAndSpendingPage, AddIncomePage, AddSpendingPage, CheckYouCanAffordPage}
import uk.gov.hmrc.test.ui.pages.journey.ssttp._
import uk.gov.hmrc.test.ui.pages.support.HelperFunctions
import uk.gov.hmrc.test.ui.pages.testonly.TestOnlyStartPage
import uk.gov.hmrc.test.ui.testdata.{Language, ScenarioContext}

class CommonSteps extends Steps with DriverActions {

  Given("""^A user logs in and gets to the How much can you pay upfront page$""") { () =>
    TestOnlyStartPage.createUserAndLogin()
    StartPage.clickStartNow()
    continue()
    UpfrontPaymentPage.selectRadio("yes")
    next()
  }

  Given("""^A user logs in and gets to the About your bank account page$""") { () =>
    TestOnlyStartPage.createUserAndLogin()
    StartPage.clickStartNow()
    continue()
    UpfrontPaymentPage.selectRadio("no")
    next()
    WhatDayOfMonthPage.enterDayOfMonth("28")
    next()
    HowManyMonthsPage.enterAmountOfMonths("2")
    next()
    continue()
  }

  Given("""^A user logs in and gets to the affordability pages$""") { () =>
    TestOnlyStartPage.createUserAndLogin()
    StartPage.clickStartNow()
    continue()
    UpfrontPaymentPage.selectRadio("no")
    next()
    WhatDayOfMonthPage.enterDayOfMonth("28")
    WhatDayOfMonthPage.clickAffordability()
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

  Given("""^the language toggle is reset to English$""") { () =>
    TestOnlyStartPage.languageToEnglish()
  }

  And("""^the user is on the (.*)$""") { page: String =>
    page match {
      case "StartPage" =>
        StartPage.startShouldBeLoaded()
        StartPage.assertContent()
      case "TaxLiabilitiesPage" =>
        TaxLiabilitiesPage.shouldBeLoaded()
        TaxLiabilitiesPage.assertContent()
      case "CannotSetupDDPage" =>
        CannotSetupDDPage.shouldBeLoaded()
        CannotSetupDDPage.assertContent()
      case "TypeOfAccountPage" =>
        //        TypeOfAccountPage.shouldBeLoaded()
        TypeOfAccountPage.assertContent()
      case "SetUpDirectDebitPage" =>
        SetUpDirectDebitPage.shouldBeLoaded()
        SetUpDirectDebitPage.assertContent()
      case "TermsAndConditionsPage" =>
        //        TermsAndConditionsPage.shouldBeLoaded()
        TermsAndConditionsPage.assertContent()
      case "ConfirmDirectDebitDetailsPage" =>
        ConfirmDirectDebitDetailsPage.shouldBeLoaded()
        ConfirmDirectDebitDetailsPage.assertContentSlim()
      case "SuccessConfirmationPage" =>
        SuccessConfirmationPage.shouldBeLoaded()
        SuccessConfirmationPage.assertContent()
      case "CallUsNotEligiblePage" =>
        CallUsNotEligiblePage.shouldBeLoaded()
        CallUsNotEligiblePage.assertContent()
      case "CallUsNotEnrolledPage" =>
        CallUsNotEnrolledPage.shouldBeLoaded()
        CallUsNotEnrolledPage.assertContent()
      case "CallUsDebtTooLargePage" =>
        CallUsDebtTooLargePage.shouldBeLoaded()
        CallUsDebtTooLargePage.assertContent()
      case "NeedToFilePage" =>
        NeedToFilePage.shouldBeLoaded()
        NeedToFilePage.assertContent()
      case "ViewPaymentPlanPage" =>
        ViewPaymentPlanPage.shouldBeLoaded()
        ViewPaymentPlanPage.assertContent()
      case "UpfrontPaymentPage" =>
        //        UpfrontPaymentPage.shouldBeLoaded()
        UpfrontPaymentPage.assertContent()
      case "PaymentSummaryPage" =>
        UpfrontSummaryPage.shouldBeLoaded()
        UpfrontSummaryPage.assertContent()
      case "UpfrontPaymentAmountPage" =>
        HowMuchUpfrontPaymentPage.shouldBeLoaded()
        HowMuchUpfrontPaymentPage.assertContent()
      case "WhatDayOfMonthPage" =>
        //        WhatDayOfMonthPage.shouldBeLoaded()
        WhatDayOfMonthPage.assertContent()
      case "CheckYouCanAffordPage" =>
        CheckYouCanAffordPage.shouldBeLoaded()
        CheckYouCanAffordPage.assertContent()
      case "AddIncomeAndSpendingPageBlank" =>
//        AddIncomeAndSpendingPage.shouldBeLoaded()
        AddIncomeAndSpendingPage.assertContentBlank()
      case "AddIncomePage" =>
        AddIncomePage.shouldBeLoaded()
        AddIncomePage.assertContent()
      case "AddSpendingPage" =>
        AddSpendingPage.shouldBeLoaded()
        AddSpendingPage.assertContent()
    }
  }

  When("""^the user enters (.*) into the (.*) field$""") { (input: String, field: String) =>
    def field1: String = field.toLowerCase

    input match {
      case "none" => field1 match {
        case "account name" => SetUpDirectDebitPage.clearAccountName()
        case "sortcode" => SetUpDirectDebitPage.clearSortcode()
        case "account number" => SetUpDirectDebitPage.clearAccountNumber()
        case "amount" => HowMuchUpfrontPaymentPage.clearAmount()
        case "monthly income" => AddIncomePage.clearMonthlyIncome()
        case "benefits" => AddIncomePage.clearBenefits()
        case "other income" => AddIncomePage.clearOtherIncome()
      }
      case _ =>
        field1 match {
          case "account name" =>
            SetUpDirectDebitPage.clearAccountName()
            SetUpDirectDebitPage.enterAccountName(input)
          case "sortcode" =>
            SetUpDirectDebitPage.clearSortcode()
            SetUpDirectDebitPage.enterSortcode(input)
          case "account number" =>
            SetUpDirectDebitPage.clearAccountNumber()
            SetUpDirectDebitPage.enterAccountNumber(input)
          case "amount" =>
            HowMuchUpfrontPaymentPage.clearAmount()
            HowMuchUpfrontPaymentPage.enterAmount(input)
          case "monthly income" =>
            AddIncomePage.clearMonthlyIncome()
            AddIncomePage.enterMonthlyIncome(input)
          case "benefits" =>
            AddIncomePage.clearBenefits()
            AddIncomePage.enterBenefits(input)
          case "other income" =>
            AddIncomePage.clearOtherIncome()
            AddIncomePage.enterOtherIncome(input)
        }
    }
  }

  Then("""^the (.*) field should display "(.*)"$""") { (elem: String, message: String) =>
    waitForPageToLoad()
    var elemLower = elem.toLowerCase

    def prependError: String = if (langToggle == Language.welsh) "Gwall:" else "Error:"

    waitFor(visibilityOfElementLocated(By.cssSelector("h2.govuk-error-summary__title")))

    if (langToggle == Language.welsh) HelperFunctions.errorSummaryHeading() should be("Mae problem wedi codi")
    else HelperFunctions.errorSummaryHeading() should be("There is a problem")

    elemLower match {
      //TODO Summary Error content validation, no id's implemented on Element and cant use css due to changing nature
      case "account type" =>
        //        HelperFunctions.errorSummary("TBC SUMMARY"+elemId) should be(message)
        HelperFunctions.errorMessage("typeOfAccount") should be(s"$prependError\n$message")
      case "account holder" =>
        //        HelperFunctions.errorSummary("TBC SUMMARY" + elemId) should be(message)
        HelperFunctions.errorMessage("isSoleSignatory") should be(s"$prependError\n$message")
      case "account name" =>
        //        HelperFunctions.errorSummary("TBC SUMMARY" + elemId) should be(message)
        HelperFunctions.errorMessage("accountName") should be(s"$prependError\n$message")
      case "sortcode" =>
        //        HelperFunctions.errorSummary("TBC SUMMARY" + elemId) should be(message)
        HelperFunctions.errorMessage("sortCode") should be(s"$prependError\n$message")
      case "account number" =>
        //        HelperFunctions.errorSummary("TBC SUMMARY" + elemId) should be(message)
        HelperFunctions.errorMessage("accountNumber") should be(s"$prependError\n$message")
      case "amount" =>
        //        HelperFunctions.errorSummary("TBC SUMMARY" + elemId) should be(message)
        HelperFunctions.errorMessage("amount") should be(s"$prependError\n$message")
      case "monthly income" =>
        //        HelperFunctions.errorSummary("TBC SUMMARY" + elemId) should be(message)
        HelperFunctions.errorMessage("monthlyIncome") should be(s"$prependError\n$message")
      case "benefit" =>
        //        HelperFunctions.errorSummary("TBC SUMMARY" + elemId) should be(message)
        HelperFunctions.errorMessage("benefits") should be(s"$prependError\n$message")
      case "other Income" =>
        //        HelperFunctions.errorSummary("TBC SUMMARY" + elemId) should be(message)
        HelperFunctions.errorMessage("otherIncome") should be(s"$prependError\n$message")
      case _ =>
        println("No field found - check field name passed to method (elem)")
    }
  }

}
