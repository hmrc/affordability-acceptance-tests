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
import uk.gov.hmrc.test.ui.pages.journey.affordability.{AddIncomeAndSpendingPage, AddIncomePage, AddSpendingPage, AffordabilityCheckPaymentPlanPage, CannotAgreePlanPage, CheckYouCanAffordPage, DirectDebitAssistancePage, DirectDebitErrorPage, HowManyMonthsPage, HowMuchYouCanAffordPage, NoIncomePage}
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
    TestOnlyStartPage.createUserAndGoToPage(page)
  }

  And("""^the user clicks (start|continue|back|browser back)$""") { (action: String) =>
    action match {
      case "start" => StartPage.clickStartNow()
      case "continue" => continue()
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
      case "DirectDebitErrorPage" =>
        DirectDebitErrorPage.shouldBeLoaded()
        DirectDebitErrorPage.assertContent()
      case "DirectDebitErrorPage" =>
        DirectDebitErrorPage.shouldBeLoaded()
        DirectDebitErrorPage.assertContent()
      case "DirectDebitAssistancePage" =>
        DirectDebitAssistancePage.shouldBeLoaded()
        DirectDebitAssistancePage.assertContent()
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
      case "CallUsDebtTooOldPage" =>
        CallUsDebtTooOldPage.shouldBeLoaded()
        CallUsDebtTooOldPage.assertContent()
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
        //                AddIncomeAndSpendingPage.shouldBeLoaded()
        AddIncomeAndSpendingPage.assertContentBlank()
      case "AddIncomeAndSpendingPageIncomeFull" =>
        AddIncomeAndSpendingPage.shouldBeLoaded()
        AddIncomeAndSpendingPage.assertContentIncomeFull()
      case "AddIncomeAndSpendingPageSpendingFull" =>
        AddIncomeAndSpendingPage.shouldBeLoaded()
        AddIncomeAndSpendingPage.assertContentSpendingFull()
      case "AddIncomePage" =>
        AddIncomePage.shouldBeLoaded()
        AddIncomePage.assertContent()
      case "AddSpendingPage" =>
        AddSpendingPage.shouldBeLoaded()
        AddSpendingPage.assertContent()
      case "NoIncomePage" =>
        NoIncomePage.shouldBeLoaded()
        NoIncomePage.assertContent()
      case "HowMuchYouCanAffordPageHappy" =>
        HowMuchYouCanAffordPage.shouldBeLoaded()
        HowMuchYouCanAffordPage.assertContentHappy()
      case "HowMuchYouCanAffordPageSpendingMore" =>
        HowMuchYouCanAffordPage.shouldBeLoaded()
        HowMuchYouCanAffordPage.assertContentSpendingMoreThanIncome()
      case "HowMuchYouCanAffordPageSpendingSame" =>
        HowMuchYouCanAffordPage.shouldBeLoaded()
        HowMuchYouCanAffordPage.assertContentSpendingSameAsIncome()
      case "AffordabilityCheckPaymentPlanPageNoUpfront" =>
        AffordabilityCheckPaymentPlanPage.shouldBeLoaded()
        AffordabilityCheckPaymentPlanPage.assertContentNoUpfront()
      //      case "AffordabilityCheckPaymentPlanPageWithUpfront" =>
      //        AffordabilityCheckPaymentPlanPage.shouldBeLoaded()
      //        AffordabilityCheckPaymentPlanPage.assertContentWithUpfront()
      case "CannotAgreePlanPage" =>
        //        CannotAgreePlanPage.shouldBeLoaded()
        CannotAgreePlanPage.assertContent()
      case "HowManyMonthsPageUpfront" =>
        HowManyMonthsPage.shouldBeLoaded()
      case "HowManyMonthsPage" =>
        //        HowManyMonthsPage.shouldBeLoaded()
        HowManyMonthsPage.assertContent()
      case "HowManyMonthsPageCustom" =>
        //        HowManyMonthsPage.shouldBeLoaded()
        HowManyMonthsPage.assertContentCustom()
      case "TBC" => ""
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

  Then("""^the (.*) field should display "(.*)"$""") { (elem: String, message: String) =>
    waitForPageToLoad()
    var elemLower = elem.toLowerCase

    def prependError: String = if (langToggle == Language.welsh) "Gwall:" else "Error:"

    waitFor(visibilityOfElementLocated(By.cssSelector("h2.govuk-error-summary__title")))
    if (langToggle == Language.welsh) HelperFunctions.errorSummaryHeading() should be("Mae problem wedi codi")
    else HelperFunctions.errorSummaryHeading() should be("There is a problem")

    elemLower match {
      //TODO Summary Error content validation, no id's implemented on Element and cant use css due to changing nature
      //Account Type Page
      case "account type" =>
        //        HelperFunctions.errorSummary("TBC SUMMARY"+elemId) should be(message)
        HelperFunctions.errorMessage("typeOfAccount") should be(s"$prependError\n$message")
      case "account holder" =>
        //        HelperFunctions.errorSummary("TBC SUMMARY" + elemId) should be(message)
        HelperFunctions.errorMessage("isSoleSignatory") should be(s"$prependError\n$message")
      //Set Up Direct Debit Page
      case "account name" =>
        //        HelperFunctions.errorSummary("TBC SUMMARY" + elemId) should be(message)
        HelperFunctions.errorMessage("accountName") should be(s"$prependError\n$message")
      case "sortcode" =>
        //        HelperFunctions.errorSummary("TBC SUMMARY" + elemId) should be(message)
        HelperFunctions.errorMessage("sortCode") should be(s"$prependError\n$message")
      case "account number" =>
        //        HelperFunctions.errorSummary("TBC SUMMARY" + elemId) should be(message)
        HelperFunctions.errorMessage("accountNumber") should be(s"$prependError\n$message")
      //Upfront Payment Page
      case "amount" =>
        //        HelperFunctions.errorSummary("TBC SUMMARY" + elemId) should be(message)
        HelperFunctions.errorMessage("amount") should be(s"$prependError\n$message")
      //Add Income Page
      case "monthly income" =>
        //        HelperFunctions.errorSummary("TBC SUMMARY" + elemId) should be(message)
        HelperFunctions.errorMessage("monthlyIncome") should be(s"$prependError\n$message")
      case "benefit" =>
        //        HelperFunctions.errorSummary("TBC SUMMARY" + elemId) should be(message)
        HelperFunctions.errorMessage("benefits") should be(s"$prependError\n$message")
      case "other income" =>
        //        HelperFunctions.errorSummary("TBC SUMMARY" + elemId) should be(message)
        HelperFunctions.errorMessage("otherIncome") should be(s"$prependError\n$message")
      case "income invalid" =>
        //        HelperFunctions.errorSummary("TBC SUMMARY" + elemId) should be(message)
        HelperFunctions.errorMessage("income-invalid").replaceAll("\n", " ") should be(s"$prependError $message")
      //Add Spending Page
      case "housing" =>
        //        HelperFunctions.errorSummary("TBC SUMMARY" + elemId) should be(message)
        HelperFunctions.errorMessage("housing") should be(s"$prependError\n$message")
      case "pension" =>
        //        HelperFunctions.errorSummary("TBC SUMMARY" + elemId) should be(message)
        HelperFunctions.errorMessage("pension-contributions") should be(s"$prependError\n$message")
      case "council tax" =>
        //        HelperFunctions.errorSummary("TBC SUMMARY" + elemId) should be(message)
        HelperFunctions.errorMessage("council-tax") should be(s"$prependError\n$message")
      case "utilities" =>
        //        HelperFunctions.errorSummary("TBC SUMMARY" + elemId) should be(message)
        HelperFunctions.errorMessage("utilities") should be(s"$prependError\n$message")
      case "debt repayments" =>
        //        HelperFunctions.errorSummary("TBC SUMMARY" + elemId) should be(message)
        HelperFunctions.errorMessage("debt-repayments") should be(s"$prependError\n$message")
      case "travel" =>
        //        HelperFunctions.errorSummary("TBC SUMMARY" + elemId) should be(message)
        HelperFunctions.errorMessage("travel") should be(s"$prependError\n$message")
      case "childcare" =>
        //        HelperFunctions.errorSummary("TBC SUMMARY" + elemId) should be(message)
        HelperFunctions.errorMessage("childcare") should be(s"$prependError\n$message")
      case "insurance" =>
        //        HelperFunctions.errorSummary("TBC SUMMARY" + elemId) should be(message)
        HelperFunctions.errorMessage("insurance") should be(s"$prependError\n$message")
      case "groceries" =>
        //        HelperFunctions.errorSummary("TBC SUMMARY" + elemId) should be(message)
        HelperFunctions.errorMessage("groceries") should be(s"$prependError\n$message")
      case "health" =>
        //        HelperFunctions.errorSummary("TBC SUMMARY" + elemId) should be(message)
        HelperFunctions.errorMessage("health") should be(s"$prependError\n$message")
      case "radio button" =>
        //        HelperFunctions.errorSummary("TBC SUMMARY" + elemId) should be(message)
        HelperFunctions.errorMessage("other") should be(s"$prependError\n$message")
      case "a different day" =>
        //        HelperFunctions.errorSummary("TBC SUMMARY" + elemId) should be(message)
        HelperFunctions.errorMessage("other") should be(s"$prependError\n$message")
      //How Many Months Page
      case "custom amount" =>
        //        HelperFunctions.errorSummary("TBC SUMMARY" + elemId) should be(message)
        HelperFunctions.errorMessage("custom-amount") should be(s"$prependError\n$message")
      case "plan selection" =>
        //        HelperFunctions.errorSummary("TBC SUMMARY" + elemId) should be(message)
        HelperFunctions.errorMessage("plan-selection") should be(s"$prependError\n$message")
      case _ =>
        println("No field found - check field name passed to method (elem)")
    }
  }

}
