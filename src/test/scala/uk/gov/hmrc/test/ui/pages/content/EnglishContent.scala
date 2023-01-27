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

  def startPageContent(): String = {
    s"""Set up a Self Assessment payment plan
       |A payment plan allows you to pay your tax charges in instalments over a period of time.
       |Your plan covers the tax you owe and, if applicable, the 2 advance payments towards your tax bill. It also covers any penalties or charges against your account. You’ll have to pay interest on the amount you pay late.
       |To be eligible to set up an online payment plan you need to:
       |ensure your tax returns are up to date
       |owe £30,000 or less
       |have no other tax debts
       |have no other HMRC payment plans set up
       |You can use this service within 60 days of the payment deadline.
       |Before you start
       |HMRC intend this as a one-off payment plan to give you extra support. You must keep up to date with your payments. If you do not, HMRC may ask you to pay the entire outstanding amount.
       |To set up the payment plan, you’ll need to know your monthly income and spending, and any savings or investments.
       |Start now
       |Is this page not working properly? (opens in new tab)""".stripMargin
  }

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
       |Contact HMRC on 0300 123 1813 if:
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

  def successConfirmationContent(): String = {
    s"""Your payment plan is set up
       |Your payment reference is
       |ABCDabcd1234
       |What happens next
       |We will send a letter by post confirming the set up of your Direct Debit instruction within 10 working days.
       |Your next payment will be taken on 28th February 2020 or the next working day.
       |Your tax account will be updated with your payment plan within 24 hours.
       |View your payment plan
       |If you need to change your payment plan
       |Call the HMRC Helpline on 0300 123 1813.
       |Go to tax account
       |What did you think of this service? (takes 30 seconds)
       |Is this page not working properly? (opens in new tab)""".stripMargin
  }

  def successConfirmationUpfrontContent(): String = {
    s"""Your upfront payment will be taken within 10 working days. Your next payment will be taken on 28th February 2020 or the next working day.""".stripMargin
  }

  def callUsNotEligibleContent(): String = {
    s"""Please call us
       |You are not eligible to set up a payment plan online.
       |For further support you can contact the Payment Support Service and speak to an adviser on 0300 200 3835.
       |If you cannot use speech recognition software
       |Find out how to deal with HMRC if you need extra support.
       |You can also use Relay UK if you cannot hear or speak on the phone: dial 18001 then 0345 300 3900.
       |If you are outside the UK: +44 2890 538 192
       |Before you call, make sure you have:
       |information on any savings or investments you have
       |your bank details
       |details of your income and spending
       |We’re likely to ask:
       |what you’ve done to try to pay the bill
       |if you can pay some of the bill now
       |Our opening times are:
       |Monday to Friday: 8am to 6pm
       |Is this page not working properly? (opens in new tab)""".stripMargin
  }

  def callUsNotEnrolledContent(): String = {
    s"""Please call us
       |You may still be able to set up a payment plan over the phone, but you are not eligible for an online payment plan.
       |We recommend you speak to an adviser on 0300 200 3835 at the Payment Support Service to talk about your payment options.
       |If you cannot use speech recognition software
       |Find out how to deal with HMRC if you need extra support.
       |You can also use Relay UK if you cannot hear or speak on the phone: dial 18001 then 0345 300 3900.
       |If you are outside the UK: +44 2890 538 192
       |Before you call, make sure you have:
       |information on any savings or investments you have
       |your bank details
       |We’re likely to ask:
       |what you’ve done to try to pay the bill
       |if you can pay some of the bill now
       |Our opening times are:
       |Monday to Friday: 8am to 6pm
       |Is this page not working properly? (opens in new tab)""".stripMargin
  }

  def callUsNotDebtTooLargeContent(): String = {
    s"""Please call us
       |To be eligible to set up a payment plan online the tax you owe must be £30,000 or less.
       |For further support you can contact the Payment Support Service and speak to an adviser on 0300 200 3835.
       |If you cannot use speech recognition software
       |Find out how to deal with HMRC if you need extra support.
       |You can also use Relay UK if you cannot hear or speak on the phone: dial 18001 then 0345 300 3900.
       |If you are outside the UK: +44 2890 538 192
       |Before you call, make sure you have:
       |information on any savings or investments you have
       |your bank details
       |We’re likely to ask:
       |what you’ve done to try to pay the bill
       |if you can pay some of the bill now
       |Our opening times are:
       |Monday to Friday: 8am to 6pm
       |Is this page not working properly? (opens in new tab)""".stripMargin
  }

  def needToFileContent(): String = {
    s"""File your return to use this service
       |To be eligible to set up a payment plan online you need to have filed your Self Assessment tax return. Once you have done this, you can return to the service.
       |Go to your tax account to file your Self Assessment tax return.
       |For further support you can contact the Payment Support Service and speak to an adviser on 0300 200 3835.
       |If you cannot use speech recognition software
       |Find out how to deal with HMRC if you need extra support.
       |You can also use Relay UK if you cannot hear or speak on the phone: dial 18001 then 0345 300 3900.
       |If you are outside the UK: +44 2890 538 192
       |Our opening times are:
       |Monday to Friday: 8am to 6pm
       |Is this page not working properly? (opens in new tab)""".stripMargin
  }

  def taxLiabilitiesContent(): String = {
    s"""Your Self Assessment tax bill is £3,012.55
       |Self Assessment statement
       |Due 31st January 2020
       |Balancing payment for tax year 2018 to 2019
       |£1,012.55
       |(includes interest added to date)
       |Due 31st January 2020
       |First payment on account for tax year 2019 to 2020
       |£1,000
       |(includes interest added to date)
       |Due 31st July 2020
       |Second payment on account for tax year 2019 to 2020
       |£1,000
       |(includes interest added to date)
       |Continue
       |Is this page not working properly? (opens in new tab)""".stripMargin
  }

  def viewPaymentPlanContent(): String = {
    s"""Your payment plan
       |Payment reference ABCDabcd1234
       |Upfront payment amount £0
       |Monthly payments
       |Payments collected on 28th or next working day
       |February 2020 £1,506.28
       |March 2020 £1,512.59
       |Estimated total interest
       |included in monthly payments
       |£6.31
       |Total to pay £3,018.86
       |Print a copy of your payment plan
       |Is this page not working properly? (opens in new tab)""".stripMargin
  }

  def upfrontPaymentContent(): String = {
    s"""Can you make an upfront payment?
       |Your monthly payments will be lower if you can make an upfront payment. This payment will be taken from your bank account within 10 working days.
       |If you have savings, consider using them to make a payment now.
       |Yes
       |No
       |
       |Continue
       |Is this page not working properly? (opens in new tab)""".stripMargin
  }

  def paymentSummaryContent(): String = {
    s"""Payment summary
       |Can you make an upfront payment? Yes Change
       |whether you can make an upfront payment
       |Upfront payment
       |Taken within 10 working days
       |£200 Change
       |upfront payment amount
       |Remaining amount to pay £2,812.55
       |Interest will be added to this amount
       |How we calculate interest
       |Continue
       |Is this page not working properly? (opens in new tab)""".stripMargin
  }

  def upfrontPaymentAmountContent(): String = {
    s"""How much can you pay upfront?
       |Enter an amount between £1 and £3,012.55
       |£
       |Continue
       |Is this page not working properly? (opens in new tab)""".stripMargin
  }

  def whatDayOfMonthContent(): String = {
    s"""Which day do you want to pay each month?
       |28th or next working day
       |A different day
       |
       |Continue
       |Continue to Affordability
       |Is this page not working properly? (opens in new tab)""".stripMargin
  }

  def checkYouCanAffordContent(): String = {
    s"""We need to check you can afford the payment plan
       |To make sure you can afford your payment plan for the remaining £3,012.55, we need to ask about your income and spending. We will use this information to check how much income you have left over after your essential monthly spending.
       |You may need to look at bank statements or utility bills before you continue. HMRC may ask for proof of your income and spending.
       |If you decide to call us, we will still ask you about your income and spending.
       |How we work out your plan
       |We expect you to pay around half of your left over income towards the tax you owe. This is to help you:
       |afford your monthly payments
       |manage any unexpected changes in spending
       |You can choose to pay more than half of your left over income. This will reduce the interest you pay.
       |Continue
       |Is this page not working properly? (opens in new tab)""".stripMargin
  }

  def addIncomeAndSpendingContentBlank(): String = {
    s"""Add your income and spending
       |Add income
       |details
       |1. Income
       |Add spending
       |details
       |2. Spending
       |Is this page not working properly? (opens in new tab)""".stripMargin
  }

  def addIncomeAndSpendingContentFull(): String = {
    s"""Add your income and spending
       |Change income
       |details
       |1. Income
       |Monthly income after tax £100
       |Benefits £200
       |Other monthly income £300
       |Total income £600
       |Add spending
       |details
       |2. Spending
       |Is this page not working properly? (opens in new tab)""".stripMargin
  }

  def addIncomeContent(): String = {
    s"""Your monthly income
       |Add information about yourself only.
       |Income
       |Monthly income after tax
       |If you do not have a regular monthly income, add an estimate.
       |£
       |Benefits
       |For example, Universal Credit, tax credits
       |£
       |Other monthly income
       |For example, rental income, dividends
       |£
       |Continue
       |Is this page not working properly? (opens in new tab)""".stripMargin
  }

  def addSpendingContent(): String = {
    s"""Your monthly spending
       |Add information about yourself only. If you live with other people, input your share of the spending. You can leave a box empty if it does not apply to you.
       |Housing
       |For example, mortgage, rent, repairs
       |£
       |Pension contributions
       |£
       |Council tax
       |£
       |Utilities
       |For example, energy, water, phone, broadband
       |£
       |Debt repayments
       |For example, credit card, loan, court order payments
       |£
       |Travel
       |For example, vehicles, fuel, season ticket
       |£
       |Childcare costs
       |For example, education, maintenance payments
       |£
       |Insurance
       |For example, health, car, home
       |£
       |Groceries
       |£
       |Health
       |For example, prescriptions, private healthcare
       |£
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
