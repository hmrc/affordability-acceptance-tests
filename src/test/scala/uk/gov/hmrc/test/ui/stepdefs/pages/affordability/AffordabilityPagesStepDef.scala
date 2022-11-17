package uk.gov.hmrc.test.ui.stepdefs.pages.affordability

import uk.gov.hmrc.test.ui.pages.journey.affordability.{SetUpDirectDebitPage, TypeOfAccountPage}
import uk.gov.hmrc.test.ui.pages.support.HelperFunctions
import uk.gov.hmrc.test.ui.stepdefs.other.{DriverActions, Steps}
import uk.gov.hmrc.test.ui.testdata.{BankDetails, ScenarioContext}

class AffordabilityPagesStepDef extends Steps with DriverActions {

  When("""^they select (business|personal) and (are|aren't) the account holder on the About account page$""") { (accountType: String, holder: String) =>
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
}
