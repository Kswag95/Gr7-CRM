@B32G7-169
Feature: Send appreciation functionality
	Agile story: As a user, I should be able to send appreciation
	by clicking on Appreciation tab in the Activity Stream.

	Background: User is on the CRM page
		Given user is on the login page of the application
		Then user enters valid credentials
	
	@B32G7-166
	Scenario: Verify that the user can send an appreciation by filling in the mandatory fields.    
		Given user clicks on the more icon
		And user clicks on appreciation option
		Then user clicks on the send button
		Then user sees "The message title is not specified."
		Then user types any appreciation message
		Then user closes All employees button
		Then user clicks on the send button
		And user reads "Please specify at least one person."


