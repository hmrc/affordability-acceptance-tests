Feature: Error Validation on various pages created/updated by Affordability changes

  Scenario Outline: Error Validation on About your Account Details page - only 1 selection
    Given the user is created and logs in
    And the user clicks start
    And the user clicks continue
    When the user clicks no on the upfront payment page
    And the user clicks next
    When the user enters 500 on the how much can you afford each month page
    And the user clicks continue
    And the user enters 28 on the what day of the month page
    And the user clicks next
    And the user enters 6 on the how many months page
    And the user clicks next
    And the user clicks continue
    When the user selects <accountType> and <accountHolder> the account holder on the About account page
    And the user clicks continue
    Then the <offendingField> field should display "<errorMessage>"

    Examples:
      | accountType          | accountHolder    | offendingField | errorMessage                                          |
      | no bank account type | is               | account type   | Select what type of account details you are providing |
      | personal             | no selection for | account holder | Select yes if you are the account holder              |

  Scenario: Error Validation on About your Account Details page - no selection
    Given the user is created and logs in
    And the user clicks start
    And the user clicks continue
    When the user clicks no on the upfront payment page
    And the user clicks next
    When the user enters 500 on the how much can you afford each month page
    And the user clicks continue
    And the user enters 28 on the what day of the month page
    And the user clicks next
    And the user enters 6 on the how many months page
    And the user clicks next
    And the user clicks continue
    And the user clicks continue
    Then the account type field should display "Select what type of account details you are providing"
    Then the account holder  field should display "Select yes if you are the account holder"


