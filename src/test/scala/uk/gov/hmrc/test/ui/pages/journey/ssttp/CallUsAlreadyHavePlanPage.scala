package uk.gov.hmrc.test.ui.pages.journey.ssttp

import org.scalatest.Assertion
import uk.gov.hmrc.test.ui.pages.BasePage
import uk.gov.hmrc.test.ui.pages.content.{EnglishContent, WelshContent}
import uk.gov.hmrc.test.ui.testdata.Language
import uk.gov.hmrc.test.ui.utils.Configuration.testConfig

object CallUsAlreadyHavePlanPage extends BasePage {

  val url: String = s"${testConfig.selfServiceTimeToPayFrontendUrl}/already-have-a-plan"

  def expectedPageTitle = {
    if (langToggle == Language.welsh) "Mae eisoes gennych gynllun talu gyda CThEF - Trefnu cynllun talu - GOV.UK"
    else "You already have a payment plan with HMRC - Set up a Self Assessment payment plan - GOV.UK"
  }

  def expectedPageHeader = {
    if (langToggle == Language.welsh) "Mae eisoes gennych gynllun talu gyda CThEF"
    else "You already have a payment plan with HMRC"
  }

  def expectedPageTitleError: String = "Error: " + expectedPageTitle

  def pageContent: String = id("main-content").webElement.getText

  def assertContent(): Assertion = {
    if (langToggle == Language.welsh) pageContent should be(WelshContent.alreadyHavePlanPageContent())
    else pageContent should be(EnglishContent.alreadyHavePlanPageContent())
  }
}
