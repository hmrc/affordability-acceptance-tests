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

  def termsAndConditionsContent(): String = {
    s"""Terms and conditions
       |We can cancel this agreement if you:
       |pay late or miss a payment
       |pay another tax bill late
       |do not submit your future tax returns on time
       |!
       |Warning
       |If we cancel this agreement, you will need to pay the total amount you owe straight away.
       |We can use any refunds you might get to pay off your tax charges.
       |This plan does not cover your future tax bills. You will still need to pay your future bills in full and on time.
       |You need to contact HMRC if:
       |anything changes that you think affects your payment plan
       |you need to change your payment plan
       |You can write to us about your Direct Debit:
       |Debt Management
       | Self Assessment
       | HM Revenue and Customs
       | BX9 1AS
       | United Kingdom
       |Declaration
       |I agree to the terms and conditions of this payment plan. I confirm that this is the earliest I am able to settle this debt.
       |Agree and continue
       |Is this page not working properly? (opens in new tab)""".stripMargin
  }

  def ddGuaranteeContent(): String = {
    s"""The Direct Debit Guarantee
       |This Guarantee is offered by all banks and building societies that accept instructions to pay Direct Debits.
       |If there are any changes to the amount, date or frequency of your Direct Debit HMRC NDDS will notify you 10 working days in advance of your account being debited or as otherwise agreed. If you request HMRC NDDS to collect a payment, confirmation of the amount and date will be given to you at the time of the request.
       |If an error is made in the payment of your Direct Debit by HMRC NDDS or your bank or building society you are entitled to a full and immediate refund of the amount paid from your bank or building society. If you receive a refund you are not entitled to, you must pay it back when HMRC NDDS asks you to.
       |You can cancel a Direct Debit at any time by simply contacting your bank or building society. Written confirmation may be required. Please also notify us.""".stripMargin
  }

  // template function
  def templateText(): String = {
    s"""
       |
       |""".stripMargin
  }
}
