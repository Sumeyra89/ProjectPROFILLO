@edit
Feature:Edit user function

  Background:
    Given the librarian logged in the application

  @PROF-230
  Scenario: Edit User Test
    When librarian click the users tab
    And   Librarian click Edit User button
    And change the Full Name information with "John" and click Save changes
    Then librarian should get "The user is updated."

  @PROF-254
  Scenario: Librarian edit parameters Test
    When librarian click the users tab
    And  Librarian click Edit User button
    And change the Password information with "12345pass" and click Save changes
    Then librarian should get "The user is updated."

  @PROF-256
  Scenario Outline: Test for edit user type
    When librarian should be able to click the users tab
    And choose one user and click Edit User button
    Then  click User Group dropdown,select <groupOptions>,and click Save changes
    Then librarian should get "The user is updated."
    Examples:
      |groupOptions|
      |Librarian   |
      |Students    |


  @PROF-257
  Scenario Outline: Edits for Status of the Users
    When librarian click the Users tab
    And choose one user and click Edit User button
    Then  click Status dropdown,select <statusOptions>,and click Save changes
    Then librarian should get "The user is updated."
    Examples:
      |statusOptions|
      |ACTIVE       |
      |INACTIVE     |

