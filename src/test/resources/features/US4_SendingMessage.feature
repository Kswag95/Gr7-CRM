@us4
Feature: Sending message functionality
  Agile story: As a user, I should be able to send messages by clicking on Message tab in the Activity Stream.


  Background: User is on the Activity Stream page
    Given is on the login page
    When user should login witch correct credentials
    Then user should click Activity Stream
    #When user clicks on the message tab

  Scenario: Verify that the user can send a message by filling in the mandatory fields.
    When user clicks on the message tab
    When user should type a message on the message box
    When user clicks on the add more button and select a user
    Then user should click on the send button


  Scenario: Verify that the user get the error message when the message box is not filled.
    When user clicks on the message tab
    When user clicks on the add more button and select a user
    When user should click on the send button
    Then user should see the error message for message "The message title is not specified"

  @wip
  Scenario: Verify that the user get the error message when the  any recipient is not selected.
    When user clicks on the message tab
    When user should type a message on the message box
    When user should clear the recipients
    When user should click on the send button
    Then user should see the the error message for recipients "Please specify at least one person."


    Scenario: Verify that the message delivery is to all employees by default
      When user clicks on the message tab
      Then message delivery should be chosen all employees by default


    Scenario: Verify that the user can cancel sending the message at any time before sending.
      When user clicks on the message tab
      When user should type a message on the message box
      When user clicks on the add more button and select a user
      Then user should click on the cancel button

