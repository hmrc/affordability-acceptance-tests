@welsh
Feature: Welsh Content

### Happy Path - Welsh Content

  Scenario: Welsh - Happy Path - Full Journey - Welsh Content
    Given the user is created and logs in
    And the User toggles on Welsh language
    And the user is on the StartPage
    And the user clicks start
    And the user is on the TaxLiabilitiesPage
    And the user clicks continue
    And the user is on the UpfrontPaymentPage
    When the user clicks no on the upfront payment page
    And the user clicks next
    And the user is on the WhatDayOfMonthPage
    And the user enters 28 on the what day of the month page
    And the user clicks next
    And the user enters 2 on the how many months page
    And the user clicks next
    And the user clicks continue
    Then the user is on the TypeOfAccountPage
    When the user selects personal and isn't the account holder on the About account page
    And the user clicks continue
    Then the user is on the CannotSetupDDPage
    And the user clicks back
    When the user selects personal and is the account holder on the About account page
    And the user clicks continue
    Then the user is on the SetUpDirectDebitPage
    And the user enters valid bank details
    And the user clicks continue
    And the user is on the ConfirmDirectDebitDetailsPage
    And the user clicks continue_button
    Then the user is on the TermsAndConditionsPage
    And the user clicks continue_button
    Then the submission has been successful
    Then the user is on the SuccessConfirmationPage
    Then the user clicks View your payment plan
    Then the user is on the ViewPaymentPlanPage
    And the language toggle is reset to English

  Scenario: Welsh - Conditional Sentence when upfront payment made - Success Confirmation Page
    Given the user is created and logs in
    And the user clicks start
    And the user clicks continue
    And the User toggles on Welsh language
    And the user is on the UpfrontPaymentPage
    When the user clicks yes on the upfront payment page
    And the user clicks next
    And the user is on the UpfrontPaymentAmountPage
    When the user enters 200 on the upfront payment amount page
    And the user clicks continue
    And the user is on the PaymentSummaryPage
    And the user clicks continue
    And the user enters 28 on the what day of the month page
    And the user clicks next
    And the user enters 2 on the how many months page
    And the user clicks next
    And the user clicks continue
    When the user selects personal and is the account holder on the About account page
    And the user clicks continue
    When the user enters valid bank details
    And the user clicks continue
    And the user clicks continue_button
    And the user clicks continue_button
    Then the submission has been successful
    And the conditional sentence for Upfront payment is displayed
    And the language toggle is reset to English

  Scenario Outline: Welsh - Call Us - Eligibility pages content
    Given A user logs in and clicks link to the <page>
    And the User toggles on Welsh language
    Then the user is on the <page>
    And the User toggles on English language

    Examples:
      | page                   |
      | CallUsNotEligiblePage  |
      | CallUsNotEnrolledPage  |
      | CallUsDebtTooLargePage |
      | NeedToFilePage         |


### Error Validation

  Scenario: Welsh - Error Validation on About your Account Details page - no selection
    Given A user logs in and gets to the About your bank account page
    And the User toggles on Welsh language
    And the user clicks continue
    Then the account type field should display "Dewiswch pa fath o gyfrif yr ydych yn ei ddarparu"
    Then the account holder field should display "Dewiswch ‘Iawn’ os mai chi yw deiliad y cyfrif"
    And the User toggles on English language

  Scenario Outline: Welsh - Error Validation on Set Up Direct Debit page - Field Validation
    Given A user logs in and gets to the About your bank account page
    When the user selects personal and is the account holder on the About account page
    And the user clicks continue
    When the User toggles on <lang> language
    When the user enters <Input Value> into the <Field> field
    And the user clicks continue
    Then the <Field> field should display "<Message>"
    Then the User toggles on English language

    Examples:
      | lang  | Input Value | Field          | Message                                           |
      | Welsh | none        | Account Name   | Nodwch enw cyfrif                                 |
      | Welsh | "Test"      | Account Name   | Gwiriwch fod enw eich cyfrif yn gywir             |
      | Welsh | none        | Sortcode       | Nodwch god didoli                                 |
      | Welsh | 00.00.00    | Sortcode       | Rhaid i’r cod didoli fod yn rhif 6 digid          |
      | Welsh | none        | Account Number | Nodwch rif y cyfrif                               |
      | Welsh | 52173       | Account Number | Mae’n rhaid i rif y cyfrif fod rhwng 6 ac 8 digid |

  Scenario Outline: Welsh - Error Validation on How much can you pay upfront?
    Given A user logs in and gets to the How much can you pay upfront page
    When the User toggles on <lang> language
    When the user enters <Input Value> into the amount field
    And the user clicks continue
    Then the amount field should display "<Message>"
    Then the User toggles on English language

    Examples:
      | lang  | Input Value | Message                                                   |
      | Welsh | none        | Nodwch swm o £1 neu fwy                                   |
      | Welsh | 0.50        | Nodwch swm o £1 neu fwy                                   |
      | Welsh | -1          | Nodwch swm o £1 neu fwy                                   |
      | Welsh | 40000       | Mae’n rhaid i chi nodi swm sy’n llai na’r swm sydd arnoch |
      | Welsh | 2.345       | Rhaid i’r swm beidio â chynnwys mwy na 2 le degol         |
      | Welsh | aa          | Rhowch rifau yn unig                                      |
      | Welsh | £2          | Rhowch rifau yn unig                                      |



###### AFFORDABILITY SCREENS


  Scenario: Welsh - Affordability Screens Content - Branch off TEMPORARY, tests will need to be merged to main tests when journey complete
    Given A user logs in and gets to the affordability pages
    When the User toggles on Welsh language
    And the user is on the CheckYouCanAffordPage
    And the user clicks continue
    And the user is on the AddIncomeAndSpendingPageBlank
    And the user clicks on the add income link
    And the user is on the AddIncomePage
#    Enter more steps here
    Then the User toggles on English language

  Scenario Outline: Welsh - Error Validation on Add Income Page?
    Given A user logs in and gets to the affordability pages
    And the user clicks continue
    And the user clicks on the add income link
    When the User toggles on <lang> language
    When the user enters <monthlyIncome> into the monthly income field
    When the user enters <benefits> into the benefits field
    When the user enters <otherAmount> into the other income field
    And the user clicks continue
    Then the <Field> field should display "<Message>"
    Then the User toggles on English language

    Examples:
      | lang  | monthlyIncome | benefits | otherAmount | Field          | Message                                                                                                        |
      | Welsh | 0             | 0        | 0           | monthly amount | Mae’n rhaid i chi nodi ffigur ar gyfer yr incwm. Os nad oes gennych unrhyw incwm, ffoniwch ni ar 0300 200 1900 |
      | Welsh | £1            | 0        | 0           | monthly amount | Rhowch rifau yn unig                                                                                           |
      | Welsh | 0             | AB       | 0           | benefit        | Rhowch rifau yn unig                                                                                           |
      | Welsh | 0             | 0        | !@          | other income   | Rhowch rifau yn unig                                                                                           |
#      | Welsh | -1          | 0             | 0             | monthly amount | TBC     |
#      | Welsh | 0           | -1            | 0             | monthly amount | TBC     |
#      | Welsh | 0           | 0             | -1            | monthly amount | TBC     |