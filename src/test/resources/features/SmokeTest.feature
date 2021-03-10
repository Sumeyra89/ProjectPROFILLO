Feature: Smoke Test

	Background:

		Given the librarian logged in the application

	@PROF-283 @PROF-249
	Scenario: Edit User Functionality for Smoke Test
		When librarian click the users tab
		Then  Librarian click Edit User button