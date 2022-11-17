Feature: Happy Path - English

  Scenario: E2E - Smoke
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
    When they select personal and are the account holder on the About account page
    And the user clicks continue
    When the user enters valid bank details
    And the user clicks continue
    And the user clicks continue_button
    And the user clicks continue_button
    Then the submission has been successful