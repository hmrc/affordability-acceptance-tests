@a11y @zap
Feature: SUPP - SmokeTest

  Scenario: E2E - Smoke (For accessibility / zap page captures)
    Given the user is created and logs in
    And the user clicks start
    And the user clicks continue
    When the user clicks yes on the upfront payment page
    And the user clicks next
    When the user enters 200 on the upfront payment amount page
    And the user clicks continue
    And the user clicks continue
    And the user enters 28 on the what day of the month page
    And the user clicks next
    And the user clicks continue
    And the user clicks on the add income link
    And the user adds monthly income of £100, benefits of 2,000 and other income of 3  00
    And the user clicks continue
    And the user clicks on the add spending link
    And the user adds monthly spending of £1,  000 to all fields
    And the user clicks continue
    And the user clicks continue
    And the user enters 50 percent on the how many months page
    And the user clicks next
    And the user clicks continue
    When the user selects personal and is the account holder on the About account page
    And the user clicks continue
    When the user enters valid bank details
    And the user clicks continue
    And the user clicks continue_button
    And the user clicks continue_button
    Then the user clicks View your payment plan