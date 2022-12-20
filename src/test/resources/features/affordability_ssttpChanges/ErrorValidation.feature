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
    Then the account holder field should display "Select yes if you are the account holder"

### Set Up Direct Debit Page
  Scenario: Error Validation on Set Up Direct Debit page - no selection
    Given A user logs in and gets to the About your bank account page
    When the user selects personal and is the account holder on the About account page
    And the user clicks continue
    And an empty form is submitted
    Then the account name field should display "Enter an account name"
    Then the sortcode field should display "Enter a sort code"
    Then the account number field should display "Enter an account number"

  Scenario Outline: Error Validation on Set Up Direct Debit page - Field Validation
    Given A user logs in and gets to the About your bank account page
    When the user selects personal and is the account holder on the About account page
    And the user clicks continue
    When the User toggles on <lang> language
    When the user enters <Input Value> into the <Field> field
    And the user clicks continue
    Then the <Field> field should display "<Message>"

    Examples:
      | lang    | Input Value                              | Field          | Message                                       |
      | English | none                                     | Account Name   | Enter an account name                         |
      | English | a                                        | Account Name   | Check your account name is correct            |
      | English | "Test"                                   | Account Name   | Check your account name is correct            |
      | English | Test?                                    | Account Name   | Check your account name is correct            |
      | English | _Test                                    | Account Name   | Check your account name is correct            |
      | English | TestTestTestTestTestTestTestTestTestTest | Account Name   | Check your account name is correct            |
      | English | none                                     | Sortcode       | Enter a sort code                             |
      | English | 00.00.00                                 | Sortcode       | Sort code must be a 6 digit number            |
      | English | 00000                                    | Sortcode       | Sort code must be a 6 digit number            |
      | English | 0000000                                  | Sortcode       | Sort code must be a 6 digit number            |
      | English | 000000words                              | Sortcode       | Sort code must be a 6 digit number            |
      | English | 000000?                                  | Sortcode       | Sort code must be a 6 digit number            |
      | English | none                                     | Account Number | Enter an account number                       |
      | English | 52173                                    | Account Number | Account number must be between 6 and 8 digits |
      | English | 521733 1                                 | Account Number | Account number must be between 6 and 8 digits |
      | English | 521733-1                                 | Account Number | Account number must be between 6 and 8 digits |
      | English | 521730181                                | Account Number | Account number must be between 6 and 8 digits |
      | English | 521738wo                                 | Account Number | Account number must be between 6 and 8 digits |

### Upfront Payment page
  Scenario Outline: Error Validation on How much can you pay upfront?
    Given A user logs in and gets to the How much can you pay upfront page
    When the User toggles on <lang> language
    When the user enters <Input Value> into the amount field
    And the user clicks continue
    Then the amount field should display "<Message>"

    Examples:
      | lang    | Input Value | Message                                                  |
      | English | none        | Enter an amount of £1 or above                           |
      | English | 0.50        | Enter an amount of £1 or above                           |
      | English | -1          | Enter an amount of £1 or above                           |
      | English | 40000       | You need to enter an amount less than the amount you owe |
      | English | 2.345       | Amount must not contain more than 2 decimal places       |
      | English | aa          | Enter numbers only                                       |
      | English | £2          | Enter numbers only                                       |
