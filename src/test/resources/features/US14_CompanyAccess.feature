Feature: Company page functionality
  Agile Story : As a user , I should be able to access the Company page

  Background: User is on the login page of the application
    Given User type in application url into browser
    Then User in on the "Authorization"  page
  @US14
  Scenario Outline: Verify that user can see the all modules
    Given User types "<userName>" in user name input box
    When User types "<password>" in password input box
    And User click on login button
    And user should click Activity Stream
    And user should click "Company"
    And User in on the "Company"  page
    Then User should see modules
      | Official Information |
      | Our Life             |
      | About Company        |
      | Photo Company        |
      | Video                |
      | Career               |
      | Business News(RSS)   |
      | More                 |

    Examples:
      | userName             | password |
      | hr1@cydeo.com        | UserUser |
      | helpdesk1@cydeo.com  | UserUser |
      | marketing1@cydeo.com | UserUser |