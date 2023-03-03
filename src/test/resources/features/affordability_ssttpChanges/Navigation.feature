Feature: Navigation tests
#Back button tests
#Change links
#etc. to be added




### Cannot Agree Plan Page
  Scenario: Affordability Screens - Cannot Agree Plan Page - Change Income and Spending link
    Given A user logs in and gets to the affordability pages
    And the user clicks continue
    And the user clicks on the add spending link
    And the user adds monthly spending of 60 to all fields
    And the user clicks continue
    And the user clicks on the add income link
    And the user adds monthly income of 100, benefits of 200 and other income of 300
    And the user clicks continue
    And the user is on the HowMuchYouCanAffordPageSpendingSame
    And the user clicks continue
    And the user is on the CannotAgreePlanPage
    And the user clicks on the change income and spending link
    Then the user is on the HowMuchYouCanAffordPageSpendingSame


### Check your payment plan Page
  Scenario Outline: Affordability Screens - Check your payment plan change links
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
    And the user adds monthly income of 100, benefits of 200 and other income of 300
    And the user clicks continue
    And the user clicks on the add spending link
    And the user adds monthly spending of 10 to all fields
    And the user clicks continue
    And the user clicks continue
    And the user enters 50 percent on the how many months page
    And the user clicks next
    When the user clicks on the change <element> link on the <page>
    And the user is on the <expectedPage>

    Examples:
      | element                | page                              | expectedPage             |
      | Upfront Payment Yes No | AffordabilityCheckPaymentPlanPage | UpfrontPaymentPage       |
      | Upfront Payment Amount | AffordabilityCheckPaymentPlanPage | UpfrontPaymentPage       |
      | Collected On           | AffordabilityCheckPaymentPlanPage | WhatDayOfMonthPage       |
      | Monthly Payment        | AffordabilityCheckPaymentPlanPage | HowManyMonthsPageUpfront |