package uk.gov.hmrc.test.ui.pages.journey.affordability

import org.scalatest.Assertion
import uk.gov.hmrc.test.ui.pages.BasePage
import uk.gov.hmrc.test.ui.pages.content.{EnglishContent, WelshContent}
import uk.gov.hmrc.test.ui.testdata.Language
import uk.gov.hmrc.test.ui.utils.Configuration.testConfig

object CallUsNotEnrolledPage extends BasePage {

  val url: String = s"${testConfig.selfServiceTimeToPayFrontendUrl}/eligibility/not-enrolled"

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
    if (langToggle == Language.welsh) pageContent should be(WelshContent.callUsNotEnrolledContent())
    else pageContent should be(EnglishContent.callUsNotEnrolledContent())
  }
}
