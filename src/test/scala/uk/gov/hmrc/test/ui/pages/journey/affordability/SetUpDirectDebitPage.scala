package uk.gov.hmrc.test.ui.pages.journey.affordability

import org.openqa.selenium.WebElement
import uk.gov.hmrc.test.ui.pages.BasePage
import uk.gov.hmrc.test.ui.testdata.{BankDetails, Language}
import uk.gov.hmrc.test.ui.utils.Configuration.testConfig

object SetUpDirectDebitPage extends BasePage {

  val url: String = s"${testConfig.selfServiceTimeToPayFrontendUrl}/arrangement/direct-debit"

  var accountName: WebElement = id("accountName").webElement
  var sortCode: WebElement = id("sortCode").webElement
  var accountNumber: WebElement = id("accountNumber").webElement

  def expectedPageTitle = {
    if (langToggle == Language.welsh) "Trefnu Debyd Uniongyrchol - Trefnu cynllun talu - GOV.UK"
    else "Set up Direct Debit - Set up a Self Assessment payment plan - GOV.UK"
  }

  def expectedPageHeader = {
    if (langToggle == Language.welsh) "Trefnu Debyd Uniongyrchol"
    else "Set up Direct Debit"
  }

  def expectedPageTitleError: String = "Error: " + expectedPageTitle

  def pageContent: String = id("main-content").webElement.getText

  //  def assertContent(): Assertion =  {
  //    if (langToggle == Language.welsh) pageContent should be(WelshContent.accountOnFilePageText())
  //    else pageContent should be(EnglishContent.accountOnFilePageText())
  //  }

  def enterBankDetails(bankDetails: BankDetails): Unit = {
    accountName.sendKeys(bankDetails.name)
    sortCode.sendKeys(bankDetails.sortcode)
    accountNumber.sendKeys(bankDetails.accNumber)
  }

}
