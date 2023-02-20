Feature: English Content

  Scenario: Page Content validation - Affordability Pages
    Given A user logs in and gets to the About your bank account page
    Then the user is on the TypeOfAccountPage
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

  Scenario: Conditional Sentence when upfront payment made - Success Confirmation Page
    Given the user is created and logs in
    And the user is on the StartPage
    And the user clicks start
    And the user is on the TaxLiabilitiesPage
    And the user clicks continue
    And the user is on the UpfrontPaymentPage
    When the user clicks yes on the upfront payment page
    And the user clicks next
    And the user is on the UpfrontPaymentAmountPage
    When the user enters 200 on the upfront payment amount page
    And the user clicks continue
    And the user is on the PaymentSummaryPage
    And the user clicks continue
    And the user is on the WhatDayOfMonthPage
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

  @a11y @zap
  Scenario Outline: Call Us - Eligibility pages content
    Given A user logs in and clicks link to the <page>
    Then the user is on the <page>

    Examples:
      | page                   |
      | CallUsNotEligiblePage  |
      | CallUsNotEnrolledPage  |
      | CallUsDebtTooLargePage |
      | NeedToFilePage         |


  Scenario: Affordability Screens Content - Branch off TEMPORARY, tests will need to be merged to main tests when journey complete
    Given A user logs in and gets to the affordability pages
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

  Scenario Outline: Affordability Screens Content - Conditional Sentences, Correct routing - Spending First
    Given A user logs in and gets to the affordability pages
    And the user clicks continue
    And the user clicks on the add spending link
    And the user adds monthly spending of <spending> to all fields
    And the user clicks continue
    And the user clicks on the add income link
    And the user adds monthly income of 100, benefits of 200 and other income of 300
    And the user clicks continue
    And the user is on the <expectedPage>
    And the user clicks continue
    And the user is on the <expectedPage2>

    Examples:
      | spending | expectedPage                        | expectedPage2       |
      | 10       | HowMuchYouCanAffordPageHappy        | TBC                 |
      | 60       | HowMuchYouCanAffordPageSpendingSame | CannotAgreePlanPage |
    @a11y @zap
    Examples:
      | spending | expectedPage                        | expectedPage2       |
      | 100      | HowMuchYouCanAffordPageSpendingMore | CannotAgreePlanPage |
