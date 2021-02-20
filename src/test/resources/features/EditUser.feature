Feature: Account type

  Scenario: Librarian
    Given the user logged in as "librarian"
    When the user navigate to
    Then the title contains "Users"
