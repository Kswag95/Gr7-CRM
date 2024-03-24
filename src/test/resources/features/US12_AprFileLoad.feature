@Leila
Feature: As a user, I should be able to upload files and pictures to appreciation.

Background: User is on the Activity Stream page
	Given is on the login page
	When user should login witch correct credentials
	When user should click Activity Stream
	When User clicks on MORE tab
	And User clicks on Appreciation
	And User clicks on Upload files
	And user upload the files "<fileType>"
	@Leila1
	Scenario Outline: Verify that the user can upload <fileType>
	Then user should be able to see "<fileType>" in the uploaded files
		Examples:
			| fileType      |
			| TestDocx.docx |
            | TestJpeg.jpg  |
            | TestPdf.pdf   |
            | TestPng.png   |
            | TestTxt.txt   |

	@Leila2
	Scenario Outline: Verify that the <userType> can insert the <fileType>into the text.
		And User clicks on Insert in text
		Then user should be able to see "<fileType>" in the message
		Examples:
			| fileType      |
			| TestDocx.docx |
			| TestJpeg.jpg  |
			| TestPdf.pdf   |
			| TestPng.png   |
			| TestTxt.txt   |


	@Leila3
	Scenario Outline: Verify that the <userType> can remove <fileType> at any time before sending.
		And User clicks on X button
		Then user should not be able to see "<fileType>" in the uploaded files
		Examples:
			| fileType      |
			| TestDocx.docx |
			| TestJpeg.jpg  |
			| TestPdf.pdf   |
			| TestPng.png   |
			| TestTxt.txt   |


