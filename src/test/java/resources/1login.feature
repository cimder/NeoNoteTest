Feature: Sign in
@SmokeTest

  Scenario: Try to sign in with incorrect username
    Given I am on the entry page
    Then I click on the Login
    But I enter a incorrect username
    And I enter the password
    When I click on the Submit button
    Then A warning message should be displayed

  Scenario: Try to sign in with incorrect password
    Given I am on the entry page
    Then I click on the Login
    But I enter a incorrect Password
    And I enter the password
    When I click on the Submit button
    Then A warning message should be displayed

  Scenario: Sign in  with correct username and password
    Given I am on the entry page
    Then I click on the Login
    Then I enter the username
    And I enter the password
    When I click on the Submit button
    Then I should go to the main page
    And close the driver








