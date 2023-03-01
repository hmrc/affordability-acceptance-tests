Feature: Error Validation on various pages created/updated by Affordability changes

  #                                                                                                                 #
  # "Given A user logs in and gets to the About your bank account page step" is used to get through the             #
  #  SSTTP journey up until the point at which the Affordability tickets have made changes to the journey/content.  #
  #                                                                                                                 #

### Select Day of Month Page
  Scenario Outline: Error Validation on What Day of Month page - No selection
    Given the user is created and logs in
    And the user is on the StartPage
    And the user clicks start
    And the user clicks continue
    When the user clicks no on the upfront payment page
    And the user clicks next
    And the user is on the WhatDayOfMonthPage
    When the user enters <Input Value> into the <Field> field
    And the user clicks next
    Then the <Field> field should display "<Message>"

    Examples:
      | Input Value | Field        | Message                                     |
      | none        | radio button | Select which day you want to pay each month |
      | none        | other        | Enter a number between 1 and 28             |
      | 0           | other        | Enter a number between 1 and 28             |
      | abc         | other        | Enter a number between 1 and 28             |
      | 29          | other        | Enter a number between 1 and 28             |

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

### Affordability - Add Income page
  Scenario Outline: Error Validation on Add Income Page
    Given A user logs in and gets to the affordability pages
    And the user clicks continue
    And the user clicks on the add income link
    When the User toggles on <lang> language
    When the user enters <monthlyIncome> into the monthly income field
    When the user enters <benefits> into the benefits field
    When the user enters <otherAmount> into the other income field
    And the user clicks continue
    Then the <Field> field should display "<Message>"
    Then the User toggles on English language

    Examples:
      | lang    | monthlyIncome | benefits | otherAmount | Field          | Message                                                                           |
      | English | 0             | 0        | 0           | income invalid | You must enter your income If you do not have any income call us on 0300 123 1813 |
      | English | £1            | 0        | 0           | monthly income | Enter numbers only for monthly income after tax                                   |
      | English | 0             | AB       | 0           | benefit        | Enter numbers only for benefits                                                   |
      | English | 0             | 0        | !@          | other income   | Enter numbers only for other monthly income                                       |
      | English | 10.000        | 0        | 0           | monthly income | Amount must not contain more than 2 decimal places for monthly income after tax   |
      | English | 0             | 12.345   | 0           | benefit        | Amount must not contain more than 2 decimal places for benefits                   |
      | English | 0             | 0        | 19.999      | other income   | Amount must not contain more than 2 decimal places for other monthly income       |
      | English | -1            | 0        | 0           | monthly income | Enter a positive number only for monthly income after tax                         |
      | English | 0             | -1       | 0           | benefit        | Enter a positive number only for benefits                                         |
      | English | 0             | 0        | -1          | other income   | Enter a positive number only for other monthly income                             |

### Affordability - Add Spending page
  Scenario Outline: Error Validation on Add Spending Page
    Given A user logs in and gets to the affordability pages
    And the user clicks continue
    And the user clicks on the add spending link
    When the User toggles on <lang> language
    When the user enters <Housing> into the housing field
    When the user enters <Pension> into the pension field
    When the user enters <Council Tax> into the council tax field
    When the user enters <Utilities> into the utilities field
    When the user enters <Debt> into the debt repayments field
    When the user enters <Travel> into the travel field
    When the user enters <Childcare> into the childcare field
    When the user enters <Insurance> into the insurance field
    When the user enters <Groceries> into the groceries field
    When the user enters <Health> into the health field
    And the user clicks continue
    Then the <Field> field should display "<Message>"
    Then the User toggles on English language

    Examples:
      | lang    | Housing | Pension | Council Tax | Utilities | Debt  | Travel | Childcare | Insurance | Groceries | Health | Field           | Message                                                                      |
      | English | AB      | 0       | 0           | 0         | 0     | 0      | 0         | 0         | 0         | 0      | housing         | Enter numbers only for housing                                               |
      | English | 0       | £1      | 0           | 0         | 0     | 0      | 0         | 0         | 0         | 0      | pension         | Enter numbers only for pension contributions                                 |
      | English | 0       | 0       | !@          | 0         | 0     | 0      | 0         | 0         | 0         | 0      | council tax     | Enter numbers only for council tax                                           |
      | English | 0       | 0       | 0           | AB        | 0     | 0      | 0         | 0         | 0         | 0      | utilities       | Enter numbers only for utilities                                             |
      | English | 0       | 0       | 0           | 0         | £1    | 0      | 0         | 0         | 0         | 0      | debt repayments | Enter numbers only for debt repayments                                       |
      | English | 0       | 0       | 0           | 0         | 0     | !@     | 0         | 0         | 0         | 0      | travel          | Enter numbers only for travel                                                |
      | English | 0       | 0       | 0           | 0         | 0     | 0      | AB        | 0         | 0         | 0      | childcare       | Enter numbers only for childcare costs                                       |
      | English | 0       | 0       | 0           | 0         | 0     | 0      | 0         | £1        | 0         | 0      | insurance       | Enter numbers only for insurance                                             |
      | English | 0       | 0       | 0           | 0         | 0     | 0      | 0         | 0         | !@        | 0      | groceries       | Enter numbers only for groceries                                             |
      | English | 0       | 0       | 0           | 0         | 0     | 0      | 0         | 0         | 0         | AB     | health          | Enter numbers only for health                                                |
      | English | -1      | 0       | 0           | 0         | 0     | 0      | 0         | 0         | 0         | 0      | housing         | Enter a positive number only for housing                                     |
      | English | 0       | -1      | 0           | 0         | 0     | 0      | 0         | 0         | 0         | 0      | pension         | Enter a positive number only for pension contributions                       |
      | English | 0       | 0       | -1          | 0         | 0     | 0      | 0         | 0         | 0         | 0      | council tax     | Enter a positive number only for council tax                                 |
      | English | 0       | 0       | 0           | -1        | 0     | 0      | 0         | 0         | 0         | 0      | utilities       | Enter a positive number only for utilities                                   |
      | English | 0       | 0       | 0           | 0         | -1    | 0      | 0         | 0         | 0         | 0      | debt repayments | Enter a positive number only for debt repayments                             |
      | English | 0       | 0       | 0           | 0         | 0     | -1     | 0         | 0         | 0         | 0      | travel          | Enter a positive number only for travel                                      |
      | English | 0       | 0       | 0           | 0         | 0     | 0      | -1        | 0         | 0         | 0      | childcare       | Enter a positive number only for childcare costs                             |
      | English | 0       | 0       | 0           | 0         | 0     | 0      | 0         | -1        | 0         | 0      | insurance       | Enter a positive number only for insurance                                   |
      | English | 0       | 0       | 0           | 0         | 0     | 0      | 0         | 0         | -1        | 0      | groceries       | Enter a positive number only for groceries                                   |
      | English | 0       | 0       | 0           | 0         | 0     | 0      | 0         | 0         | 0         | -1     | health          | Enter a positive number only for health                                      |
      | English | 1.000   | 0       | 0           | 0         | 0     | 0      | 0         | 0         | 0         | 0      | housing         | Amount must not contain more than 2 decimal places for housing               |
      | English | 0       | 1.000   | 0           | 0         | 0     | 0      | 0         | 0         | 0         | 0      | pension         | Amount must not contain more than 2 decimal places for pension contributions |
      | English | 0       | 0       | 1.000       | 0         | 0     | 0      | 0         | 0         | 0         | 0      | council tax     | Amount must not contain more than 2 decimal places for council tax           |
      | English | 0       | 0       | 0           | 1.000     | 0     | 0      | 0         | 0         | 0         | 0      | utilities       | Amount must not contain more than 2 decimal places for utilities             |
      | English | 0       | 0       | 0           | 0         | 1.000 | 0      | 0         | 0         | 0         | 0      | debt repayments | Amount must not contain more than 2 decimal places for debt repayments       |
      | English | 0       | 0       | 0           | 0         | 0     | 1.000  | 0         | 0         | 0         | 0      | travel          | Amount must not contain more than 2 decimal places for travel                |
      | English | 0       | 0       | 0           | 0         | 0     | 0      | 1.000     | 0         | 0         | 0      | childcare       | Amount must not contain more than 2 decimal places for childcare costs       |
      | English | 0       | 0       | 0           | 0         | 0     | 0      | 0         | 1.000     | 0         | 0      | insurance       | Amount must not contain more than 2 decimal places for insurance             |
      | English | 0       | 0       | 0           | 0         | 0     | 0      | 0         | 0         | 1.000     | 0      | groceries       | Amount must not contain more than 2 decimal places for groceries             |
      | English | 0       | 0       | 0           | 0         | 0     | 0      | 0         | 0         | 0         | 1.000  | health          | Amount must not contain more than 2 decimal places for health                |

