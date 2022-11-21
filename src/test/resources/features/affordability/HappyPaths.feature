Feature: Happy Paths - Affordability

  Scenario Outline: Boundary Validation on Set Up Direct Debit page
    Given A user logs in and gets to the About your bank account page
#    Then the user is on the TypeOfAccountPage
    When the user selects personal and is the account holder on the About account page
    And the user clicks continue
    Then the user is on the SetUpDirectDebitPage
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

  Scenario: Cannot set up Direct Debit page - Not Account holder
    Given A user logs in and gets to the About your bank account page
    When the user selects personal and isn't the account holder on the About account page
    And the user clicks continue
    Then the user is on the CannotSetupDDPage
