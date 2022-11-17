/*
 * Copyright 2022 HM Revenue & Customs
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

package uk.gov.hmrc.test.ui.stepdefs.other

import uk.gov.hmrc.test.ui.pages._
import uk.gov.hmrc.test.ui.pages.support.HelperFunctions
import uk.gov.hmrc.test.ui.testdata.{Language, ScenarioContext}

class CommonSteps extends Steps with DriverActions {

  And("""^the user click continue$""") { () =>
    continue()
  }

  And("""^the user click back""") { () =>
    clickBack()
  }

  When("""^the User toggles on (Welsh|English) language$""") { option: String =>
    if (option == "Welsh") {
      HelperFunctions.toggleLangOn(Language.welsh)
      ScenarioContext.set("langToggle", Language.welsh)
    } else {
      HelperFunctions.toggleLangOn(Language.english)
      ScenarioContext.set("langToggle", Language.english)
    }
  }


}
