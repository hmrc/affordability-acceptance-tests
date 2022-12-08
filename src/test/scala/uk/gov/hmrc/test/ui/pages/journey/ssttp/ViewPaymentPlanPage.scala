package uk.gov.hmrc.test.ui.pages.journey.ssttp

import org.scalatest.Assertion
import uk.gov.hmrc.test.ui.pages.BasePage
import uk.gov.hmrc.test.ui.pages.content.{EnglishContent, WelshContent}
import uk.gov.hmrc.test.ui.testdata.Language
import uk.gov.hmrc.test.ui.utils.Configuration.testConfig

object ViewPaymentPlanPage extends BasePage {

  val url: String = s"${testConfig.selfServiceTimeToPayFrontendUrl}/arrangement/view-payment-plan"

  def expectedPageTitle = {
    if (langToggle == Language.welsh) "Eich cynllun talu - Trefnu cynllun talu - GOV.UK"
    else "Your payment plan - Set up a Self Assessment payment plan - GOV.UK"
  }

  def expectedPageHeader = {
    if (langToggle == Language.welsh) "Eich cynllun talu"
    else "Your payment plan"
  }

  def pageContent: String = id("main-content").webElement.getText

  def expectedPageTitleError: String = "Error: " + expectedPageTitle

  def assertContent(): Assertion = {
    if (langToggle == Language.welsh) pageContent should be(WelshContent.viewPaymentPlanContent())
    else pageContent should be(EnglishContent.viewPaymentPlanContent())
  }

}
