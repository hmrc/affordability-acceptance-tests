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

package uk.gov.hmrc.test.ui.pages.support

import uk.gov.hmrc.test.ui.pages.BasePage

object HelperFunctions extends BasePage {

  val url: String = ""

  def expectedPageHeader: String = ""

  def expectedPageTitle: String = ""

  def expectedPageTitleError: String = ""

  def errorSummaryHeading(): String = cssSelector("h2.govuk-error-summary__title").webElement.getText

  def errorSummary(field: String): String = id(s"$field-error-summary").webElement.getText
  //TODO to be confirmed

  def errorMessage(field: String): String = id(s"$field-error").webElement.getText
  //TODO to be confirmed

  def toggleLangOn(lang: String): Unit =
    if (lang == "cy")
      click on cssSelector("nav > ul > li:nth-child(2)")
    else if (lang == "en")
      click on cssSelector("nav > ul > li:nth-child(1)")

}
