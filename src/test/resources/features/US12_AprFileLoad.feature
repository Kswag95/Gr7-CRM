@Leila
Feature: Default


Background: User is on the Activity Stream page
	Given is on the login page
	When user should login witch correct credentials
	When user should click Activity Stream
	When User clicks on MORE tab
	And User clicks on Appreciation
	And User clicks on Upload files

    #Given User is on Activity Stream page
	@AC1l
	Scenario: Verify that the user can upload pdf
		And User clicks on Upload file to upload pdf
		Then uploaded files is displayed
	@AC1l
	Scenario: Verify that the user can upload txt
		And User clicks on Upload file to Upload txt
		Then uploaded files is displayed
	@AC1l
	Scenario: Verify that the user can upload jpeg
		And User clicks on Upload file to Upload jpeg
		Then uploaded files is displayed
	@AC1l
	Scenario: Verify that the user can upload png
		And User clicks on Upload file to Upload png
		Then uploaded files is displayed
	@AC1l
	Scenario: Verify that the user can upload docx
		And User clicks on Upload file to Upload docx
		Then uploaded files is displayed

	@AC2la
	Scenario: Verify that the user can insert pdf into the text
		And User clicks on Upload file to upload pdf
		And uploaded files is displayed
		And User clicks on Insert in text
		Then User can insert the pdf into the text
	@AC2l
	Scenario: Verify that the user can insert txt into the text
		And User clicks on Upload file to Upload txt
		And uploaded files is displayed
		And User clicks on Insert in text
		Then User can insert the txt into the text
	@AC2l
	Scenario: Verify that the user can insert jpeg
	into the text
		And User clicks on Upload file to Upload jpeg
		And uploaded files is displayed
		And User clicks on Insert in text
		Then User can insert the jpeg into the text
	@AC2l
	Scenario: Verify that the user can insert png into the text
		And User clicks on Upload file to Upload png
		And uploaded files is displayed
		And User clicks on Insert in text
		Then User can insert the png into the text
	@AC2l
	Scenario: Verify that the user can insert docx into the text
		And User clicks on Upload file to Upload docx
		And uploaded files is displayed
		And User clicks on Insert in text
		Then User can insert the docx into the text


	@AC3l
	Scenario: Verify that the user can remove pdf at any time before sending
		And User clicks on Upload file to Upload txt
		And uploaded files is displayed
		And User clicks on Insert in text
		Then User can insert the txt into the text
		And User clicks on X button
		Then uploaded pdf is not displayed before sending
	@AC3l
	Scenario: Verify that the user can remove txt at any time before sending
		And User clicks on Upload file to Upload txt
		And uploaded files is displayed
		And User clicks on Insert in text
		Then User can insert the txt into the text
		And User clicks on X button
		Then uploaded txt is not displayed before sending
	@AC3l
	Scenario: Verify that the user can remove jpeg at any time before sending
		And User clicks on Upload file to Upload jpeg
		And uploaded files is displayed
		And User clicks on Insert in text
		Then User can insert the jpeg into the text
		And User clicks on X button
		Then uploaded jpeg is not displayed before sending
	@AC3l
	Scenario: Verify that the user can remove png at any time before sending
		And User clicks on Upload file to Upload png
		And uploaded files is displayed
		And User clicks on Insert in text
		Then User can insert the png into the text
		And User clicks on X button
		Then uploaded png is not displayed before sending
	@AC3l
	Scenario: Verify that the user can remove docx at any time before sending
		And User clicks on Upload file to Upload docx
		And uploaded files is displayed
		And User clicks on Insert in text
		Then User can insert the docx into the text
		And User clicks on X button
		Then uploaded docx is not displayed before sending