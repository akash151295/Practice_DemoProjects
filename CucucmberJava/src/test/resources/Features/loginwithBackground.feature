Feature: Check logout functionality

  Background: User is at homepage
    Given User is at login page
    When User enters UN and Pwd
    And User clicks on login button
    Then User should navigates to homepage

  Scenario: Validate logout functionality
    When User clicks on logout button
    Then User should be able to logout

  Scenario: Validate sorting functionality
    When User clicks on sorting option
    Then Sorting should be working fine
