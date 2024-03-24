Feature: profile page functionality
  Agile Story: As a user , I should be able to access my profile page.

  Background: User is on the Activity Stream page
    Given is on the login page
    When user should login witch correct credentials
    Then user should click Activity Stream

@US3-AC1
  Scenario: Verify that the user can view the following options on My Profile Page
    When user should be able to view drop down menu after clicking on the user name
    When user should be able to click on My Profile
    Then user should be able to see following options
    |General|
    |Drive|
    |Tasks|
    |Calendar|
    |Conversations|

  #WIP
 # Scenario: Verify that the email under the General tab is the same as the user's account
   # When user should be able to view drop down menu after clicking on the user name
    #When user should be able to click on My Profile
    #When user should be able to view the email under Contact Information
    #Then user should see same email as his account

