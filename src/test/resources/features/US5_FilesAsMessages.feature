Feature: Upload files and picture as messages function
  Agile story: As a user, I should be able to upload files and pictures as messages.

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





