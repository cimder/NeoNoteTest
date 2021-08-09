Feature: Logout
  @Logout
  Scenario: Logout from the user account
    Given I am on the entry page
    Then I click on the Login
    Then I enter the username
    Then I enter the password
    Then I click on the Submit button
    When I click on the logout button
    Then I verify that the Entry page is opened
    And close the driver
