package uk.gov.hmrc.test.ui.pages.journey.affordability

import org.openqa.selenium.WebElement
import org.scalatest.Assertion
import uk.gov.hmrc.test.ui.pages.BasePage
import uk.gov.hmrc.test.ui.pages.content.{EnglishContent, WelshContent}
import uk.gov.hmrc.test.ui.testdata.Language
import uk.gov.hmrc.test.ui.utils.Configuration.testConfig

object TypeOfAccountPage extends BasePage {

  val url: String = s"${testConfig.selfServiceTimeToPayFrontendUrl}/arrangement/about-your-bank-account"

  def businessRadio: WebElement = id("typeOfAccount").webElement

  def personalRadio: WebElement = id("typeOfAccount-2").webElement

  def accountHolderYes: WebElement = id("isSoleSignatory").webElement

  def accountHolderNo: WebElement = id("isSoleSignatory-2").webElement

  //  def noTypeSelectedSummary: String = cssSelector("#content > div > div > ul > li:nth-child(1) > a").webElement.getText
  //  def noAccountHolderSelectedSummary: String = cssSelector("#content > div > div > ul > li:nth-child(2) > a").webElement.getText
  //  def noTypeSelectedMessage: String = id("typeOfAccount-error").webElement.getText
  //  def noAccountHolderSelectedMessage: String = id("isSoleSignatory-error").webElement.getText

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

  def assertContent(): Assertion = {
    if (langToggle == Language.welsh) pageContent should be(WelshContent.aboutBankAccountContent())
    else pageContent should be(EnglishContent.aboutBankAccountContent())
  }


  def clickRadio(accountType: String): Unit = {
    accountType match {
      case "business" => businessRadio.click()
      case "personal" => personalRadio.click()
      case "no bank account type" =>
    }
  }

  def clickAccountHolder(holder: String): Unit = {
    holder match {
      case "is" => accountHolderYes.click()
      case "isn't" => accountHolderNo.click()
      case "no selection for" =>
    }
  }

  //  def assertErrorMessage(field: String, error: String): Unit = {
  //    field match {
  //      case "no account type selected" => noTypeSelectedMessage should be("Error:\n"+error)
  //      //                                          noTypeSelectedSummary should be(error)
  //      case "no account holder selected" => noAccountHolderSelectedMessage should be("Error:\n"+error)
  //      //                                          noAccountHolderSelectedSummary should be(error)
  //    }
  //  }


}
