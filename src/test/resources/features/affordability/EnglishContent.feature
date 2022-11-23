Feature: English Content

  Scenario: Page Content validation - Affordability Pages
    Given A user logs in and gets to the About your bank account page
    Then the user is on the TypeOfAccountPage
    When the user selects personal and is the account holder on the About account page
    And the user clicks continue
    Then the user is on the SetUpDirectDebitPage
    And the user enters valid bank details
    And the user clicks continue
    And the user clicks continue_button
    Then the user is on the TermsAndConditionsPage
    And the user clicks continue_button
    Then the submission has been successful