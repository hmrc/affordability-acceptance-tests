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


object EnglishContent {

  def cannotSetupDDContent(): String = {
    s"""You cannot set up a Direct Debit online
       |You need a named account holder or someone with authorisation to set up a Direct Debit.
       |If you are not the account holder or you wish to set up a Direct Debit with a multi-signature account, we recommend you speak to an adviser on 0300 200 3835 at the Payment Support Service. You must ensure all account holders are present when calling.
       |
       |Go to tax account
       |Is this page not working properly? (opens in new tab)""".stripMargin
  }

  def aboutBankAccountContent(): String = {
    s"""About your bank account
       |What type of account details are you providing?
       |Business bank account
       |Personal bank account
       |Are you the account holder?
       |You must be the payer and the only person required to authorise a Direct Debit from this account.
       |Yes
       |No
       |Continue
       |Is this page not working properly? (opens in new tab)""".stripMargin
  }

  def setupDirectDebitContent(): String = {
    s"""Set up Direct Debit
       |Enter your banking details
       |Name on the account
       |Sort code
       |Must be 6 digits long
       |Account number
       |Must be between 6 and 8 digits long
       |Continue
       |Is this page not working properly? (opens in new tab)""".stripMargin
  }


  // template function
  def templateText(): String = {
    s"""
       |
       |""".stripMargin
  }
}
