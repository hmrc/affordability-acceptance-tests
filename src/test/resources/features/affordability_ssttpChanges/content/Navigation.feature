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