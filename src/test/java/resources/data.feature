Feature: Database

  Scenario: Enter new user information to the database by using SQL queries.
    Given Connect to the Neo Note database
    Then insert new user information by using insert queries
    Then check if the new user information on the database by using select queries