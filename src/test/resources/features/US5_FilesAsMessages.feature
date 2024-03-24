@Fulati1
Feature: Upload files and picture as messages function
  Agile story: As a user, I should be able to upload files and pictures as messages.

  Background: User is on the Activity Stream page
    Given is on the login page
    When user should login witch correct credentials
    When user should click Activity Stream
    When User clicks on MORE tab
    And User clicks on Appreciation
    And User clicks on Upload files
    And user upload the files "<fileType>"

  @Fulati1_1

  Scenario Outline: Verify that the user can upload <fileType>
    Then user should be able to see "<fileType>" in the uploaded files
    Examples:
      | fileType      |
      | TestDocx.docx |
      | TestJpeg.jpg  |
      | TestPdf.pdf   |
      | TestPng.png   |
      | TestTxt.txt   |

  @Fulati1_2
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


  @Fulati1_3
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

  Scenario: Verify that the user can upload files and pictures (Supported file formats .pdf, .txt, .jpeg, .png, .docx).
    Given User is on Main page
    When User clicks "Send message..." text input box
    And User clicks "Upload files" button
    And User clicks on Upload files and images
    And User select files and pictures
    And User clicks on "Send button"
    Then User should able to upload files and picture


  Scenario: Verify that the user can insert the files and images into the text.
    Given User is on Main page
    When User clicks "Send message..." text input box
    And User clicks "Upload files" button
    And User clicks on Upload files and images
    And User select files and pictures
    And User clicks on Insert in text
    Then User should able to insert the files and images into the text


  Scenario: Verify that the user can remove files and images at any time before sending.
    Given User is on Main page
    When User clicks "Send message..." text input box
    And User clicks "Upload files" button
    And User clicks on Upload files and images
    And User select files and pictures
    And User clicks on Insert in text
    And User clicks X (remove) button
    Then User can remove files and images at any time before sending





