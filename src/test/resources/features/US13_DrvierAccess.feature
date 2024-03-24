@US13
Feature: Driver page functionality
  Agile story: As a user, I should be able to access the Drive page.

  Background: User is on the login page of the application
    Given User type in application url into browser
    Then User in on the "Authorization"  page

  @US13-AC1
  Scenario Outline: Verify that user can see 7 modules on the Drive Page
    Given User types "<userName>" in user name input box
    When User types "<password>" in password input box
    And User click on login button
    And user should click Activity Stream
    And user should click "Drive"
    And User in on the "My Drive"  page
    Then User should see modules
      | My Drive                   |
      | All Documents              |
      | Company Drive              |
      | Sales and Marketing        |
      | Top Management's documents |
      | Drive Cleanup              |
      | More                       |

    Examples:
      | userName            | password |
      | hr1@cydeo.com       | UserUser |
      | helpdesk1@cydeo.com | UserUser |
      | marketing1@cydeo.com| UserUser |