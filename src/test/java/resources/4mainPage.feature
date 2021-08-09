Feature: Main Page
  @Smoke
  Scenario: Verify the main page elements
    Given I am on the entry page
    Then I click on the Login
    Then I enter the username
    And I enter the password
    When I click on the Submit button
    Then I verify that the NeoNote logo is clickable
    Then I verify that the NeoNote header is clickable
    Then I verify that the Home link is clickable
    Then I verify that the Places link is clickable
    Then I verify that the About Us link is clickable
    Then I verify that the Profile link is clickable
    Then I verify that the Logout link is clickable
    And close the driver
#    And close the driver




