Feature: Error Validation on various pages created/updated by Affordability changes

  #                                                                                                                 #
  # "Given A user logs in and gets to the About your bank account page step" is used to get through the             #
  #  SSTTP journey up until the point at which the Affordability tickets have made changes to the journey/content.  #
  #                                                                                                                 #


### About Bank Account Page
  Scenario Outline: Error Validation on About your Account Details page - only 1 selection
    Given A user logs in and gets to the About your bank account page
    And the user clicks continue
    When the user selects <accountType> and <accountHolder> the account holder on the About account page
    And the user clicks continue
    Then the <offendingField> field should display "<errorMessage>"

    Examples:
      | accountType          | accountHolder    | offendingField | errorMessage                                          |
      | no bank account type | is               | account type   | Select what type of account details you are providing |
      | personal             | no selection for | account holder | Select yes if you are the account holder              |

  Scenario: Error Validation on About your Account Details page - no selection
    Given A user logs in and gets to the About your bank account page
    And the user clicks continue
    Then the account type field should display "Select what type of account details you are providing"
    Then the account holder  field should display "Select yes if you are the account holder"

### Set Up Direct Debit Page
  Scenario: Error Validation on Set Up Direct Debit page - no selection
    Given A user logs in and gets to the About your bank account page
    When the user selects personal and is the account holder on the About account page
    And the user clicks continue
    And an empty form is submitted
    Then the account name field should display "Enter an account name"
    Then the sortcode field should display "Enter a sort code"
    Then the account number field should display "Enter an account number"
