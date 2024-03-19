@B32G7-157
Feature: Default

	
	@B32G7-153
	Scenario: Verify that the user can upload files and pictures.
		Given User is on Activity Stream page
		   When User clicks on MORE tab
		   And User clicks on Appreciation
		   And User clicks on Upload files
		   And User clicks on Upload files and images	

	
	@B32G7-154
	Scenario: Verify that the user can insert the files and images into the text
		Given User is on Activity Stream page
		    When User clicks on MORE tab
		    And User clicks on Appreciation
		    And User clicks on Upload files
		    And User clicks on Upload files and images
		    And User clicks on Insert in text
		    Then User can insert the file and images into text	

	
	@B32G7-155
	Scenario: Verify that the user can remove files and images at any time before sending
		Given User is on Activity Stream page
		    When User clicks on MORE tab
		    And User clicks on Appreciation
		    And User clicks on Upload filesGiven
		    And User clicks on Upload files and images
		    And User clicks on Insert in text
		    Then User can remove files and images at any time before sending