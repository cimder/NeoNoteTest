Feature: About Us
  @Smoke
  Scenario: Verify the About Us page
    Given I am on the entry page
    Then I click on the Login
    Then I enter the username
    And I enter the password
    Then I click on the Submit button
    When I click on About Us link
    Then I verify that the About Us page is opened
    Then I should go to the main page
    And close the driver

