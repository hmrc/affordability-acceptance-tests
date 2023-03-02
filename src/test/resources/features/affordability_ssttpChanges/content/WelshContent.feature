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
    And the user clicks continue
    And the user clicks on the add income link
    And the user adds monthly income of 100, benefits of 200 and other income of 300
    And the user clicks continue
    And the user clicks on the add spending link
    And the user adds monthly spending of 10 to all fields
    And the user clicks continue
    And the user clicks continue
    And the user enters 50 percent on the how many months page
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
    And the user clicks continue
    And the user clicks on the add income link
    And the user adds monthly income of 100, benefits of 200 and other income of 300
    And the user clicks continue
    And the user clicks on the add spending link
    And the user adds monthly spending of 10 to all fields
    And the user clicks continue
    And the user clicks continue
    And the user enters 50 percent on the how many months page
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
    Given the user is created and logs in
    And the user clicks start
    And the user clicks continue
    When the user clicks no on the upfront payment page
    And the user clicks next
    And the user enters 28 on the what day of the month page
    And the user clicks next
    And the user clicks continue
    And the user clicks on the add income link
    And the user adds monthly income of 100, benefits of 200 and other income of 300
    And the user clicks continue
    And the user clicks on the add spending link
    And the user adds monthly spending of 10 to all fields
    And the user clicks continue
    And the user clicks continue
    And the user enters 50 percent on the how many months page
    And the user clicks next
    And the user clicks continue
    And the User toggles on Welsh language
    And the user clicks continue
    Then the account type field should display "Dewiswch pa fath o gyfrif yr ydych yn ei ddarparu"
    Then the account holder field should display "Dewiswch ‘Iawn’ os mai chi yw deiliad y cyfrif"
    And the User toggles on English language

  Scenario Outline: Welsh - Error Validation on Set Up Direct Debit page - Field Validation
    Given the user is created and logs in
    And the user clicks start
    And the user clicks continue
    When the user clicks no on the upfront payment page
    And the user clicks next
    And the user enters 28 on the what day of the month page
    And the user clicks next
    And the user clicks continue
    And the user clicks on the add income link
    And the user adds monthly income of 100, benefits of 200 and other income of 300
    And the user clicks continue
    And the user clicks on the add spending link
    And the user adds monthly spending of 10 to all fields
    And the user clicks continue
    And the user clicks continue
    And the user enters 50 percent on the how many months page
    And the user clicks next
    And the user clicks continue
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
    Given the user is created and logs in
    And the user clicks start
    And the user clicks continue
    When the user clicks yes on the upfront payment page
    And the user clicks next
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

### Select Day of Month Page

  Scenario Outline: Error Validation on What Day of Month page - No selection
    Given the user is created and logs in
    And the user is on the StartPage
    And the user clicks start
    And the user clicks continue
    When the User toggles on Welsh language
    When the user clicks no on the upfront payment page
    And the user clicks next
    And the user is on the WhatDayOfMonthPage
    When the user enters <Input Value> into the <Field> field
    And the user clicks next
    Then the <Field> field should display "<Message>"
    Then the User toggles on English language

    Examples:
      | Input Value | Field        | Message                                        |
      | none        | radio button | Dewiswch ar ba ddiwrnod rydych am dalu bob mis |
      | none        | other        | Nodwch rif rhwng 1 a 28                        |
      | 0           | other        | Nodwch rif rhwng 1 a 28                        |
      | abc         | other        | Nodwch rif rhwng 1 a 28                        |
      | 29          | other        | Nodwch rif rhwng 1 a 28                        |



###### AFFORDABILITY SCREENS

  Scenario: Welsh - Affordability Screens Content
    Given A user logs in and gets to the affordability pages
    When the User toggles on Welsh language
    And the user is on the CheckYouCanAffordPage
    And the user clicks continue
    And the user is on the AddIncomeAndSpendingPageBlank
    And the user clicks on the add income link
    And the user is on the AddIncomePage
    And the user adds monthly income of 100, benefits of 200 and other income of 300
    And the user clicks continue
    And the user is on the AddIncomeAndSpendingPageIncomeFull
    And the user clicks on the add spending link
    And the user is on the AddSpendingPage
    And the user adds monthly spending of 10 to all fields
    And the user clicks continue
    And the user is on the HowMuchYouCanAffordPageHappy
    And the user clicks continue
    And the user enters 50 percent on the how many months page
    And the user clicks next
    And the user is on the AffordabilityCheckPaymentPlanPageNoUpfront
#    Enter more steps here
    Then the User toggles on English language

  Scenario: Affordability Screens Content - User Specified amount selected, warning message shown
    Given A user logs in and gets to the affordability pages
    When the User toggles on Welsh language
    And the user is on the CheckYouCanAffordPage
    And the user clicks continue
    And the user is on the AddIncomeAndSpendingPageBlank
    And the user clicks on the add income link
    And the user is on the AddIncomePage
    And the user adds monthly income of 100, benefits of 200 and other income of 300
    And the user clicks continue
    And the user is on the AddIncomeAndSpendingPageIncomeFull
    And the user clicks on the add spending link
    And the user is on the AddSpendingPage
    And the user adds monthly spending of 10 to all fields
    And the user clicks continue
    And the user is on the HowMuchYouCanAffordPageHappy
    And the user clicks continue
    And the user enters custom amount on the how many months page
    And the user clicks next
    And the user enters user specified on the how many months page
    And the user clicks next
    Then the choosing more than 50 percent warning message shows
    Then the User toggles on English language

  Scenario Outline: Welsh - Affordability Screens Content - Conditional Sentences - Spending first
    Given A user logs in and gets to the affordability pages
    When the User toggles on Welsh language
    And the user clicks continue
    And the user clicks on the add spending link
    And the user adds monthly spending of <spending> to all fields
    And the user clicks continue
    And the user clicks on the add income link
    And the user adds monthly income of 100, benefits of 200 and other income of 300
    And the user clicks continue
    And the user is on the <expectedPage>
    Then the User toggles on English language

    Examples:
      | spending | expectedPage                        |
      | 10       | HowMuchYouCanAffordPageHappy        |
      | 60       | HowMuchYouCanAffordPageSpendingSame |
      | 100      | HowMuchYouCanAffordPageSpendingMore |


  Scenario Outline: Welsh - Error Validation on Add Income Page
    Given A user logs in and gets to the affordability pages
    And the user clicks continue
    And the user clicks on the add income link
    When the User toggles on <lang> language
    When the user enters <value> into the monthly income field
    When the user enters <value> into the benefits field
    When the user enters <value> into the other income field
    And the user clicks continue
    Then the monthly income field should display "<Message> incwm misol ar ôl treth"
    Then the benefits field should display "<Message> budd-daliadau"
    Then the other income field should display "<Message> incwm misol arall"
    Then the User toggles on English language

    Examples:
      | lang  | value | Message                                                    |
      | Welsh | !@    | Nodwch rifau yn unig ar gyfer                              |
      | Welsh | 1.000 | Rhaid i’r swm beidio â chynnwys mwy na 2 le degol ar gyfer |
      | Welsh | -1    | Nodwch rif positif yn unig ar gyfer                        |

  Scenario: Welsh - Error Validation on Add Income Page - Nothing entered
    Given A user logs in and gets to the affordability pages
    When the User toggles on Welsh language
    And the user clicks continue
    And the user clicks on the add income link
    And the user clicks continue
    Then the income invalid field should display "Mae’n rhaid i chi nodi’ch incwm Os nad oes gennych unrhyw incwm, ffoniwch ni ar 0300 200 1900"
    Then the User toggles on English language


  Scenario Outline: Welsh - Error Validation on Add Spending Page
    Given A user logs in and gets to the affordability pages
    And the user clicks continue
    And the user clicks on the add spending link
    When the User toggles on <lang> language
    When the user enters <value> into the housing field
    When the user enters <value> into the pension field
    When the user enters <value> into the council tax field
    When the user enters <value> into the utilities field
    When the user enters <value> into the debt repayments field
    When the user enters <value> into the travel field
    When the user enters <value> into the childcare field
    When the user enters <value> into the insurance field
    When the user enters <value> into the groceries field
    When the user enters <value> into the health field
    And the user clicks continue
    Then the housing field should display "<Message> tai"
    Then the pension field should display "<Message> cyfraniadau pensiwn"
    Then the council tax field should display "<Message> Treth Gyngor"
    Then the utilities field should display "<Message> cyfleustodau"
    Then the debt repayments field should display "<Message> ad-daliadau dyledion"
    Then the travel field should display "<Message> teithio"
    Then the childcare field should display "<Message> costau gofal plant"
    Then the insurance field should display "<Message> yswiriant"
    Then the groceries field should display "<Message> nwyddau groser"
    Then the health field should display "<Message> iechyd"
    Then the User toggles on English language

    Examples:
      | lang  | value | Message                                                    |
      | Welsh | !@    | Nodwch rifau yn unig ar gyfer                              |
      | Welsh | -1    | Nodwch rif positif yn unig ar gyfer                        |
      | Welsh | 1.000 | Rhaid i’r swm beidio â chynnwys mwy na 2 le degol ar gyfer |


