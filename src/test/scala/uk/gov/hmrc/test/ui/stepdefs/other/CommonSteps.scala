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

package uk.gov.hmrc.test.ui.stepdefs.other

import org.openqa.selenium.By
import org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated
import uk.gov.hmrc.test.ui.pages.journey.affordability.{AddIncomeAndSpendingPage, AddIncomePage, AddSpendingPage, AffordabilityCheckPaymentPlanPage, CannotAffordPage, CannotAgreePlanPage, CheckYouCanAffordPage, DirectDebitAssistancePage, DirectDebitErrorPage, HowManyMonthsCustomPage, HowManyMonthsPage, HowMuchYouCanAffordPage, NoIncomePage}
import uk.gov.hmrc.test.ui.pages.journey.ssttp._
import uk.gov.hmrc.test.ui.pages.support.HelperFunctions
import uk.gov.hmrc.test.ui.pages.testonly.TestOnlyStartPage
import uk.gov.hmrc.test.ui.testdata.{Language, ScenarioContext}


class CommonSteps extends DriverActions {


  Given("""^A user logs in and gets to the How much can you pay upfront page$""") { () =>
    TestOnlyStartPage.createUserAndLogin()
    StartPage.clickStartNow()
    continue()
    UpfrontPaymentPage.selectRadio("yes")
    continue()
  }

  Given("""^A user logs in and gets to the About your bank account page$""") { () =>
    TestOnlyStartPage.createUserAndLogin()
    StartPage.clickStartNow()
    continue()
    UpfrontPaymentPage.selectRadio("no")
    continue()
    WhatDayOfMonthPage.enterDayOfMonth("28")
    continue()
    HowManyMonthsPage.enterAmountOfMonths("50 percent")
    continue()
    continue()
  }

  Given("""^A user logs in and gets to the affordability pages$""") { () =>
    TestOnlyStartPage.createUserAndLogin()
    StartPage.clickStartNow()
    continue()
    UpfrontPaymentPage.selectRadio("no")
    continue()
    WhatDayOfMonthPage.enterDayOfMonth("28")
    continue()
  }

  And("""^user enters affordability pages$""") { () =>
    WhatDayOfMonthPage.clickAffordability()
  }

  Given("""^A user logs in and clicks link to the (.*)$""") { (page: String) =>
    page match {
      case "CallUsAdviserPage" => TestOnlyStartPage.selectAdviserPage()
      case _ => TestOnlyStartPage.createUserAndGoToPage(page)
    }
  }

  And("""^the user clicks (start|continue|back|browser back)$""") { (action: String) =>
    action match {
      case "start" => StartPage.clickStartNow()
      case "continue" => continue()
      case "back" => back()
      case "browser back" => browserBack()
    }
  }

  When("""^the User toggles on (Welsh|English) language$""") { (option: String) =>
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

  And("""^the user is on the (.*)$""") { (page: String) =>
    page match {
      case "StartPage" =>
        StartPage.startShouldBeLoaded()
      case "CannotAffordPage" =>
        CannotAffordPage.shouldBeLoaded()
      case "TaxLiabilitiesPage" =>
        TaxLiabilitiesPage.shouldBeLoaded()
      case "CannotSetupDDPage" =>
        CannotSetupDDPage.shouldBeLoaded()
      case "DirectDebitErrorPage" =>
        DirectDebitErrorPage.shouldBeLoaded()
      case "DirectDebitAssistancePage" =>
        DirectDebitAssistancePage.shouldBeLoaded()
      case "TypeOfAccountPage" =>
        TypeOfAccountPage.shouldBeLoaded()
      case "SetUpDirectDebitPage" =>
        SetUpDirectDebitPage.shouldBeLoaded()
      case "TermsAndConditionsPage" =>
        TermsAndConditionsPage.shouldBeLoaded()
      case "ConfirmDirectDebitDetailsPage" =>
        ConfirmDirectDebitDetailsPage.shouldBeLoaded()
      case "SuccessConfirmationPage" =>
        SuccessConfirmationPage.shouldBeLoaded()
      case "CallUsNotEligiblePage" =>
        CallUsNotEligiblePage.shouldBeLoaded()
      case "CallUsDebtTooOldPage" =>
        CallUsDebtTooOldPage.shouldBeLoaded()
      case "CallUsNotEnrolledPage" =>
        CallUsNotEnrolledPage.shouldBeLoaded()
      case "CallUsAlreadyHavePlanPage" =>
        CallUsAlreadyHavePlanPage.shouldBeLoaded()
      case "CallUsDebtTooLargePage" =>
        CallUsDebtTooLargePage.shouldBeLoaded()
      case "NeedToFilePage" =>
        NeedToFilePage.shouldBeLoaded()
      case "CallUsAdviserPage" =>
        CallUsAdviserPage.shouldBeLoaded()
      case "ViewPaymentPlanPage" =>
        ViewPaymentPlanPage.shouldBeLoaded()
      case "UpfrontPaymentPage" =>
        UpfrontPaymentPage.shouldBeLoaded()
      case "PaymentSummaryPage" =>
        UpfrontSummaryPage.shouldBeLoaded()
      case "UpfrontPaymentAmountPage" =>
        HowMuchUpfrontPaymentPage.shouldBeLoaded()
      case "WhatDayOfMonthPage" =>
        WhatDayOfMonthPage.shouldBeLoaded()
      case "CheckYouCanAffordPage" =>
        CheckYouCanAffordPage.shouldBeLoaded()
      case "AddIncomeAndSpendingPageBlank" =>
        AddIncomeAndSpendingPage.shouldBeLoaded()
      case "AddIncomeAndSpendingPageIncomeFull" =>
        AddIncomeAndSpendingPage.shouldBeLoaded()
      case "AddIncomeAndSpendingPageSpendingFull" =>
        AddIncomeAndSpendingPage.shouldBeLoaded()
      case "AddIncomePage" =>
        AddIncomePage.shouldBeLoaded()
      case "AddSpendingPage" =>
        AddSpendingPage.shouldBeLoaded()
      case "NoIncomePage" =>
        NoIncomePage.shouldBeLoaded()
      case "HowMuchYouCanAffordPageHappy" =>
        HowMuchYouCanAffordPage.shouldBeLoaded()
      case "HowMuchYouCanAffordPageSpendingMore" =>
        HowMuchYouCanAffordPage.shouldBeLoaded()
      case "HowMuchYouCanAffordPageSpendingSame" =>
        HowMuchYouCanAffordPage.shouldBeLoaded()
      case "AffordabilityCheckPaymentPlanPageNoUpfront" =>
        AffordabilityCheckPaymentPlanPage.shouldBeLoaded()
      case "CannotAgreePlanPage" =>
        CannotAgreePlanPage.shouldBeLoaded()
      case "HowManyMonthsPageUpfront" =>
        HowManyMonthsPage.shouldBeLoaded()
      case "HowManyMonthsPage" =>
        HowManyMonthsPage.shouldBeLoaded()
      case "HowManyMonthsPageCustom" =>
        HowManyMonthsCustomPage.shouldBeLoaded()
      case "TBC" => ""
      case _ => throw new IllegalArgumentException(s"$page page not recognised")
    }
  }

  When("""^the user enters (.*) into the (.*) field$""") { (input: String, field: String) =>
    def field1: String = field.toLowerCase

    input match {
      case "none" => field1 match {
        //Set Up Direct Debit Page
        case "account name" => SetUpDirectDebitPage.clearAccountName()
        case "sortcode" => SetUpDirectDebitPage.clearSortcode()
        case "account number" => SetUpDirectDebitPage.clearAccountNumber()
        //Upfront Payment Page
        case "amount" => HowMuchUpfrontPaymentPage.clearAmount()
        //Day of Month Page
        case "radio button" => ""
        case "other" => ""
        //Add Income Page
        case "monthly income" => AddIncomePage.clearMonthlyIncome()
        case "benefits" => AddIncomePage.clearBenefits()
        case "other income" => AddIncomePage.clearOtherIncome()
        //Add Spending Page
        case "housing" => AddSpendingPage.clearHousing()
        case "pension" => AddSpendingPage.clearPension()
        case "council tax" => AddSpendingPage.clearCouncilTax()
        case "utilities" => AddSpendingPage.clearUtilities()
        case "debt repayments" => AddSpendingPage.clearDebtRepayments()
        case "travel" => AddSpendingPage.clearTravel()
        case "childcare" => AddSpendingPage.clearChildcare()
        case "insurance" => AddSpendingPage.clearInsurance()
        case "groceries" => AddSpendingPage.clearGroceries()
        case "health" => AddSpendingPage.clearHealth()
      }
      case _ =>
        field1 match {
          //Set Up Direct Debit Page
          case "account name" =>
            SetUpDirectDebitPage.clearAccountName()
            SetUpDirectDebitPage.enterAccountName(input)
          case "sortcode" =>
            SetUpDirectDebitPage.clearSortcode()
            SetUpDirectDebitPage.enterSortcode(input)
          case "account number" =>
            SetUpDirectDebitPage.clearAccountNumber()
            SetUpDirectDebitPage.enterAccountNumber(input)
          //Upfront Payment Page
          case "amount" =>
            HowMuchUpfrontPaymentPage.clearAmount()
            HowMuchUpfrontPaymentPage.enterAmount(input)
          //Day of Month Page
          case "radio button" => ""
          case "other" => WhatDayOfMonthPage.enterDayOfMonth(input)
          //Add Income Page
          case "monthly income" =>
            AddIncomePage.clearMonthlyIncome()
            AddIncomePage.enterMonthlyIncome(input)
          case "benefits" =>
            AddIncomePage.clearBenefits()
            AddIncomePage.enterBenefits(input)
          case "other income" =>
            AddIncomePage.clearOtherIncome()
            AddIncomePage.enterOtherIncome(input)
          //Add Spending Page
          case "housing" =>
            AddSpendingPage.clearHousing()
            AddSpendingPage.enterHousing(input)
          case "pension" =>
            AddSpendingPage.clearPension()
            AddSpendingPage.enterPension(input)
          case "council tax" =>
            AddSpendingPage.clearCouncilTax()
            AddSpendingPage.enterCouncilTax(input)
          case "utilities" =>
            AddSpendingPage.clearUtilities()
            AddSpendingPage.enterUtilities(input)
          case "debt repayments" =>
            AddSpendingPage.clearDebtRepayments()
            AddSpendingPage.enterDebtRepayments(input)
          case "travel" =>
            AddSpendingPage.clearTravel()
            AddSpendingPage.enterTravel(input)
          case "childcare" =>
            AddSpendingPage.clearChildcare()
            AddSpendingPage.enterChildcare(input)
          case "insurance" =>
            AddSpendingPage.clearInsurance()
            AddSpendingPage.enterInsurance(input)
          case "groceries" =>
            AddSpendingPage.clearGroceries()
            AddSpendingPage.enterGroceries(input)
          case "health" =>
            AddSpendingPage.clearHealth()
            AddSpendingPage.enterHealth(input)
        }
    }
  }

}
