package uk.gov.hmrc.test.ui.testdata
import uk.gov.hmrc.test.ui.utils.Configuration.environment

case class BankDetails(name: String, sortcode: String, accNumber: String)

object BankDetails {

  lazy val validAccount: BankDetails = environment match {
    case "local" | "development" => BankDetails("Melvin Loper", "20-71-06", "44311677")
    case "qa"                  => BankDetails("TBC", "40-47-84", "70872490")
  }

  lazy val invalidNameAccount: BankDetails = environment match {
    case "local" | "development" => BankDetails("INVALID NAME", "20-71-06", "44311677")
    case "qa"                  => BankDetails("TBC", "40-47-84", "70872490")
  }

  lazy val amendedAccount: BankDetails = environment match {
    case "local" | "development" => BankDetails("Felipa Doherty", "20-71-06", "44344677")
    case "qa"                  => BankDetails("TBC", "40-47-84", "70872490")
  }

  lazy val invalidAccount: BankDetails = environment match {
    case "local" | "development" => BankDetails("Tester", "00-00-00", "12345678")
    case "qa"                  => BankDetails("TBC", "40-47-84", "12345678")
  }

  lazy val indeterminateAccount: BankDetails = environment match {
    case "local" | "development" => BankDetails("Nichole Cartwright", "40 51 25", "54377677")
    case "qa"                  => BankDetails("TBC", "09 06 66", "42553011")
  }

  lazy val partialNameAccount: BankDetails = environment match {
    case "local" | "development" => BankDetails("Melvin", "20 71 06", "44311677")
    case "qa"                  => BankDetails("TBC", "09 06 66", "42553011")
  }

  lazy val businessAccount: BankDetails = environment match {
    case "local" | "development" => BankDetails("Security Engima", "20 71 06", "86473611")
    case "qa"                  => BankDetails("TBC", "09 06 66", "42553011")
  }

  lazy val invalidBusinessAccount: BankDetails = environment match {
    case "local" | "development" => BankDetails("Tester", "00-00-00", "12345678")
    case "qa"                  => BankDetails("TBC", "09 06 66", "42553011")
  }

  lazy val invalidBusinessNameAccount: BankDetails = environment match {
    case "local" | "development" => BankDetails("Invalid Name", "20 71 06", "86473611")
    case "qa"                  => BankDetails("TBC", "09 06 66", "42553011")
  }

  lazy val amendedBusinessAccount: BankDetails = environment match {
    case "local" | "development" => BankDetails("Megacorp", "20 71 06", "86563611")
    case "qa"                  => BankDetails("TBC", "40-47-84", "70872490")
  }

  lazy val indeterminateBusinessAccount: BankDetails = environment match {
    case "local" | "development" => BankDetails("Zanetti Office Supplies", "40 51 25", "96473611")
    case "qa"                  => BankDetails("TBC", "40-47-84", "70872490")
  }

  lazy val partialNameBusinessAccount: BankDetails = environment match {
    case "local" | "development" => BankDetails("Security", "20 71 06", "86473611")
    case "qa"                  => BankDetails("TBC", "09 06 66", "42553011")
  }

  //Other Scenarios

  lazy val wellFormattedNoAccount: BankDetails = environment match {
    case "local" | "development" => BankDetails("Not well formatted", "609593", "44311611")
    case "qa"                  => BankDetails("TBC", "TBC", "TBC")
  }

  lazy val supportsDirectDebitNoAccount: BankDetails = environment match {
    case "local" | "development" => BankDetails("Doesnt support Direct Debit", "206705", "44311611")
    case "qa"                  => BankDetails("TBC", "TBC", "TBC")
  }

  lazy val onEISCDNoAccount: BankDetails = environment match {
    case "local" | "development" => BankDetails("Not on EISCD", "309696", "44311611")
    case "qa"                  => BankDetails("TBC", "TBC", "TBC")
  }

  lazy val denyListAccount: BankDetails = environment match {
    case "local" | "development" => BankDetails("Deny List", "201147", "44311611")
    case "qa"                  => BankDetails("TBC", "TBC", "TBC")
  }

}
