package uk.gov.hmrc.test.ui.pages.journey.ssttp

import org.openqa.selenium.WebElement
import org.scalatest.Assertion
import uk.gov.hmrc.test.ui.pages.BasePage
import uk.gov.hmrc.test.ui.pages.content.{EnglishContent, WelshContent}
import uk.gov.hmrc.test.ui.testdata.{BankDetails, Language}
import uk.gov.hmrc.test.ui.utils.Configuration.testConfig

object SetUpDirectDebitPage extends BasePage {

  val url: String = s"${testConfig.selfServiceTimeToPayFrontendUrl}/arrangement/direct-debit"

  def accountName: WebElement = id("accountName").webElement
  def sortCode: WebElement = id("sortCode").webElement
  def accountNumber: WebElement = id("accountNumber").webElement

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

    def assertContent(): Assertion =  {
      if (langToggle == Language.welsh) pageContent should be(WelshContent.setupDirectDebitContent())
      else pageContent should be(EnglishContent.setupDirectDebitContent())
    }

  def enterBankDetails(bankDetails: BankDetails): Unit = {
    accountName.sendKeys(bankDetails.name)
    sortCode.sendKeys(bankDetails.sortcode)
    accountNumber.sendKeys(bankDetails.accNumber)
  }

  def enterAccountName(input: String): Unit = accountName.sendKeys(input)
  def enterSortcode(input: String): Unit = sortCode.sendKeys(input)
  def enterAccountNumber(input: String): Unit = accountNumber.sendKeys(input)

  def clearAccountName(): Unit = accountName.clear()
  def clearSortcode(): Unit = sortCode.clear()
  def clearAccountNumber(): Unit = accountNumber.clear()

  def clearBankDetails(): Unit = {
    accountName.clear()
    sortCode.clear()
    accountNumber.clear()
  }

}
