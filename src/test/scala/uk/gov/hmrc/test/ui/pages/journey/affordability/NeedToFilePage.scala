package uk.gov.hmrc.test.ui.pages.journey.affordability

import org.scalatest.Assertion
import uk.gov.hmrc.test.ui.pages.BasePage
import uk.gov.hmrc.test.ui.pages.content.{EnglishContent, WelshContent}
import uk.gov.hmrc.test.ui.testdata.Language
import uk.gov.hmrc.test.ui.utils.Configuration.testConfig

object NeedToFilePage extends BasePage {

  val url: String = s"${testConfig.selfServiceTimeToPayFrontendUrl}/eligibility/you-need-to-file"

  def expectedPageTitle = {
    if (langToggle == Language.welsh) "Cyflwynwch eich Ffurflen Dreth er mwyn defnyddio’r gwasanaeth hwn - Trefnu cynllun talu - GOV.UK"
    else "File your return to use this service - Set up a Self Assessment payment plan - GOV.UK"
  }

  def expectedPageHeader = {
    if (langToggle == Language.welsh) "Cyflwynwch eich Ffurflen Dreth er mwyn defnyddio’r gwasanaeth hwn"
    else "File your return to use this service"
  }

  def expectedPageTitleError: String = "Error: " + expectedPageTitle

  def expandLink(): Unit = {
    cssSelector("#content > details > summary > span").webElement.click()
  }

  def pageContent: String = id("main-content").webElement.getText

  def assertContent(): Assertion = {
    expandLink()
    if (langToggle == Language.welsh) pageContent should be(WelshContent.needToFileContent())
    else pageContent should be(EnglishContent.needToFileContent())
  }
}
