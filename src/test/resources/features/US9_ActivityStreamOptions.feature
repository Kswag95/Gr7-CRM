@US9
Feature: Activity stream page options verification
  Agile story: As a user, I should be able to see all the options on the Activity stream page

  Background: User is on the Activity Stream page
    Given is on the login page
    When user should login witch correct credentials
    When user should click Activity Stream


  @B32G7-147 @AC1
  Scenario: Verify that the user views the following options on the Activity Stream page
    Then User should be able to see MESSAGE option
    Then User should be able to see TASK option
    Then User should be able to see EVENT option
    Then User should be able to see POLL option
    Then User should be able to see MORE option

  @B32G7-147 @AC2
  Scenario: Verify that the user views the following 4 options under the MORE tab
    When user clicks on the MORE option
    Then User should be able to see File option
    Then User should be able to see Appreciation option
    Then User should be able to see Announcement option
    Then User should be able to see Workflow option
