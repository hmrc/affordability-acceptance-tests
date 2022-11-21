@welsh
Feature: Welsh Content

  Scenario: Welsh - Affordability - Welsh Content
    Given A user logs in and gets to the About your bank account page
    And the User toggles on Welsh language
    Then the user is on the TypeOfAccountPage
    When the user selects personal and isn't the account holder on the About account page
    And the user clicks continue
    Then the user is on the CannotSetupDDPage
    And the user clicks back
    When the user selects personal and is the account holder on the About account page
    And the user clicks continue
    Then the user is on the SetUpDirectDebitPage
    And the User toggles on English language

