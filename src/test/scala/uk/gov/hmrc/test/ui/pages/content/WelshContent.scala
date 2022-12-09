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

  def ddGuaranteeContent(): String = {
    s"""Y Warant Debyd Uniongyrchol
       |Cynigir y Warant hon gan bob banc a chymdeithas adeiladu sy’n derbyn cyfarwyddiadau i dalu Debydau Uniongyrchol.
       |Os oes unrhyw newidiadau i swm, dyddiad neu amlder eich Debyd Uniongyrchol, bydd NDDS CThEF yn rhoi gwybod i chi 10 diwrnod gwaith cyn i’ch cyfrif gael ei ddebydu, neu fel y cytunwyd fel arall. Os byddwch yn gwneud cais i NDDS CThEF gasglu taliad, rhoddir cadarnhad o’r swm a’r dyddiad i chi ar adeg y cais.
       |Os gwneir camgymeriad gan NDDS CThEF neu eich banc neu’ch cymdeithas adeiladu wrth dalu Debyd Uniongyrchol, mae gennych hawl i ad-daliad llawn a di-oed o’r swm a dalwyd o’ch banc neu’ch cymdeithas adeiladu. Os byddwch yn cael ad-daliad nad oes hawl gennych iddo, bydd yn rhaid i chi ei dalu’n ôl pan fydd NDDS CThEF yn gofyn i chi wneud hynny.
       |Gallwch ganslo Debyd Uniongyrchol ar unrhyw adeg drwy gysylltu â’ch banc neu’ch cymdeithas adeiladu. Efallai y bydd angen cadarnhad ysgrifenedig. Rhowch wybod i ni hefyd.""".stripMargin
  }

  def successConfirmationContent(): String = {
    s"""Mae’ch cynllun talu wedi’i sefydlu
       |Eich cyfeirnod talu yw
       |ABCDabcd1234
       |Yr hyn sy’n digwydd nesaf
       |Byddwn yn anfon llythyr atoch drwy’r post i gadarnhau bod eich cyfarwyddyd Debyd Uniongyrchol wedi’i sefydlu cyn pen 10 diwrnod gwaith.
       |Caiff eich taliad nesaf ei gymryd ar 28ain Chwefror 2020 neu ar y diwrnod gwaith nesaf.
       |Bydd eich cyfrif treth yn cael ei ddiweddaru gyda’ch cynllun talu cyn pen 24 awr.
       |Bwrw golwg dros eich cynllun talu
       |Os oes angen i chi newid eich cynllun talu
       |Ffoniwch Wasanaeth Cwsmeriaid Cymraeg CThEF ar 0300 200 1900.
       |Ewch i’r cyfrif treth
       |Beth oedd eich barn am y gwasanaeth hwn? (mae’n cymryd 30 eiliad)
       |A yw’r dudalen hon yn gweithio’n iawn? (yn agor mewn tab newydd)""".stripMargin
  }

  def successConfirmationUpfrontContent(): String = {
    s"""Caiff eich taliad ymlaen llaw ei gymryd cyn pen 10 diwrnod gwaith. Caiff eich taliad nesaf ei gymryd ar 28ain Chwefror 2020 neu ar y diwrnod gwaith nesaf.""".stripMargin
  }

  def callUsNotEligibleContent(): String = {
    s"""Ffoniwch ni
       |Nid ydych yn gymwys i drefnu cynllun talu ar-lein.
       |I gael cymorth pellach, gallwch gysylltu â Gwasanaeth Cwsmeriaid Cymraeg CThEF ar 0300 200 1900 i siarad ag ymgynghorydd.
       |Os na allwch ddefnyddio meddalwedd adnabod lleferydd
       |Cael gwybod sut i ddelio â CThEF os oes angen cymorth ychwanegol arnoch.
       |Gallwch hefyd ddefnyddio Relay UK os na allwch glywed na siarad dros y ffôn: deialwch 18001 ac yna 0345 300 3900.
       |Os ydych y tu allan i’r DU: +44 300 200 1900
       |Cyn i chi ffonio, sicrhewch fod gennych y canlynol:
       |gwybodaeth am unrhyw gynilion neu fuddsoddiadau sydd gennych
       |eich manylion banc
       |manylion eich incwm a’ch gwariant
       |Rydym yn debygol o ofyn y canlynol:
       |beth rydych wedi’i wneud i geisio talu’r bil
       |a allwch dalu rhywfaint o’r bil nawr
       |Ein horiau agor yw:
       |Dydd Llun i ddydd Gwener: 08:30 i 17:00 (rydym ar gau ar benwythnosau a gwyliau banc)
       |A yw’r dudalen hon yn gweithio’n iawn? (yn agor mewn tab newydd)""".stripMargin
  }

  def callUsNotEnrolledContent(): String = {
    s"""Ffoniwch ni
       |Mae’n bosibl y gallwch drefnu cynllun talu dros y ffôn o hyd, ond nid ydych yn gymwys i gael cynllun talu ar-lein.
       |Rydym yn argymell eich bod yn siarad ag ymgynghorydd am eich opsiynau talu. Ffoniwch Wasanaeth Cwsmeriaid Cymraeg CThEF ar 0300 200 1900.
       |Os na allwch ddefnyddio meddalwedd adnabod lleferydd
       |Cael gwybod sut i ddelio â CThEF os oes angen cymorth ychwanegol arnoch.
       |Gallwch hefyd ddefnyddio Relay UK os na allwch glywed na siarad dros y ffôn: deialwch 18001 ac yna 0345 300 3900.
       |Os ydych y tu allan i’r DU: +44 300 200 1900
       |Cyn i chi ffonio, sicrhewch fod gennych y canlynol:
       |gwybodaeth am unrhyw gynilion neu fuddsoddiadau sydd gennych
       |eich manylion banc
       |Rydym yn debygol o ofyn y canlynol:
       |beth rydych wedi’i wneud i geisio talu’r bil
       |a allwch dalu rhywfaint o’r bil nawr
       |Ein horiau agor yw:
       |Dydd Llun i ddydd Gwener: 08:30 i 17:00 (rydym ar gau ar benwythnosau a gwyliau banc)
       |A yw’r dudalen hon yn gweithio’n iawn? (yn agor mewn tab newydd)""".stripMargin
  }

  def callUsNotDebtTooLargeContent(): String = {
    s"""Ffoniwch ni
       |I fod yn gymwys i drefnu cynllun talu ar-lein, mae’n rhaid i’r dreth sydd arnoch fod yn £30,000 neu’n llai.
       |I gael cymorth pellach, gallwch gysylltu â Gwasanaeth Cwsmeriaid Cymraeg CThEF ar 0300 200 1900 i siarad ag ymgynghorydd.
       |Os na allwch ddefnyddio meddalwedd adnabod lleferydd
       |Cael gwybod sut i ddelio â CThEF os oes angen cymorth ychwanegol arnoch.
       |Gallwch hefyd ddefnyddio Relay UK os na allwch glywed na siarad dros y ffôn: deialwch 18001 ac yna 0345 300 3900.
       |Os ydych y tu allan i’r DU: +44 300 200 1900
       |Cyn i chi ffonio, sicrhewch fod gennych y canlynol:
       |gwybodaeth am unrhyw gynilion neu fuddsoddiadau sydd gennych
       |eich manylion banc
       |Rydym yn debygol o ofyn y canlynol:
       |beth rydych wedi’i wneud i geisio talu’r bil
       |a allwch dalu rhywfaint o’r bil nawr
       |Ein horiau agor yw:
       |Dydd Llun i ddydd Gwener: 08:30 i 17:00 (rydym ar gau ar benwythnosau a gwyliau banc)
       |A yw’r dudalen hon yn gweithio’n iawn? (yn agor mewn tab newydd)""".stripMargin
  }

  def needToFileContent(): String = {
    s"""Cyflwynwch eich Ffurflen Dreth er mwyn defnyddio’r gwasanaeth hwn
       |I fod yn gymwys i drefnu cynllun talu ar-lein, mae’n rhaid i chi fod wedi cyflwyno’ch Ffurflen Dreth Hunanasesiad. Pan fyddwch wedi gwneud hyn, gallwch ddychwelyd i’r gwasanaeth.
       |Ewch i’ch cyfrif treth er mwyn cyflwyno’ch Ffurflen Dreth Hunanasesiad.
       |I gael cymorth pellach, gallwch gysylltu â Gwasanaeth Cwsmeriaid Cymraeg CThEF ar 0300 200 1900 i siarad ag ymgynghorydd.
       |Os na allwch ddefnyddio meddalwedd adnabod lleferydd
       |Cael gwybod sut i ddelio â CThEF os oes angen cymorth ychwanegol arnoch.
       |Gallwch hefyd ddefnyddio Relay UK os na allwch glywed na siarad dros y ffôn: deialwch 18001 ac yna 0345 300 3900.
       |Os ydych y tu allan i’r DU: +44 300 200 1900
       |Ein horiau agor yw:
       |Dydd Llun i ddydd Gwener: 08:30 i 17:00 (rydym ar gau ar benwythnosau a gwyliau banc)
       |A yw’r dudalen hon yn gweithio’n iawn? (yn agor mewn tab newydd)""".stripMargin
  }

  def taxLiabilitiesContent(): String = {
    s"""Mae’ch bil treth Hunanasesiad yn dod i gyfanswm o £3,012.55
       |Datganiad Hunanasesiad
       |Yn ddyledus erbyn 31ain Ionawr 2020
       |Taliad mantoli ar gyfer blwyddyn dreth 2018 i 2019
       |£1,012.55
       |(yn cynnwys llog a ychwanegwyd hyd yn hyn)
       |Yn ddyledus erbyn 31ain Ionawr 2020
       |Taliad ar gyfrif cyntaf ar gyfer blwyddyn dreth 2019 i 2020
       |£1,000
       |(yn cynnwys llog a ychwanegwyd hyd yn hyn)
       |Yn ddyledus erbyn 31ain Gorffennaf 2020
       |Ail daliad ar gyfrif ar gyfer blwyddyn dreth 2019 i 2020
       |£1,000
       |(yn cynnwys llog a ychwanegwyd hyd yn hyn)
       |Yn eich blaen
       |A yw’r dudalen hon yn gweithio’n iawn? (yn agor mewn tab newydd)""".stripMargin
  }

  def viewPaymentPlanContent(): String = {
    s"""Eich cynllun talu
       |Cyfeirnod y taliad ABCDabcd1234
       |Swm y taliad ymlaen llaw £0
       |Taliadau misol
       |Mae taliadau’n cael eu casglu ar 28ain neu ar y diwrnod gwaith nesaf
       |Chwefror 2020 £502.09
       |Mawrth 2020 £502.09
       |Ebrill 2020 £502.09
       |Mai 2020 £502.09
       |Mehefin 2020 £502.09
       |Gorffennaf 2020 £515.12
       |Amcangyfrif o gyfanswm y llog
       |wedi’i gynnwys yn eich taliadau misol
       |£13.03
       |Y cyfanswm i’w dalu £3,025.58
       |Argraffwch gopi o’ch cynllun talu
       |A yw’r dudalen hon yn gweithio’n iawn? (yn agor mewn tab newydd)""".stripMargin
  }

  def upfrontPaymentContent(): String = {
    s"""TBC""".stripMargin
  }

  // template function
  def templateText(): String = {
    s"""
       |
       |""".stripMargin
  }
}
