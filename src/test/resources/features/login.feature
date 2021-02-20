@login
Feature: Users should be able to login
  @librarian
  Scenario: Login as a librarian
    Given the user is on the login page
    When the user enters the librarian information
    Then the user should be able to login
