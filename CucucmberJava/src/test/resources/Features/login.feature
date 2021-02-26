#Author: Akash.chaudhary@trafigura.com
@SmokeTest
Feature: Verify the login page functionality
  @PositiveTestCases @NegativeTestCases
  Scenario Outline: Verify the user login with valid Username and Password
    Given User is at login page
    When User enter <Username> and <Password>
    And User clicks on login button
    Then User should navigates to login page

    Examples: 
      | Username | Password |
      | Akash    |    12345 |
      | Vikas    |    12345 |

  @NegativeTestCases
  Scenario Outline: Verify the user login with invalid Username and Password
    Given User is at login page
    When User enter <Username> and <Password>
    And User clicks on login button
    Then User should not navigates to login page

    Examples: 
      | Username | Password |
      | Akash1   |     1234 |
      | Vikas1   |     1234 |
