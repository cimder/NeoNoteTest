Feature: Main Page
  @Regression
  Scenario: Verify the main page elements
    Given I am on the entry page
    Then I click on the Login
    Then I enter the username
    And I enter the password
    When I click on the Submit button
    Then I click on the Places button
    And I click on the Add New Place Button
    Then I enter the Place name
    And I enter the Address
    And I select the rate
    And I upload a photo
    And I write my note
    Then I click on Add button
   # And close the driver


