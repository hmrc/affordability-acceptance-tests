package uk.gov.hmrc.test.ui.stepdefs.pages.affordability

import org.openqa.selenium.By
import org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated
import uk.gov.hmrc.test.ui.pages.journey.affordability.TypeOfAccountPage._
import uk.gov.hmrc.test.ui.pages.journey.affordability.{SetUpDirectDebitPage, TypeOfAccountPage}
import uk.gov.hmrc.test.ui.pages.support.HelperFunctions
import uk.gov.hmrc.test.ui.stepdefs.other.{DriverActions, Steps}
import uk.gov.hmrc.test.ui.testdata.{BankDetails, Language, ScenarioContext}

class AffordabilityPagesStepDef extends Steps with DriverActions {

  When("""^the user selects (business|personal|no bank account type) and (is|isn't|no selection for) the account holder on the About account page$""") { (accountType: String, holder: String) =>
    TypeOfAccountPage.clickRadio(accountType)
    TypeOfAccountPage.clickAccountHolder(holder)
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

  When("""^the user enters (.*) into the (.*) field$""") { (input: String, field: String) =>
    def field1: String = field.toLowerCase

    input match {
      case "none" => field1 match {
        case "account name" => SetUpDirectDebitPage.clearAccountName()
        case "sortcode" => SetUpDirectDebitPage.clearSortcode()
        case "account number" => SetUpDirectDebitPage.clearAccountNumber()
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
        }
    }
  }

  When("""^an empty form is submitted$""") { () =>
    continue()
  }

  //  When("""^the user doesn't select an option for (.*) and continues, then the error message (.*) shows$""") { (option: String, error: String) =>
  //    option match {
  //      case "account type" =>
  //        clickAccountHolder("is")
  //        continue()
  //        assertErrorMessage("no account type selected", error)
  //      case "account holder" =>
  //        clickRadio("personal")
  //        continue()
  //        assertErrorMessage("no account holder selected", error)
  //    }
  //  }

  Then("""^the (.*) field should display "(.*)"$""") { (elem: String, message: String) =>
    waitForPageToLoad()
    var elemLower = elem.toLowerCase

    def prependError: String = if (langToggle == Language.welsh) "Gwall:" else "Error:"

    waitFor(visibilityOfElementLocated(By.id("error-summary-title")))

    if (langToggle == Language.welsh) HelperFunctions.errorSummaryHeading() should be("Mae problem wedi codi")
    else HelperFunctions.errorSummaryHeading() should be("There is a problem")

    elemLower match {
      //TODO Summary Error content validation, no id's implemented on Element and cant use css due to changing nature
      case "account type" =>
        //        HelperFunctions.errorSummary("TBC SUMMARY"+elemId) should be(message)
        HelperFunctions.id("typeOfAccount-error").webElement.getText should be(s"$prependError\n$message")
      case "account holder" =>
        //        HelperFunctions.errorSummary("TBC SUMMARY" + elemId) should be(message)
        HelperFunctions.id("isSoleSignatory-error").webElement.getText should be(s"$prependError\n$message")
      case "account name" =>
        //        HelperFunctions.errorSummary("TBC SUMMARY" + elemId) should be(message)
        HelperFunctions.id("accountName-error").webElement.getText should be(s"$prependError\n$message")
      case "sortcode" =>
        //        HelperFunctions.errorSummary("TBC SUMMARY" + elemId) should be(message)
        HelperFunctions.id("sortCode-error").webElement.getText should be(s"$prependError\n$message")
      case "account number" =>
        //        HelperFunctions.errorSummary("TBC SUMMARY" + elemId) should be(message)
        HelperFunctions.id("accountNumber-error").webElement.getText should be(s"$prependError\n$message")
      case _ =>
    }
  }
}