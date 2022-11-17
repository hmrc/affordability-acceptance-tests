package uk.gov.hmrc.test.ui.pages.journey.affordability

import org.openqa.selenium.WebElement
import uk.gov.hmrc.test.ui.pages.BasePage
import uk.gov.hmrc.test.ui.testdata.Language
import uk.gov.hmrc.test.ui.utils.Configuration.testConfig

object TypeOfAccountPage extends BasePage {

  val url: String = s"${testConfig.selfServiceTimeToPayFrontendUrl}/arrangement/about-your-bank-account"

  var businessRadio: WebElement = id("typeOfAccount").webElement
  var personalRadio: WebElement = id("typeOfAccount-2").webElement
  var accountHolderYes: WebElement = id("isSoleSignatory").webElement
  var accountHolderNo: WebElement = id("isSoleSignatory-2").webElement

  def expectedPageTitle = {
    if (langToggle == Language.welsh) "Ynglŷn â’ch cyfrif banc - Trefnu cynllun talu - GOV.UK"
    else "About your bank account - Set up a Self Assessment payment plan - GOV.UK"
  }

  def expectedPageHeader = {
    if (langToggle == Language.welsh) "Ynglŷn â’ch cyfrif banc"
    else "About your bank account"
  }

  def expectedPageTitleError: String = "Error: " + expectedPageTitle

  def pageContent: String = id("main-content").webElement.getText

  //  def assertContent(): Assertion =  {
  //    if (langToggle == Language.welsh) pageContent should be(WelshContent.accountOnFilePageText())
  //    else pageContent should be(EnglishContent.accountOnFilePageText())
  //  }


  def clickRadio(accountType: String): Unit = {
    accountType match {
      case "business" => businessRadio.click()
      case "personal" => personalRadio.click()
    }
  }

  def clickAccountHolder(holder: String): Unit = {
    holder match {
      case "are" => accountHolderYes.click()
      case "aren't" => accountHolderNo.click()
    }
  }

  //TODO - Error Assertions
  def assertError(): Unit ={
  }


}
