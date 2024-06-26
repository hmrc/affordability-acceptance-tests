@fullRegression
Feature: Error Validation on various pages created/updated by Affordability changes

### Select Day of Month Page
  Scenario Outline: Error Validation on What Day of Month page - No selection
    Given the user is created and logs in
    And the user is on the StartPage
    And the user clicks start
    And the user clicks continue
    When the user clicks no on the upfront payment page
    And the user clicks continue
    And the user is on the WhatDayOfMonthPage
    When the user enters <Input Value> into the <Field> field
    And the user clicks continue
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
    Given the user is created and logs in
    And the user clicks start
    And the user clicks continue
    When the user clicks no on the upfront payment page
    And the user clicks continue
    And the user enters 28 on the what day of the month page
    And the user clicks continue
    And the user clicks continue
    And the user clicks on the add income link
    And the user adds monthly income of 1000, benefits of 200 and other income of 300
    And the user clicks continue
    And the user clicks on the add spending link
    And the user adds monthly spending of 10 to all fields
    And the user clicks continue
    And the user clicks continue
    And the user enters 50 percent on the how many months page
    And the user clicks continue
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
    And the user clicks continue
    And the user enters 28 on the what day of the month page
    And the user clicks continue
    And the user clicks continue
    And the user clicks on the add income link
    And the user adds monthly income of 1000, benefits of 200 and other income of 300
    And the user clicks continue
    And the user clicks on the add spending link
    And the user adds monthly spending of 10 to all fields
    And the user clicks continue
    And the user clicks continue
    And the user enters 50 percent on the how many months page
    And the user clicks continue
    And the user clicks continue
    And the user clicks continue
    Then the account type field should display "Select what type of account details you are providing"
    Then the account holder field should display "Select yes if you are the account holder"

### Set Up Direct Debit Page
  Scenario: Error Validation on Set Up Direct Debit page - no selection
    Given the user is created and logs in
    And the user clicks start
    And the user clicks continue
    When the user clicks no on the upfront payment page
    And the user clicks continue
    And the user enters 28 on the what day of the month page
    And the user clicks continue
    And the user clicks continue
    And the user clicks on the add income link
    And the user adds monthly income of 1000, benefits of 200 and other income of 300
    And the user clicks continue
    And the user clicks on the add spending link
    And the user adds monthly spending of 10 to all fields
    And the user clicks continue
    And the user clicks continue
    And the user enters 50 percent on the how many months page
    And the user clicks continue
    And the user clicks continue
    When the user selects personal and is the account holder on the About account page
    And the user clicks continue
    And an empty form is submitted
    Then the account name field should display "Enter an account name"
    Then the sortcode field should display "Enter a sort code"
    Then the account number field should display "Enter an account number"

  Scenario Outline: Error Validation on Set Up Direct Debit page - Field Validation
    Given the user is created and logs in
    And the user clicks start
    And the user clicks continue
    When the user clicks no on the upfront payment page
    And the user clicks continue
    And the user enters 28 on the what day of the month page
    And the user clicks continue
    And the user clicks continue
    And the user clicks on the add income link
    And the user adds monthly income of 1000, benefits of 200 and other income of 300
    And the user clicks continue
    And the user clicks on the add spending link
    And the user adds monthly spending of 10 to all fields
    And the user clicks continue
    And the user clicks continue
    And the user enters 50 percent on the how many months page
    And the user clicks continue
    And the user clicks continue
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
      | English | 521733-1                                 | Account Number | Account number must be between 6 and 8 digits |
      | English | 521730181                                | Account Number | Account number must be between 6 and 8 digits |
      | English | 521738wo                                 | Account Number | Account number must be between 6 and 8 digits |

  Scenario: Error Validation on Set Up Direct Debit page - Supports DD Debit = No
    Given the user is created and logs in
    And the user clicks start
    And the user clicks continue
    When the user clicks no on the upfront payment page
    And the user clicks continue
    And the user enters 28 on the what day of the month page
    And the user clicks continue
    And the user clicks continue
    And the user clicks on the add income link
    And the user adds monthly income of 1000, benefits of 200 and other income of 300
    And the user clicks continue
    And the user clicks on the add spending link
    And the user adds monthly spending of 10 to all fields
    And the user clicks continue
    And the user clicks continue
    And the user enters 50 percent on the how many months page
    And the user clicks continue
    And the user clicks continue
    When the user selects personal and is the account holder on the About account page
    And the user clicks continue
    When the user enters supportsDirectDebit=No bank details
    And the user clicks continue
    Then the Sortcode field should display "You have entered a sort code which does not accept this type of payment. Check you have entered a valid sort code or enter details for a different account"

### Upfront Payment page
  Scenario Outline: Error Validation on How much can you pay upfront?
    Given the user is created and logs in
    And the user clicks start
    And the user clicks continue
    When the user clicks yes on the upfront payment page
    And the user clicks continue
    When the User toggles on <lang> language
    When the user enters <Input Value> into the amount field
    And the user clicks continue
    Then the amount field should display "<Message>"

    Examples:
      | lang    | Input Value      | Message                                                        |
      | English | none             | Enter an amount of £1 or above                                 |
      | English | 0.50             | Enter an amount of £1 or above                                 |
      | English | -1               | Enter an amount of £1 or above                                 |
      | English | 3010.56          | Enter an amount that is at least £1 but no more than £3,010.55 |
      | English | 2.345            | Amount must not contain more than 2 decimal places             |
      | English | aa               | Upfront payment must be an amount, like £100 or £250.75        |
      | English | 1000000000000.01 | Enter an amount that is at least £1 but no more than £3,010.55 |

### Affordability - Add Income page
  Scenario Outline: Error Validation on Add Income Page
    Given A user logs in and gets to the affordability pages
    And the user clicks continue
    And the user clicks on the add income link
    When the User toggles on <lang> language
    When the user enters <value> into the monthly income field
    When the user enters <value> into the benefits field
    When the user enters <value> into the other income field
    And the user clicks continue
    Then the monthly income field should display "<Message> monthly income after tax"
    Then the benefits field should display "<Message> benefits"
    Then the other income field should display "<Message> other monthly income"
    Then the User toggles on English language

    Examples:
      | lang    | value | Message                                                |
      | English | -1    | Enter a positive number only for                       |
      | English | 1.000 | Amount must not contain more than 2 decimal places for |


  Scenario Outline: Error Validation on Add Income Page - invalid chars
    Given A user logs in and gets to the affordability pages
    And the user clicks continue
    And the user clicks on the add income link
    When the User toggles on <lang> language
    When the user enters <value> into the monthly income field
    When the user enters <value> into the benefits field
    When the user enters <value> into the other income field
    And the user clicks continue
    Then the monthly income field should display "Monthly income after tax <Message>"
    Then the benefits field should display "Benefits <Message>"
    Then the other income field should display "Other monthly income <Message>"
    Then the User toggles on English language

    Examples:
      | lang    | value | Message                                 |
      | English | !@    | must be an amount, like £100 or £250.75 |

  @a11y @zap
  Scenario Outline: Error Validation on Add Income Page - Nothing entered
    Given A user logs in and gets to the affordability pages
    And the user clicks continue
    And the user clicks on the add income link
    When the user enters <value> into the monthly income field
    When the user enters <value> into the benefits field
    When the user enters <value> into the other income field
    And the user clicks continue
    Then the user is on the NoIncomePage

    Examples:
      | value |
      | none  |
      | 0     |

### Affordability - Add Spending page
  Scenario Outline: Error Validation on Add Spending Page
    Given A user logs in and gets to the affordability pages
    And the user clicks continue
    And the user clicks on the add spending link
    When the User toggles on <lang> language
    When the user enters <value> into the housing field
    When the user enters <value> into the pension field
    When the user enters <value> into the council tax field
    When the user enters <value> into the utilities field
    When the user enters <value> into the debt repayments field
    When the user enters <value> into the travel field
    When the user enters <value> into the childcare field
    When the user enters <value> into the insurance field
    When the user enters <value> into the groceries field
    When the user enters <value> into the health field
    And the user clicks continue
    Then the housing field should display "<Message> housing"
    Then the pension field should display "<Message> pension contributions"
    Then the council tax field should display "<Message> council tax"
    Then the utilities field should display "<Message> utilities"
    Then the debt repayments field should display "<Message> debt repayments"
    Then the travel field should display "<Message> travel"
    Then the childcare field should display "<Message> childcare costs"
    Then the insurance field should display "<Message> insurance"
    Then the groceries field should display "<Message> groceries"
    Then the health field should display "<Message> health"
    Then the User toggles on English language

    Examples:
      | lang    | value | Message                                                |
      | English | -1    | Enter a positive number only for                       |
      | English | 1.000 | Amount must not contain more than 2 decimal places for |

  Scenario Outline: Error Validation on Add Spending Page - Invalid chars
    Given A user logs in and gets to the affordability pages
    And the user clicks continue
    And the user clicks on the add spending link
    When the User toggles on <lang> language
    When the user enters <value> into the housing field
    When the user enters <value> into the pension field
    When the user enters <value> into the council tax field
    When the user enters <value> into the utilities field
    When the user enters <value> into the debt repayments field
    When the user enters <value> into the travel field
    When the user enters <value> into the childcare field
    When the user enters <value> into the insurance field
    When the user enters <value> into the groceries field
    When the user enters <value> into the health field
    And the user clicks continue
    Then the housing field should display "Housing <Message>"
    Then the pension field should display "Pension contributions <Message>"
    Then the council tax field should display "Council tax <Message>"
    Then the utilities field should display "Utilities <Message>"
    Then the debt repayments field should display "Debt repayments <Message>"
    Then the travel field should display "Travel <Message>"
    Then the childcare field should display "Childcare costs <Message>"
    Then the insurance field should display "Insurance <Message>"
    Then the groceries field should display "Groceries <Message>"
    Then the health field should display "Health <Message>"
    Then the User toggles on English language

    Examples:
      | lang    | value | Message                                 |
      | English | !@    | must be an amount, like £100 or £250.75 |

### Affordability - How Many Months
  Scenario: Affordability - Error Validation on How Many Months Page - No selection
    Given A user logs in and gets to the affordability pages
    And the user clicks continue
    And the user clicks on the add income link
    And the user adds monthly income of 1000, benefits of 200 and other income of 300
    And the user clicks continue
    And the user clicks on the add spending link
    And the user adds monthly spending of 10 to all fields
    And the user clicks continue
    And the user clicks continue
    And the user clicks continue
    Then the plan selection field should display "Select how much you can pay each month"

  Scenario Outline: Affordability - Error Validation on How Many Months Page
    Given A user logs in and gets to the affordability pages
    And the user clicks continue
    And the user clicks on the add income link
    And the user adds monthly income of 100, benefits of 200 and other income of 300
    And the user clicks continue
    And the user clicks on the add spending link
    And the user adds monthly spending of 10 to all fields
    And the user clicks continue
    And the user clicks continue
    And the user enters <value> on the how many months page
    And the user clicks continue
    Then the custom amount field should display "<error>"

    Examples:
      | value   | error                                              |
      | 273.86  | Enter a monthly payment amount                     |
      | 1506.29 | Enter a monthly payment amount                     |
      |         | Enter a monthly payment amount                     |
      | !@      | Enter a monthly payment amount                     |
      | ABC     | Enter a monthly payment amount                     |
      | -260    | Enter a monthly payment amount                     |
      | 333.333 | Amount must not contain more than 2 decimal places |

### Affordability - How Many Months Custom

  Scenario Outline: Affordability - Error Validation on How Many Months Page (Custom amount)
    Given A user logs in and gets to the affordability pages
    And the user clicks continue
    And the user clicks on the add income link
    And the user adds monthly income of 100, benefits of 200 and other income of 300
    And the user clicks continue
    And the user clicks on the add spending link
    And the user adds monthly spending of 10 to all fields
    And the user clicks continue
    And the user clicks continue
    And the user enters custom amount on the how many months page
    And the user clicks continue
    And the user enters <value> on the how many months page
    And the user clicks continue
    Then the custom amount field should display "<error>"

    Examples:
      | value   | error                                              |
      | 273.86  | Enter a monthly payment amount                     |
      | 1506.29 | Enter a monthly payment amount                     |
      |         | Enter a monthly payment amount                     |
      | !@      | Enter a monthly payment amount                     |
      | ABC     | Enter a monthly payment amount                     |
      | -260    | Enter a monthly payment amount                     |
      | 333.111 | Amount must not contain more than 2 decimal places |