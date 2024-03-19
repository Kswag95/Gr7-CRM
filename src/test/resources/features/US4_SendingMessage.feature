@wip
Feature: Sending message functionality
  Agile story: As a user, I should be able to send messages by clicking on Message tab in the Activity Stream.


  Background: User is on the Activity Stream page
    Given is on the login page
    When user should enter valid username
    When user should enter valid password
    And user should click login button
    Then user should click Activity Stream


  Scenario: Verify that the user can send a message by filling in the mandatory fields.
    When user clicks on the message tab
    When user should type a message on the message box
    When user clicks on the add more button and select a user
    Then user should click on the send button




