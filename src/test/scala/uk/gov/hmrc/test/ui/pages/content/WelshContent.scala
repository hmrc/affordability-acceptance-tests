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

package uk.gov.hmrc.test.ui.pages.content

object WelshContent {

  def cannotSetupDDContent(): String = {
    s"""Ni allwch drefnu Debyd Uniongyrchol ar-lein
       |Mae angen rhywun sydd wedi’i enwi’n ddeiliad y cyfrif, neu rywun ag awdurdod, er mwyn trefnu Debyd Uniongyrchol.
       |Os nad chi yw deiliad y cyfrif, neu os ydych yn dymuno trefnu Debyd Uniongyrchol gyda chyfrif aml-lofnod, rydym yn argymell eich bod yn siarad ag ymgynghorydd ar 0300 200 1900 yn y Gwasanaeth Cwsmeriaid Cymraeg. Rhaid i chi sicrhau bod holl ddeiliaid y cyfrif yn bresennol wrth ffonio.
       |
       |Ewch i’r cyfrif treth
       |A yw’r dudalen hon yn gweithio’n iawn? (yn agor mewn tab newydd)""".stripMargin
  }

  def aboutBankAccountContent(): String = {
    s"""Ynglŷn â’ch cyfrif banc
       |Pa fath o fanylion cyfrif yr ydych yn eu rhoi?
       |Cyfrif banc busnes
       |Cyfrif banc personol
       |Ai chi yw deiliad y cyfrif?
       |Mae’n rhaid mai chi yw’r talwr a’r unig berson sydd ei angen i awdurdodi Debyd Uniongyrchol o’r cyfrif hwn.
       |Iawn
       |Na
       |Yn eich blaen
       |A yw’r dudalen hon yn gweithio’n iawn? (yn agor mewn tab newydd)""".stripMargin
  }

  def setupDirectDebitContent(): String = {
    s"""Trefnu Debyd Uniongyrchol
       |Enter your banking details
       |Yr enw sydd ar y cyfrif
       |Cod didoli
       |Mae’n rhaid i hyn fod yn 6 digid o hyd
       |Rhif y cyfrif
       |Mae’n rhaid iddo fod rhwng 6 ac 8 digid o hyd
       |Yn eich blaen
       |A yw’r dudalen hon yn gweithio’n iawn? (yn agor mewn tab newydd)""".stripMargin
  }

  def termsAndConditionsContent(): String = {
    s"""Telerau ac amodau
       |Gallwn ganslo’r cytundeb hwn os:
       |ydych yn talu’n hwyr neu’n methu taliad
       |ydych yn talu bil treth arall yn hwyr
       |nad ydych yn cyflwyno’ch Ffurflenni Treth yn y dyfodol mewn pryd
       |!
       |Warning
       |Os byddwn yn canslo’r cytundeb hwn, bydd yn rhaid i chi dalu’r cyfanswm sydd arnoch ar unwaith.
       |Gallwn ddefnyddio unrhyw ad-daliadau y gallech eu cael i dalu’ch taliadau treth.
       |Nid yw’r cynllun hwn yn cwmpasu’ch biliau treth yn y dyfodol. Bydd dal angen i chi dalu eich biliau yn y dyfodol yn llawn ac mewn pryd.
       |Bydd angen i chi gysylltu â CThEF os yw unrhyw un o’r canlynol yn berthnasol:
       |mae unrhyw beth yn newid ac rydych o’r farn ei fod yn effeithio ar eich cynllun talu
       |mae angen i chi newid eich cynllun talu
       |Gallwch ysgrifennu atom ynglŷn â’ch Debyd Uniongyrchol:
       |Rheolaeth Dyledion
       | Hunanasesiad
       | Gwasanaeth Cwsmeriaid Cymraeg CThEF
       | HMRC
       | BX9 1ST
       |Datganiad
       |Cytunaf â thelerau ac amodau’r cynllun talu hwn. Cadarnhaf mai dyma’r cynharaf y gallaf setlo’r ddyled hon.
       |Cytuno ac yn eich blaen
       |A yw’r dudalen hon yn gweithio’n iawn? (yn agor mewn tab newydd)""".stripMargin
  }


  // template function
  def templateText(): String = {
    s"""
       |
       |""".stripMargin
  }
}
