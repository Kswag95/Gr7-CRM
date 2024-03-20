#@B32G7-157
Feature: Default


Background: User is on the Activity Stream page
	Given is on the login page
	When user should login witch correct credentials
	When user should click Activity Stream
	When User clicks on MORE tab
	And User clicks on Appreciation
	And User clicks on Upload files

    #Given User is on Activity Stream page
	@Leila
	@B32G7-153
	Scenario: Verify that the user can upload pdf
		And User clicks on Upload files and images
		Then User able to upload .pdf

	Scenario: Verify that the user can upload txt
		And User clicks on Upload files and images
		Then User able to upload .txt

	Scenario: Verify that the user can upload jpeg
		And User clicks on Upload files and images
		Then User able to upload .jpeg

	Scenario: Verify that the user can upload png
		Then User able to upload .png

	Scenario: Verify that the user can upload docx
		Then User able to upload .docx

	
	@B32G7-154
	Scenario: Verify that the user can insert pdf into the text
		    And User clicks on Insert in text
		    Then User can insert the pdf into the text

	Scenario: Verify that the user can insert txt into the text
		And User clicks on Insert in text
		Then User can insert the txt into the text

	Scenario: Verify that the user can insert jpeg
	into the text
		And User clicks on Insert in text
		Then User can insert the jpeg into the text

	Scenario: Verify that the user can insert png into the text
		And User clicks on Insert in text
		Then User can insert the png into the text

	Scenario: Verify that the user can insert docx into the text
		And User clicks on Insert in text
		Then User can insert the docx into the text

	
	@B32G7-155
	Scenario: Verify that the user can remove pdf at any time before sending
		    And User clicks on Insert in text
		    Then User can remove pdf at any time before sending

	Scenario: Verify that the user can remove txt at any time before sending
		And User clicks on Insert in text
		Then User can remove txt at any time before sending

	Scenario: Verify that the user can remove jpeg at any time before sending
		And User clicks on Insert in text
		Then User can remove jpeg at any time before sending

	Scenario: Verify that the user can remove png at any time before sending
		And User clicks on Insert in text
		Then User can remove png at any time before sending

	Scenario: Verify that the user can remove docx at any time before sending
		And User clicks on Insert in text
		Then User can remove docx at any time before sending