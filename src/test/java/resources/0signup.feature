Feature: Create a new user account
@Regression
  Scenario: Signup with personal information
    Given I am on the entry page
    When I click on Explore Now button and open the signup page
    Then I enter the username
    And I enter the email
    And I enter the firstname
    And I enter the lastname
    And I enter the password
    And I enter the group name
    Then I click on the Signup button and submit my enrollment



