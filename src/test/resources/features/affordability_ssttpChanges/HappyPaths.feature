Feature: Happy Paths - Affordability

### Cannot set up Direct Debit Page

  @a11y @zap
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



### Affordability - Add Income page

  Scenario Outline: Validation on Add Income Page
    Given A user logs in and gets to the affordability pages
    And the user clicks continue
    And the user clicks on the add income link
    When the user enters <monthlyIncome> into the monthly income field
    When the user enters <benefits> into the benefits field
    When the user enters <otherAmount> into the other income field
    And the user clicks continue

    Examples:
      | monthlyIncome | benefits | otherAmount |
      | none          | 1        | 0           |
      | 0             | none     | 1           |
      | 1             | 0        | none        |

### Affordability - Add Spending page

  Scenario Outline: Validation on Add Spending Page
    Given A user logs in and gets to the affordability pages
    And the user clicks continue
    And the user clicks on the add spending link
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

    Examples:
      | Housing | Pension | Council Tax | Utilities | Debt | Travel | Childcare | Insurance | Groceries | Health |
      | none    | 1       | 0           | none      | 0    | 1      | none      | 0         | 1         | none   |
      | 1       | 0       | none        | 1         | none | 0      | 1         | none      | 0         | 1      |
      | 0       | none    | 1           | 0         | 1    | none   | 0         | 1         | none      | 0      |
      | 0       | 0       | 0           | 0         | 0    | 0      | 0         | 0         | 0         | 0      |
      | none    | none    | none        | none      | none | none   | none      | none      | none      | none   |




