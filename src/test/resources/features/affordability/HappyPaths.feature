Feature: Happy Paths - Affordability

### About your Bank Account Page

  Scenario: Cannot set up Direct Debit page - Not Account holder
    Given A user logs in and gets to the About your bank account page
    When the user selects personal and isn't the account holder on the About account page
    And the user clicks continue
    Then the user is on the CannotSetupDDPage



### Set Up Direct Debit Page

  Scenario Outline: Boundary Validation on Set Up Direct Debit page
    Given A user logs in and gets to the About your bank account page
    When the user selects personal and is the account holder on the About account page
    And the user clicks continue
    And the user enters valid bank details
    When the user enters <Input Value> into the <Field> field
    And the user clicks continue
    And the user clicks continue_button
    And the user clicks continue_button
    Then the submission has been successful

    Examples:
      | Input Value                             | Field        |
      | TestTestTestTestTestTestTestTestTestTes | Account Name |
      | Test'.&/                                | Account Name |
      | 20 71 06                                | Sortcode     |
      | 20-71-06                                | Sortcode     |



### Confirm your Direct Debit Details Page

  Scenario: Change Link on Confirm Direct Debit Details page takes back to Type Of Account Page
    Given A user logs in and gets to the About your bank account page
    When the user selects personal and is the account holder on the About account page
    And the user clicks continue
    And the user enters valid bank details
    And the user clicks continue
    And the user is on the ConfirmDirectDebitDetailsPage
    When the user clicks on the change link on the ConfirmDirectDebitDetailsPage
    Then the user is on the TypeOfAccountPage
