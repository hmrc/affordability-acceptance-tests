package uk.gov.hmrc.test.ui.pages.journey.ssttp

import org.scalatest.Assertion
import uk.gov.hmrc.test.ui.pages.BasePage
import uk.gov.hmrc.test.ui.pages.content.{EnglishContent, WelshContent}
import uk.gov.hmrc.test.ui.testdata.Language
import uk.gov.hmrc.test.ui.utils.Configuration.testConfig

object CallUsDebtTooLargePage extends BasePage {

  val url: String = s"${testConfig.selfServiceTimeToPayFrontendUrl}/eligibility/debt-large/call-us"

  def expectedPageTitle = {
    if (langToggle == Language.welsh) "Ffoniwch ni - Trefnu cynllun talu - GOV.UK"
    else "Please call us - Set up a Self Assessment payment plan - GOV.UK"
  }

  def expectedPageHeader = {
    if (langToggle == Language.welsh) "Ffoniwch ni"
    else "Please call us"
  }

  def expectedPageTitleError: String = "Error: " + expectedPageTitle

  def expandLink(): Unit = {
    cssSelector("#content > section > details > summary > span").webElement.click()
  }

  def pageContent: String = id("main-content").webElement.getText

  def assertContent(): Assertion = {
    expandLink()
    if (langToggle == Language.welsh) pageContent should be(WelshContent.callUsNotDebtTooLargeContent())
    else pageContent should be(EnglishContent.callUsNotDebtTooLargeContent())
  }
}
