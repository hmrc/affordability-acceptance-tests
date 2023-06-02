package uk.gov.hmrc.test.ui.pages.journey.ssttp

import org.scalatest.Assertion
import uk.gov.hmrc.test.ui.pages.BasePage
import uk.gov.hmrc.test.ui.pages.content.{EnglishContent, WelshContent}
import uk.gov.hmrc.test.ui.testdata.Language
import uk.gov.hmrc.test.ui.utils.Configuration.testConfig

object CallUsDebtTooOldPage extends BasePage {

  val url: String = s"${testConfig.selfServiceTimeToPayFrontendUrl}/call-us-debt-too-old"

  def expectedPageTitle = {
    if (langToggle == Language.welsh) "Ffoniwch ni ynghylch cynllun talu - Trefnu cynllun talu - GOV.UK"
    else "Call us about a payment plan - Set up a Self Assessment payment plan - GOV.UK"
  }

  def expectedPageHeader = {
    if (langToggle == Language.welsh) "Ffoniwch ni ynghylch cynllun talu"
    else "Call us about a payment plan"
  }

  def expectedPageTitleError: String = "Error: " + expectedPageTitle

  def pageContent: String = id("main-content").webElement.getText

  def assertContent(): Assertion = {
    if (langToggle == Language.welsh) pageContent should be(WelshContent.callUsDebtTooOldContent())
    else pageContent should be(EnglishContent.callUsDebtTooOldContent())
  }
}
