@B32G7-169
Feature: Send appreciation functionality
	Agile story: As a user, I should be able to send appreciation
	by clicking on Appreciation tab in the Activity Stream.

	Background user is on the CRM main page

	
	@B32G7-166
	Scenario: Verify that the user can send an appreciation by filling in the mandatory fields.    
		Given user clicks on the more icon
		And user clicks on appreciation option
		Then user sees the appreciation page with the mandatory fields
		Then user clicks on the send button
		Then user sees "The message title is not specified."
		Then user types any "appreciation message"
		Then user closes "All employees" button
		Then user clicks on send button
		And user sees "Please specify at least one person."	

	
	@B32G7-167
	Scenario:  Verify the delivery is 'All employees' by default.
		Given user clicks on the more icon
		And user clicks on appreciation option
		Then user sees the appreciation page with the mandatory field To: "All employees" by default	

	
	@B32G7-168
	Scenario: Verify that the user can cancel sending appreciation at any time before sending.
		Given user clicks on the more icon
		Then user clicks on appreciation option
		Then user sees the appreciation page with the mandatory fields
		And user clicks on the cancel button