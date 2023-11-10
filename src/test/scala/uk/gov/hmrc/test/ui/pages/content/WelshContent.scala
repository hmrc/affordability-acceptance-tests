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

package uk.gov.hmrc.test.ui.pages.content

object WelshContent {

  def startPageContent(): String = {
    s"""Trefnu cynllun talu
       |Mae cynllun talu yn eich galluogi i dalu’ch taliadau treth fesul rhandaliad dros gyfnod o amser.
       |Mae eich cynllun yn cwmpasu’r dreth sydd arnoch ac, os yw’n berthnasol, y ddau daliad ymlaen llaw tuag at eich bil treth. Mae’r cynllun hefyd yn cwmpasu unrhyw gosbau neu daliadau yn erbyn eich cyfrif. Bydd yn rhaid i chi dalu llog ar y swm a dalwch yn hwyr.
       |I fod yn gymwys i sefydlu cynllun talu ar-lein, mae’n rhaid i’r canlynol fod yn wir amdanoch:
       |mae’n rhaid i chi sicrhau bod eich Ffurflenni Treth yn gyfredol
       |mae arnoch £30,000 neu lai
       |nid oes gennych unrhyw ddyledion treth eraill
       |nid ydych wedi sefydlu cynlluniau talu eraill gyda CThEF
       |Gallwch ddefnyddio’r gwasanaeth hwn cyn pen 60 diwrnod i’r dyddiad cau ar gyfer talu.
       |Cyn i chi ddechrau
       |Bwriad CThEF yw y bydd hwn yn gynllun talu un-tro er mwyn rhoi cymorth ychwanegol i chi. Mae’n rhaid i chi sicrhau eich bod yn gwneud eich taliadau mewn pryd. Os na fyddwch, mae’n bosibl y bydd CThEF yn gofyn i chi dalu’r swm cyfan sy’n weddill.
       |Er mwyn sefydlu’r cynllun talu, bydd angen i chi wybod beth yw’ch incwm a’ch gwariant misol, ac unrhyw gynilion neu fuddsoddiadau.
       |Dechrau nawr
       |A yw’r dudalen hon yn gweithio’n iawn? (yn agor tab newydd)""".stripMargin
  }

  def cannotSetupDDContent(): String = {
    s"""Ni allwch drefnu Debyd Uniongyrchol ar-lein
       |Mae angen rhywun sydd wedi’i enwi’n ddeiliad y cyfrif, neu rywun ag awdurdod, er mwyn trefnu Debyd Uniongyrchol.
       |Os nad chi yw deiliad y cyfrif, neu os ydych yn dymuno trefnu Debyd Uniongyrchol gyda chyfrif aml-lofnod, rydym yn argymell eich bod yn siarad ag ymgynghorydd ar 0300 200 1900 yn y Gwasanaeth Cwsmeriaid Cymraeg. Rhaid i chi sicrhau bod holl ddeiliaid y cyfrif yn bresennol wrth ffonio.
       |Ein horiau agor yw Dydd Llun i Ddydd Gwener, 08:30 i 17:00. Rydym ar gau ar benwythnosau a gwyliau banc.
       |Os oes angen cymorth ychwanegol arnoch chi
       |Dysgwch am y ffyrdd gwahanol o ddelio â CThEF os oes angen help arnoch chi.
       |Gallwch hefyd ddefnyddio Relay UK os na allwch glywed na siarad dros y ffôn: deialwch 18001 ac yna 0345 300 3900. Sylwer – dim ond galwadau ffôn Saesneg eu hiaith y mae Relay UK yn gallu ymdrin â nhw.
       |Os ydych y tu allan i’r DU: +44 300 200 1900.
       |Ewch i’r cyfrif treth
       |A yw’r dudalen hon yn gweithio’n iawn? (yn agor tab newydd)""".stripMargin
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
       |A yw’r dudalen hon yn gweithio’n iawn? (yn agor tab newydd)""".stripMargin
  }

  def setupDirectDebitContent(): String = {
    s"""Trefnu Debyd Uniongyrchol
       |Yr enw sydd ar y cyfrif
       |Cod didoli
       |Mae’n rhaid i hyn fod yn 6 digid o hyd
       |Rhif y cyfrif
       |Mae’n rhaid iddo fod rhwng 6 ac 8 digid o hyd
       |Yn eich blaen
       |A yw’r dudalen hon yn gweithio’n iawn? (yn agor tab newydd)""".stripMargin
  }

  def termsAndConditionsContent(): String = {
    s"""Telerau ac amodau
       |Gallwn ganslo’r cytundeb hwn os:
       |ydych yn talu’n hwyr neu’n methu taliad
       |ydych yn talu bil treth arall yn hwyr
       |nad ydych yn cyflwyno’ch Ffurflenni Treth yn y dyfodol mewn pryd
       |!
       |Rhybudd
       |Os byddwn yn canslo’r cytundeb hwn, bydd yn rhaid i chi dalu’r cyfanswm sydd arnoch ar unwaith.
       |Gallwn ddefnyddio unrhyw ad-daliadau y gallech eu cael i dalu’ch taliadau treth.
       |Nid yw’r cynllun hwn yn cwmpasu’ch biliau treth yn y dyfodol. Bydd dal angen i chi dalu eich biliau yn y dyfodol yn llawn ac mewn pryd.
       |Cysylltwch â CThEF ar 0300 200 1900 os yw un o’r canlynol yn berthnasol:
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
       |A yw’r dudalen hon yn gweithio’n iawn? (yn agor tab newydd)""".stripMargin
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
       |A yw’r dudalen hon yn gweithio’n iawn? (yn agor tab newydd)""".stripMargin
  }

  def successConfirmationUpfrontContent(): String = {
    s"""Caiff eich taliad ymlaen llaw ei gymryd cyn pen 6 diwrnod gwaith. Caiff eich taliad nesaf ei gymryd ar 28ain Chwefror 2020 neu ar y diwrnod gwaith nesaf.""".stripMargin
  }

  def callUsNotEligibleContent(): String = {
    s"""Ffoniwch ni ynghylch cynllun talu
       |Nid ydych yn gymwys i drefnu cynllun talu Hunanasesiad ar-lein.
       |Ffoniwch ni ar 0300 200 1900 oherwydd mae’n bosibl y gallwch drefnu cynllun dros y ffôn.
       |Ein horiau agor yw Dydd Llun i Ddydd Gwener, 08:30 i 17:00. Rydym ar gau ar benwythnosau a gwyliau banc.
       |Os oes angen cymorth ychwanegol arnoch chi
       |Dysgwch am y ffyrdd gwahanol o ddelio â CThEF os oes angen help arnoch chi.
       |Gallwch hefyd ddefnyddio Relay UK os na allwch glywed na siarad dros y ffôn: deialwch 18001 ac yna 0345 300 3900. Sylwer – dim ond galwadau ffôn Saesneg eu hiaith y mae Relay UK yn gallu ymdrin â nhw.
       |Os ydych y tu allan i’r DU: +44 300 200 1900.
       |Cyn i chi ffonio, sicrhewch fod gennych y canlynol:
       |eich Cyfeirnod Unigryw y Trethdalwr (UTR) 10 digid
       |gwybodaeth am unrhyw gynilion neu fuddsoddiadau sydd gennych
       |eich manylion banc
       |manylion eich incwm a’ch gwariant
       |Rydym yn debygol o ofyn y canlynol:
       |beth rydych wedi’i wneud i geisio talu’r bil
       |a allwch dalu rhywfaint o’r bil nawr
       |A yw’r dudalen hon yn gweithio’n iawn? (yn agor tab newydd)""".stripMargin
  }

  def callUsAdviserContent(): String = {
    s"""Trefnu cynllun talu ag ymgynghorydd
       |Mae’n angen i’r cynllun talu rydych wedi’i ddewis gael ei drefnu ag ymgynghorydd.
       |Gallwch fynd yn ôl i wirio’ch incwm a’ch gwariant.
       |Cysylltu ag ymgynghorydd
       |Ffoniwch ni ar 0300 200 1900 i sefydlu cynllun talu dros y ffôn.
       |Mae ein llinellau ffôn ar agor o 08:30 tan 17:00, ddydd Llun i ddydd Gwener. Rydym yn ar gau ar benwythnosau a gwyliau banc.
       |Gallwch hefyd ddefnyddio ein gwasanaeth sgwrsio dros y we (yn agor tab newydd) i drefnu cynllun talu ar-lein ag ymgynghorydd. Mae’r gwasanaeth i sgwrsio dros y we ar gael yn Saesneg yn unig.
       |Mae’r gwasanaeth i sgwrsio dros y we ar gael o ddydd Llun i ddydd Gwener, o 08:00 i 18:00. Mae ar gau ar benwythnosau a gwyliau banc.
       |Cadwch y dudalen hon ar agor pan fyddwch wedi cysylltu ag ymgynghorydd.
       |Os oes angen cymorth ychwanegol arnoch chi
       |Dysgwch am y ffyrdd gwahanol o ddelio â CThEF os oes angen help arnoch chi.
       |Gallwch hefyd defnyddio Relay UK os na allwch glywed na siarad dros y ffôn: deialwch 18001 ac yna 0345 300 3900. Sylwer – dim ond galwadau ffôn Saesneg eu hiaith y mae Relay UK yn gallu ymdrin â nhw.
       |Os ydych y tu allan i’r DU: +44 2890 538 192.
       |A yw’r dudalen hon yn gweithio’n iawn? (yn agor tab newydd)""".stripMargin
  }

  def callUsNotEnrolledContent(): String = {
    s"""Ffoniwch ni ynghylch cynllun talu
       |Nid ydych yn gymwys i drefnu cynllun talu Hunanasesiad ar-lein.
       |Ffoniwch ni ar 0300 200 1900 oherwydd mae’n bosibl y gallwch drefnu cynllun dros y ffôn.
       |Ein horiau agor yw Dydd Llun i Ddydd Gwener, 08:30 i 17:00. Rydym ar gau ar benwythnosau a gwyliau banc.
       |Os oes angen cymorth ychwanegol arnoch chi
       |Dysgwch am y ffyrdd gwahanol o ddelio â CThEF os oes angen help arnoch chi.
       |Gallwch hefyd ddefnyddio Relay UK os na allwch glywed na siarad dros y ffôn: deialwch 18001 ac yna 0345 300 3900. Sylwer – dim ond galwadau ffôn Saesneg eu hiaith y mae Relay UK yn gallu ymdrin â nhw.
       |Os ydych y tu allan i’r DU: +44 300 200 1900.
       |Cyn i chi ffonio, sicrhewch fod gennych y canlynol:
       |eich Cyfeirnod Unigryw y Trethdalwr (UTR) 10 digid
       |gwybodaeth am unrhyw gynilion neu fuddsoddiadau sydd gennych
       |eich manylion banc
       |manylion eich incwm a’ch gwariant
       |Rydym yn debygol o ofyn y canlynol:
       |beth rydych wedi’i wneud i geisio talu’r bil
       |a allwch dalu rhywfaint o’r bil nawr
       |A yw’r dudalen hon yn gweithio’n iawn? (yn agor tab newydd)""".stripMargin
  }

  def callUsNotDebtTooLargeContent(): String = {
    s"""Ffoniwch ni ynghylch cynllun talu
       |Ni allwch drefnu cynllun talu Hunanasesiad ar-lein oherwydd mae arnoch dros £30,000.
       |Ffoniwch ni ar 0300 200 1900 oherwydd mae’n bosibl y gallwch drefnu cynllun dros y ffôn.
       |Ein horiau agor yw Dydd Llun i Ddydd Gwener, 08:30 i 17:00. Rydym ar gau ar benwythnosau a gwyliau banc.
       |Os oes angen cymorth ychwanegol arnoch chi
       |Dysgwch am y ffyrdd gwahanol o ddelio â CThEF os oes angen help arnoch chi.
       |Gallwch hefyd ddefnyddio Relay UK os na allwch glywed na siarad dros y ffôn: deialwch 18001 ac yna 0345 300 3900. Sylwer – dim ond galwadau ffôn Saesneg eu hiaith y mae Relay UK yn gallu ymdrin â nhw.
       |Os ydych y tu allan i’r DU: +44 300 200 1900.
       |Cyn i chi ffonio, sicrhewch fod gennych y canlynol:
       |eich Cyfeirnod Unigryw y Trethdalwr (UTR) 10 digid
       |gwybodaeth am unrhyw gynilion neu fuddsoddiadau sydd gennych
       |eich manylion banc
       |manylion eich incwm a’ch gwariant
       |Rydym yn debygol o ofyn y canlynol:
       |beth rydych wedi’i wneud i geisio talu’r bil
       |a allwch dalu rhywfaint o’r bil nawr
       |A yw’r dudalen hon yn gweithio’n iawn? (yn agor tab newydd)""".stripMargin
  }

  def callUsDebtTooOldContent(): String = {
    s"""Ffoniwch ni ynghylch cynllun talu
       |Ni allwch drefnu cynllun talu Hunanasesiad ar-lein oherwydd roedd y dyddiad cau ar gyfer talu dros 60 diwrnod yn ôl.
       |Ffoniwch ni ar 0300 200 1900 oherwydd mae’n bosibl y gallwch drefnu cynllun dros y ffôn.
       |Ein horiau agor yw Dydd Llun i Ddydd Gwener, 08:30 i 17:00. Rydym ar gau ar benwythnosau a gwyliau banc.
       |Os oes angen cymorth ychwanegol arnoch chi
       |Dysgwch am y ffyrdd gwahanol o ddelio â CThEF os oes angen help arnoch chi.
       |Gallwch hefyd ddefnyddio Relay UK os na allwch glywed na siarad dros y ffôn: deialwch 18001 ac yna 0345 300 3900. Sylwer – dim ond galwadau ffôn Saesneg eu hiaith y mae Relay UK yn gallu ymdrin â nhw.
       |Os ydych y tu allan i’r DU: +44 300 200 1900.
       |Cyn i chi ffonio, sicrhewch fod gennych y canlynol:
       |eich Cyfeirnod Unigryw y Trethdalwr (UTR) 10 digid
       |gwybodaeth am unrhyw gynilion neu fuddsoddiadau sydd gennych
       |eich manylion banc
       |manylion eich incwm a’ch gwariant
       |Rydym yn debygol o ofyn y canlynol:
       |beth rydych wedi’i wneud i geisio talu’r bil
       |a allwch dalu rhywfaint o’r bil nawr
       |A yw’r dudalen hon yn gweithio’n iawn? (yn agor tab newydd)""".stripMargin
  }

  def needToFileContent(): String = {
    s"""Cyflwynwch eich Ffurflen Dreth Hunanasesiad er mwyn defnyddio’r gwasanaeth hwn
       |Mae’n rhaid i chi gyflwyno’ch Ffurflen Dreth cyn i chi allu trefnu cynllun talu ar gyfer Hunanasesiad ar-lein.
       |Ffoniwch ni ar 0300 200 1900 os oes angen i chi siarad ag ymgynghorydd.
       |Ein horiau agor yw Dydd Llun i Ddydd Gwener, 08:30 i 17:00. Rydym ar gau ar benwythnosau a gwyliau banc.
       |Os oes angen cymorth ychwanegol arnoch chi
       |Dysgwch am y ffyrdd gwahanol o ddelio â CThEF os oes angen help arnoch chi.
       |Gallwch hefyd ddefnyddio Relay UK os na allwch glywed na siarad dros y ffôn: deialwch 18001 ac yna 0345 300 3900. Sylwer – dim ond galwadau ffôn Saesneg eu hiaith y mae Relay UK yn gallu ymdrin â nhw.
       |Os ydych y tu allan i’r DU: +44 300 200 1900.
       |A yw’r dudalen hon yn gweithio’n iawn? (yn agor tab newydd)""".stripMargin
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
       |A yw’r dudalen hon yn gweithio’n iawn? (yn agor tab newydd)""".stripMargin
  }

  def viewPaymentPlanContent(): String = {
    s"""Eich cynllun talu
       |Cyfeirnod y taliad ABCDabcd1234
       |Swm y taliad ymlaen llaw £0
       |Taliadau misol
       |Mae taliadau’n cael eu casglu ar 28ain neu ar y diwrnod gwaith nesaf
       |Cynllun talu
       |Chwefror 2020 £231.73
       |Mawrth 2020 £231.73
       |Ebrill 2020 £231.73
       |Mai 2020 £231.73
       |Mehefin 2020 £231.73
       |Gorffennaf 2020 £231.73
       |Awst 2020 £231.73
       |Medi 2020 £231.73
       |Hydref 2020 £231.73
       |Tachwedd 2020 £231.73
       |Rhagfyr 2020 £231.73
       |Ionawr 2021 £231.73
       |Chwefror 2021 £268.94
       |Amcangyfrif o gyfanswm y llog
       |Yn gynwysedig yn eich cynllun
       |£37.21
       |Y cyfanswm i’w dalu £3,049.76
       |Argraffwch gopi o’ch cynllun talu
       |A yw’r dudalen hon yn gweithio’n iawn? (yn agor tab newydd)""".stripMargin
  }

  def upfrontPaymentContent(): String = {
    s"""Taliad ymlaen llaw
       |Bydd eich taliadau misol yn is os gallwch wneud taliad ymlaen llaw. Caiff y taliad hwn ei gymryd o’ch cyfrif banc cyn pen 6 diwrnod gwaith.
       |Os oes gennych gynilion, dylech ystyried eu defnyddio i wneud taliad nawr.
       |A allwch wneud taliad ymlaen llaw?
       |Iawn
       |Na
       |
       |Yn eich blaen
       |A yw’r dudalen hon yn gweithio’n iawn? (yn agor tab newydd)""".stripMargin
  }

  def paymentSummaryContent(): String = {
    s"""Crynodeb o’r taliadau
       |A allwch wneud taliad ymlaen llaw? Iawn Newid
       |p’un a allwch wneud taliad ymlaen llaw
       |Taliad ymlaen llaw
       |I’w gymryd cyn pen 6 diwrnod gwaith £200 Newid
       |swm y taliad ymlaen llaw
       |Swm sy’n weddill i’w dalu £2,812.55
       |Bydd llog yn cael ei ychwanegu at y swm hwn
       |Yn eich blaen
       |A yw’r dudalen hon yn gweithio’n iawn? (yn agor tab newydd)""".stripMargin
  }

  def upfrontPaymentAmountContent(): String = {
    s"""Faint y gallwch ei dalu ymlaen llaw?
       |Nodwch swm sydd rhwng £1 a £3,010.55
       |£
       |Yn eich blaen
       |A yw’r dudalen hon yn gweithio’n iawn? (yn agor tab newydd)""".stripMargin
  }

  def whatDayOfMonthContent(): String = {
    s"""Ar ba ddiwrnod a ydych eisiau talu bob mis?
       |yr 28ain neu’r diwrnod gwaith nesaf
       |Diwrnod gwahanol
       |Yn eich blaen
       |A yw’r dudalen hon yn gweithio’n iawn? (yn agor tab newydd)""".stripMargin
  }

  def checkYouCanAffordContent(): String = {
    s"""Mae angen i ni wirio eich bod yn gallu fforddio’r cynllun talu
       |I wneud yn siŵr eich bod yn gallu fforddio’r cynllun talu ar gyfer y £3,012.55 sy’n weddill, mae angen i ni ofyn i chi am eich incwm a’ch gwariant. Byddwn yn defnyddio’r wybodaeth hon i wirio faint o incwm sy’n weddill gennych yn dilyn eich gwariant misol hanfodol.
       |Mae’n bosibl y bydd angen i chi edrych ar gyfriflenni banc neu filiau cyfleustodau cyn i chi fynd yn eich blaen. Mae’n bosibl y bydd CThEF yn gofyn am dystiolaeth o’ch incwm a’ch gwariant.
       |Os byddwch yn penderfynu ein ffonio, byddwn yn dal i ofyn i chi am eich incwm a’ch gwariant.
       |Sut yr ydym yn cyfrifo’ch cynllun
       |Rydym yn disgwyl i chi ddefnyddio tua hanner yr incwm sy’n weddill gennych i dalu’r dreth sydd arnoch. Mae hyn i’ch helpu i:
       |fforddio’ch taliadau misol
       |rheoli unrhyw newidiadau annisgwyl mewn gwariant
       |Gallwch ddewis talu mwy na hanner eich incwm sy’n weddill. Bydd hyn yn gostwng y llog y byddwch yn ei dalu.
       |Yn eich blaen
       |A yw’r dudalen hon yn gweithio’n iawn? (yn agor tab newydd)""".stripMargin
  }

  def addIncomeAndSpendingContentBlank(): String = {
    s"""Ychwanegu eich incwm a’ch gwariant
       |1. Incwm
       |Ychwanegu incwm
       |2. Gwariant
       |Ychwanegu gwariant
       |A yw’r dudalen hon yn gweithio’n iawn? (yn agor tab newydd)""".stripMargin
  }

  def addIncomeAndSpendingContentIncomeFull(): String = {
    s"""Ychwanegu eich incwm a’ch gwariant
       |1. Incwm
       |Newid incwm
       |Incwm misol ar ôl treth
       |£100
       |Budd-daliadau
       |£200
       |Incwm misol arall
       |£300
       |Cyfanswm eich incwm
       |£600
       |2. Gwariant
       |Ychwanegu gwariant
       |A yw’r dudalen hon yn gweithio’n iawn? (yn agor tab newydd)""".stripMargin
  }

  def addIncomeAndSpendingContentSpendingFull(): String = {
    s"""Ychwanegu eich incwm a’ch gwariant
       |1. Incwm
       |Ychwanegu incwm
       |2. Gwariant
       |Newid gwariant
       |Tai
       |£10
       |Cyfraniadau pensiwn
       |£10
       |Treth Gyngor
       |£10
       |Cyfleustodau
       |£10
       |Ad-daliadau dyledion
       |£10
       |Teithio
       |£10
       |Costau gofal plant
       |£10
       |Yswiriant
       |£10
       |Nwyddau Groser
       |£10
       |Iechyd
       |£10
       |Cyfanswm y gwariant
       |£100
       |A yw’r dudalen hon yn gweithio’n iawn? (yn agor tab newydd)""".stripMargin
  }

  def addIncomeContent(): String = {
    s"""Eich incwm misol
       |Ychwanegwch wybodaeth amdanoch chi’ch hun yn unig.
       |Incwm
       |Incwm misol ar ôl treth
       |Os nad oes gennych incwm misol rheolaidd, nodwch amcangyfrif.
       |£
       |Budd-daliadau
       |Er enghraifft, Credyd Cynhwysol, credydau treth
       |£
       |Incwm misol arall
       |Er enghraifft, incwm rhent, difidendau
       |£
       |Yn eich blaen
       |A yw’r dudalen hon yn gweithio’n iawn? (yn agor tab newydd)""".stripMargin
  }

  def addSpendingContent(): String = {
    s"""Eich gwariant misol
       |Ychwanegwch wybodaeth amdanoch chi’ch hun yn unig. Os ydych yn byw gyda phobl eraill, nodwch eich cyfran chi o’r gwariant. Gallwch adael blwch yn wag os nad yw’n berthnasol i chi.
       |Tai
       |Er enghraifft, morgais, rhent, atgyweiriadau
       |£
       |Cyfraniadau pensiwn
       |£
       |Treth Gyngor
       |£
       |Cyfleustodau
       |Er enghraifft, ynni, dŵr, ffôn, band eang
       |£
       |Ad-daliadau dyledion
       |Er enghraifft, benthyciad, taliadau Gorchymyn Llys
       |£
       |Teithio
       |Er enghraifft, cerbydau, tanwydd, tocynnau tymor
       |£
       |Costau gofal plant
       |Er enghraifft, addysg, taliadau cynhaliaeth
       |£
       |Yswiriant
       |Er enghraifft, iechyd, car, cartref
       |£
       |Nwyddau Groser
       |£
       |Iechyd
       |Er enghraifft, presgripsiynau, gofal iechyd preifat
       |£
       |Yn eich blaen
       |A yw’r dudalen hon yn gweithio’n iawn? (yn agor tab newydd)""".stripMargin
  }

  def howMuchYouCouldAffordFullHappy(): String = {
    s"""Faint y gallech ei fforddio
       |1. Incwm
       |Newid incwm
       |Incwm misol ar ôl treth
       |£100
       |Budd-daliadau
       |£200
       |Incwm misol arall
       |£300
       |Cyfanswm eich incwm
       |£600
       |2. Gwariant
       |Newid gwariant
       |Tai
       |£10
       |Cyfraniadau pensiwn
       |£10
       |Treth Gyngor
       |£10
       |Cyfleustodau
       |£10
       |Ad-daliadau dyledion
       |£10
       |Teithio
       |£10
       |Costau gofal plant
       |£10
       |Yswiriant
       |£10
       |Nwyddau Groser
       |£10
       |Iechyd
       |£10
       |Cyfanswm y gwariant
       |£100
       |3. Incwm sydd dros ben
       |Cyfanswm yr incwm sydd dros ben
       |£500
       |Hanner yr incwm sydd dros ben
       |£250
       |Yn eich blaen
       |A yw’r dudalen hon yn gweithio’n iawn? (yn agor tab newydd)""".stripMargin
  }

  def spendingMoreThanIncomeText(): String = {
    s"""Mae’ch gwariant yn fwy na’ch incwm
       |Gan fod eich gwariant yn fwy na’ch incwm, cysylltwch â Gwasanaeth Cwsmeriaid Cymraeg CThEF drwy ffonio 0300 200 1900 i drafod eich dyled. Mae’n bosibl yr hoffech geisio cyngor annibynnol ar ddyledion.""".stripMargin
  }

  def spendingSameAsIncomeText(): String = {
    s"""Mae’ch gwariant yr un faint a’ch incwm
       |Gan fod eich gwariant yr un faint a’ch incwm, cysylltwch â Gwasanaeth Cwsmeriaid Cymraeg CThEF drwy ffonio 0300 200 1900 i drafod eich dyled. Mae’n bosibl yr hoffech geisio cyngor annibynnol ar ddyledion.""".stripMargin
  }

  def cannotAgreePlanContent(): String = {
    s"""Ni allwn gytuno ar eich cynllun talu ar-lein
       |Mae’r symiau rydych wedi’u nodi ar gyfer eich incwm a’ch gwariant yn golygu na allwch sefydlu cynllun talu ar-lein.
       |A ydych wedi nodi’r wybodaeth yn gywir? Gallwch newid eich incwm a’ch gwariant.
       |Mae’n bosibl y byddwch yn gallu sefydlu cynllun talu dros y ffôn. Ffoniwch y Gwasanaeth Cwsmeriaid Cymraeg CThEF ar 0300 200 1900 i drafod eich opsiynau.
       |Ein horiau agor yw Dydd Llun i Ddydd Gwener, 08:30 i 17:00. Rydym ar gau ar benwythnosau a gwyliau banc.
       |Os oes angen cymorth ychwanegol arnoch chi
       |Dysgwch am y ffyrdd gwahanol o ddelio â CThEF os oes angen help arnoch chi.
       |Gallwch hefyd ddefnyddio Relay UK os na allwch glywed na siarad dros y ffôn: deialwch 18001 ac yna 0345 300 3900. Sylwer – dim ond galwadau ffôn Saesneg eu hiaith y mae Relay UK yn gallu ymdrin â nhw.
       |Os ydych y tu allan i’r DU: +44 300 200 1900.
       |Ewch i’r cyfrif treth
       |A yw’r dudalen hon yn gweithio’n iawn? (yn agor tab newydd)""".stripMargin
  }

  def cannotAffordContent(): String = {
    s"""Ffoniwch ni ynghylch cynllun talu
       |Ffoniwch ni ar 0300 200 1900 oherwydd mae’n bosibl y gallwch drefnu cynllun dros y ffôn.
       |Ein horiau agor yw Dydd Llun i Ddydd Gwener, 08:30 i 17:00. Rydym ar gau ar benwythnosau a gwyliau banc.
       |Os oes angen cymorth ychwanegol arnoch chi
       |Dysgwch am y ffyrdd gwahanol o ddelio â CThEF os oes angen help arnoch chi.
       |Gallwch hefyd ddefnyddio Relay UK os na allwch glywed na siarad dros y ffôn: deialwch 18001 ac yna 0345 300 3900. Sylwer – dim ond galwadau ffôn Saesneg eu hiaith y mae Relay UK yn gallu ymdrin â nhw.
       |Os ydych y tu allan i’r DU: +44 300 200 1900.
       |Cyn i chi ffonio, sicrhewch fod gennych y canlynol:
       |eich Cyfeirnod Unigryw y Trethdalwr (UTR) 10 digid
       |gwybodaeth am unrhyw gynilion neu fuddsoddiadau sydd gennych
       |eich manylion banc
       |manylion eich incwm a’ch gwariant
       |Rydym yn debygol o ofyn y canlynol:
       |beth rydych wedi’i wneud i geisio talu’r bil
       |a allwch dalu rhywfaint o’r bil nawr
       |A yw’r dudalen hon yn gweithio’n iawn? (yn agor tab newydd)""".stripMargin
  }

  def directDebitErrorContent(): String = {
    s"""Ffoniwch ni ynghylch cynllun talu
       |Rydym yn cael anawsterau wrth gyflwyno’ch cyfarwyddyd Debyd Uniongyrchol.
       |Ffoniwch ni ar 0300 200 1900 oherwydd mae’n bosibl y gallwch drefnu cynllun dros y ffôn.
       |Ein horiau agor yw Dydd Llun i Ddydd Gwener, 08:30 i 17:00. Rydym ar gau ar benwythnosau a gwyliau banc.
       |Os oes angen cymorth ychwanegol arnoch chi
       |Dysgwch am y ffyrdd gwahanol o ddelio â CThEF os oes angen help arnoch chi.
       |Gallwch hefyd ddefnyddio Relay UK os na allwch glywed na siarad dros y ffôn: deialwch 18001 ac yna 0345 300 3900. Sylwer – dim ond galwadau ffôn Saesneg eu hiaith y mae Relay UK yn gallu ymdrin â nhw.
       |Os ydych y tu allan i’r DU: +44 300 200 1900.
       |A yw’r dudalen hon yn gweithio’n iawn? (yn agor tab newydd)""".stripMargin
  }

    def checkYouPaymentPlanContentNoUpfront(): String = {
    s"""Gwirio’ch cynllun talu
       |A allwch wneud taliad ymlaen llaw? Na Newid
       |p’un a allwch wneud taliad ymlaen llaw
       |Taliad ymlaen llaw
       |I’w gymryd cyn pen 6 diwrnod gwaith
       |£0 Newid
       |swm y taliad ymlaen llaw
       |Taliadau misol
       |Mae taliadau’n cael eu casglu ar yr 28ain neu’r diwrnod gwaith nesaf Newid
       |ar ba ddiwrnod o’r mis y caiff taliadau eu casglu
       |Cynllun talu Newid
       |ar ba ddiwrnod o’r mis y caiff taliadau eu casglu
       |Chwefror 2020 £231.73
       |Mawrth 2020 £231.73
       |Ebrill 2020 £231.73
       |Mai 2020 £231.73
       |Mehefin 2020 £231.73
       |Gorffennaf 2020 £231.73
       |Awst 2020 £231.73
       |Medi 2020 £231.73
       |Hydref 2020 £231.73
       |Tachwedd 2020 £231.73
       |Rhagfyr 2020 £231.73
       |Ionawr 2021 £231.73
       |Chwefror 2021 £268.94
       |Amcangyfrif o gyfanswm y llog
       |Yn gynwysedig yn eich cynllun
       |£37.21
       |Y cyfanswm i’w dalu £3,049.76
       |Cytuno ac yn eich blaen
       |A yw’r dudalen hon yn gweithio’n iawn? (yn agor tab newydd)""".stripMargin
  }

  def howManyMonthsText(): String = {
    s"""Dewiswch gynllun talu
       |Yn seiliedig ar yr incwm sydd gennych dros ben, gallwch nawr ddewis gynllun talu. Bydd y taliad misol olaf yn eich cynllun yn fwy oherwydd y bydd yn cynnwys llog ac unrhyw dreth sy’n weddill sydd arnoch.
       |Sut rydym yn cyfrifo llog
       |Rydym yn codi llog ar bob swm sy’n hwyr.
       |Rydym yn codi cyfradd sylfaenol Banc Lloegr ynghyd â 2.5% y flwyddyn.
       |Os bydd y gyfradd llog yn newid yn ystod eich cynllun talu, efallai bydd yn rhaid i chi setlo unrhyw wahaniaeth ar y diwedd. Byddwn yn cysylltu â chi os yw hyn yn wir.
       |Os bydd y cynllun yr ydych yn ei ddewis yn rhedeg i mewn i’r flwyddyn dreth nesaf, bydd dal angen i chi dalu’ch biliau treth yn y dyfodol mewn pryd.
       |Faint y gallwch ei dalu bob mis?
       |£231.73 y mis, am 13 mis
       |Mae hyn yn cynnwys cyfanswm y llog wedi’i amcangyfrif, sef £37.21
       |neu
       |£251.05 y mis, am 12 mis
       |Mae hyn yn cynnwys cyfanswm y llog wedi’i amcangyfrif, sef £33.56
       |£273.87 y mis, am 11 mis
       |Mae hyn yn cynnwys cyfanswm y llog wedi’i amcangyfrif, sef £29.94
       |Talu mwy bob mis
       |Nodwch swm sydd rhwng £273.87 a £1,506.28 i’w dalu dros lai o fisoedd. Byddwn yn awgrymu cynllun sydd agosaf at y swm y byddwch yn ei nodi.
       |£
       |Nid wyf yn gallu fforddio’r taliadau hyn
       |Yn eich blaen
       |A yw’r dudalen hon yn gweithio’n iawn? (yn agor tab newydd)""".stripMargin
  }

  def howManyMonthsCustomText(): String = {
    s"""Mae opsiwn cynllun talu arall wedi’i ychwanegu
       |Yn seiliedig ar yr hyn a nodwyd gennych, rydym wedi ychwanegu opsiwn cynllun talu arall. Bydd y taliad misol olaf yn eich cynllun yn fwy oherwydd y bydd yn cynnwys llog ac unrhyw dreth sy’n weddill sydd arnoch.
       |Sut rydym yn cyfrifo llog
       |Rydym yn codi llog ar bob swm sy’n hwyr.
       |Rydym yn codi cyfradd sylfaenol Banc Lloegr ynghyd â 2.5% y flwyddyn.
       |Os bydd y gyfradd llog yn newid yn ystod eich cynllun talu, efallai bydd yn rhaid i chi setlo unrhyw wahaniaeth ar y diwedd. Byddwn yn cysylltu â chi os yw hyn yn wir.
       |Os bydd y cynllun yr ydych yn ei ddewis yn rhedeg i mewn i’r flwyddyn dreth nesaf, bydd dal angen i chi dalu’ch biliau treth yn y dyfodol mewn pryd.
       |Faint y gallwch ei dalu bob mis?
       |£301.26 y mis, am 10 mis
       |Mae hyn yn cynnwys cyfanswm y llog wedi’i amcangyfrif, sef £26.31
       |neu
       |£231.73 y mis, am 13 mis
       |Mae hyn yn cynnwys cyfanswm y llog wedi’i amcangyfrif, sef £37.21
       |£251.05 y mis, am 12 mis
       |Mae hyn yn cynnwys cyfanswm y llog wedi’i amcangyfrif, sef £33.56
       |£273.87 y mis, am 11 mis
       |Mae hyn yn cynnwys cyfanswm y llog wedi’i amcangyfrif, sef £29.94
       |Talu mwy bob mis
       |Nodwch swm sydd rhwng £273.87 a £1,506.28 i’w dalu dros lai o fisoedd. Byddwn yn awgrymu cynllun sydd agosaf at y swm y byddwch yn ei nodi.
       |£
       |Nid wyf yn gallu fforddio’r taliadau hyn
       |Yn eich blaen
       |A yw’r dudalen hon yn gweithio’n iawn? (yn agor tab newydd)""".stripMargin
  }

  def noIncomePageContent(): String = {
    s"""Ffoniwch ni ynghylch cynllun talu
       |Rhoesoch wybod i ni nad oes gennych unrhyw incwm. Ni allwch drefnu cynllun talu Hunanasesiad ar-lein os nad oes gennych unrhyw incwm.
       |Ffoniwch ni ar 0300 200 1900 oherwydd mae’n bosibl y gallwch drefnu cynllun dros y ffôn.
       |Ein horiau agor yw Dydd Llun i Ddydd Gwener, 08:30 i 17:00. Rydym ar gau ar benwythnosau a gwyliau banc.
       |Os ydych wedi gwneud camgymeriad, ewch yn ôl i ychwanegu’ch incwm.
       |Os oes angen cymorth ychwanegol arnoch chi
       |Dysgwch am y ffyrdd gwahanol o ddelio â CThEF os oes angen help arnoch chi.
       |Gallwch hefyd ddefnyddio Relay UK os na allwch glywed na siarad dros y ffôn: deialwch 18001 ac yna 0345 300 3900. Sylwer – dim ond galwadau ffôn Saesneg eu hiaith y mae Relay UK yn gallu ymdrin â nhw.
       |Os ydych y tu allan i’r DU: +44 300 200 1900.
       |Ewch i’r cyfrif treth
       |A yw’r dudalen hon yn gweithio’n iawn? (yn agor tab newydd)""".stripMargin
  }

  def alreadyHavePlanPageContent(): String = {
    s"""Mae eisoes gennych gynllun talu gyda CThEF
       |Ni allwch drefnu cynllun talu Hunanasesiad ar-lein.
       |Ffoniwch ni ar 0300 200 1900 oherwydd mae’n bosibl y gallwch drefnu cynllun dros y ffôn.
       |Ein horiau agor yw Dydd Llun i Ddydd Gwener, 08:30 i 17:00. Rydym ar gau ar benwythnosau a gwyliau banc.
       |Os oes angen cymorth ychwanegol arnoch chi
       |Dysgwch am y ffyrdd gwahanol o ddelio â CThEF os oes angen help arnoch chi.
       |Gallwch hefyd ddefnyddio Relay UK os na allwch glywed na siarad dros y ffôn: deialwch 18001 ac yna 0345 300 3900. Sylwer – dim ond galwadau ffôn Saesneg eu hiaith y mae Relay UK yn gallu ymdrin â nhw.
       |Os ydych y tu allan i’r DU: +44 300 200 1900.
       |Cyn i chi ffonio, sicrhewch fod gennych y canlynol:
       |eich Cyfeirnod Unigryw y Trethdalwr (UTR) 10 digid
       |gwybodaeth am unrhyw gynilion neu fuddsoddiadau sydd gennych
       |eich manylion banc
       |manylion eich incwm a’ch gwariant
       |Rydym yn debygol o ofyn y canlynol:
       |beth rydych wedi’i wneud i geisio talu’r bil
       |a allwch dalu rhywfaint o’r bil nawr
       |A yw’r dudalen hon yn gweithio’n iawn? (yn agor tab newydd)""".stripMargin
  }

  // template function
  def templateText(): String = {
    s"""
       |
       |""".stripMargin
  }
}
