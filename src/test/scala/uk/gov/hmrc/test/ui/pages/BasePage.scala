/*
 * Copyright 2023 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.gov.hmrc.test.ui.pages

import org.scalatest.Assertion
import org.scalatest.matchers.should.Matchers
import uk.gov.hmrc.test.ui.stepdefs.other.DriverActions
import uk.gov.hmrc.test.ui.testdata.Language


trait BasePage extends DriverActions with Matchers {

  val url: String
  def expectedPageTitle: String
  def expectedPageTitleError: String
  def expectedPageService: String = {
    if (langToggle == Language.welsh) "Trefnu cynllun talu"
    else "Set up a Self Assessment payment plan"
  }
  def expectedPageHeader: String

  def currentPageTitle: String = pageTitle
  def currentPageService: String = cssSelector("div.govuk-header__content > a").webElement.getText
  def currentPageHeader: String = cssSelector("h1").webElement.getText

  def assertCurrentUrl(): Assertion              = currentUrl should be(url)
  def assertCurrentPageTitle(): Assertion        = currentPageTitle should be(expectedPageTitle)
  def assertCurrentPageTitleError(): Assertion   = currentPageTitle should be(expectedPageTitleError)
  def assertCurrentPageService(): Assertion      = currentPageService should be(expectedPageService)
  def assertCurrentPageHeader(): Assertion       = currentPageHeader should be(expectedPageHeader)

  def shouldBeLoaded(): Unit = {
    assertCurrentUrl()
    assertCurrentPageTitle()
    assertCurrentPageService()
    assertCurrentPageHeader()
  }

  def startShouldBeLoaded(): Unit = {
    assertCurrentUrl()
    assertCurrentPageTitle()
    assertCurrentPageHeader()
  }

}
