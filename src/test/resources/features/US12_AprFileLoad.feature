@Leila
Feature: As a user, I should be able to upload files and pictures to appreciation.

Background: User is on the Activity Stream page
	Given is on the login page
	When user should login witch correct credentials
	When user should click Activity Stream
	When User clicks on MORE tab
	And User clicks on Appreciation
	And User clicks on Upload files

	@Leila1
	Scenario Outline: Verify that the user can upload <fileName >
		And user upload the files "<fileName>"
	Then user should be able to see "<fileName>" in the uploaded files
		Examples:
			| fileName       |
			| TestDocx.docx |
            | TestJpeg.jpg  |
            | TestPdf.pdf   |
            | TestPng.png   |
            | TestTxt.txt   |

	@Leila2
	Scenario Outline: Verify that the user can insert the <fileName>into the text.
		And user upload the files "<fileName>"
		And User clicks on Insert in text
		Then user should be able to see "<fileName>" in the message
		Examples:
			| fileName      |
			| TestDocx.docx |
			| TestJpeg.jpg  |
			| TestPdf.pdf   |
			| TestPng.png   |
			| TestTxt.txt   |


	@Leila3
	Scenario Outline: Verify that the user can remove <fileName> at any time before sending.
		And user upload the files "<fileName>"
		And User clicks on X button
		Then user should not be able to see "<fileName>" in the uploaded files
		Examples:
			| fileName       |
			| TestDocx.docx |
			| TestJpeg.jpg  |
			| TestPdf.pdf   |
			| TestPng.png   |
			| TestTxt.txt   |


