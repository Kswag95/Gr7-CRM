@B32G7-169
Feature: Send appreciation functionality
	Agile story: As a user, I should be able to send appreciation
	by clicking on Appreciation tab in the Activity Stream.

	Background: User is on the Activity Stream page
		Given is on the login page
		When user should login witch correct credentials
		Then user should click Activity Stream
	
	@B32G7-166
	Scenario: Verify that the user can send an appreciation by filling in the mandatory fields.    
		When user clicks on the more icon
		When user clicks on appreciation option
		When user clicks on the send button
		Then user sees "The message title is not specified."
		When user types any appreciation message
		When user closes All employees button
		When user clicks on the send button
		Then user reads "Please specify at least one person."



	@B32G7-167
	Scenario:  Verify the delivery is 'All employees' by default.
		When user clicks on the more icon
		When user clicks on appreciation option
		Then user sees the appreciation page with the mandatory field To: All employees by default


	@B32G7-168
	Scenario: Verify that the user can cancel sending appreciation at any time before sending.
		When user clicks on the more icon
		When user clicks on appreciation option
		When user types any appreciation message
		Then user clicks on the cancel button at any time






