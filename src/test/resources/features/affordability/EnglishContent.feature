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

  Scenario: Conditional Sentence when upfront payment made - Success Confirmation Page
    Given the user is created and logs in
    And the user clicks start
    And the user clicks continue
    When the user clicks yes on the upfront payment page
    And the user clicks next
    When the user enters 200 on the upfront payment amount page
    And the user clicks continue
    And the user clicks continue
    When the user enters 500 on the how much can you afford each month page
    And the user clicks continue
    And the user enters 28 on the what day of the month page
    And the user clicks next
    And the user enters 6 on the how many months page
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

  Scenario Outline: Call Us - Eligibility pages content
    Given A user logs in and clicks link to the <page>
    Then the user is on the <page>

    Examples:
      | page                   |
      | CallUsNotEligiblePage  |
      | CallUsNotEnrolledPage  |
      | CallUsDebtTooLargePage |
      | NeedToFilePage         |
