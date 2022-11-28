@welsh
Feature: Welsh Content

### Happy Path - Welsh Content

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
    And the user enters valid bank details
    And the user clicks continue
    And the user is on the ConfirmDirectDebitDetailsPage
    And the user clicks continue_button
    Then the user is on the TermsAndConditionsPage
    And the User toggles on English language
    And the user clicks continue_button
    Then the submission has been successful

  Scenario Outline: Welsh - Call Us - Eligibility pages content
    Given A user logs in and clicks link to the <page>
    And the User toggles on Welsh language
    Then the user is on the <page>
    And the User toggles on English language

    Examples:
      | page                   |
      | CallUsNotEligiblePage  |
      | CallUsNotEnrolledPage  |
#      | CallUsDebtTooLargePage |
#      | NeedToFilePage         |


### Error Validation

  Scenario: Welsh - Error Validation on About your Account Details page - no selection
    Given A user logs in and gets to the About your bank account page
    And the User toggles on Welsh language
    And the user clicks continue
    Then the account type field should display "Dewiswch pa fath o gyfrif yr ydych yn ei ddarparu"
    Then the account holder field should display "Dewiswch ‘Iawn’ os mai chi yw deiliad y cyfrif"
    And the User toggles on English language

  Scenario Outline: Welsh - Error Validation on Set Up Direct Debit page - Field Validation
    Given A user logs in and gets to the About your bank account page
    When the user selects personal and is the account holder on the About account page
    And the user clicks continue
    When the User toggles on <lang> language
    When the user enters <Input Value> into the <Field> field
    And the user clicks continue
    Then the <Field> field should display "<Message>"
    Then the User toggles on English language

    Examples:
      | lang  | Input Value | Field          | Message                                           |
      | Welsh | none        | Account Name   | Nodwch enw cyfrif                                 |
      | Welsh | "Test"      | Account Name   | Gwiriwch fod enw eich cyfrif yn gywir             |
      | Welsh | none        | Sortcode       | Nodwch god didoli                                 |
      | Welsh | 00.00.00    | Sortcode       | Rhaid i’r cod didoli fod yn rhif 6 digid          |
      | Welsh | none        | Account Number | Nodwch rif y cyfrif                               |
      | Welsh | 52173       | Account Number | Mae’n rhaid i rif y cyfrif fod rhwng 6 ac 8 digid |
