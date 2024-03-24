@US8
Feature: As a user, I should be able to use functions on Company Structure under Employee menu

  Background: User is on the login page of the application
    Given User type in application url into browser


  Scenario Outline: Verify that the Company Structure is visible for all user types.
    When User types "<userName>" in user name input box
    And User types "<password>" in password input box
    And User click on login button
    And User clicks on Employees Module
    Then User sees Company Structure in the Page Title

    Examples:
      | userName              | password |
      | hr4@cydeo.com         | UserUser |
      | helpdesk20@cydeo.com  | UserUser |
      | marketing69@cydeo.com | UserUser |



    Scenario Outline: Verify that the HR user can add a department from the Company Structure.
      When User types "<userName>" in user name input box
      And User types "<password>" in password input box
      And User click on login button
      And User clicks on Employees Module
      Then User can click to add department


      Examples:
        | userName              | password |
        | hr4@cydeo.com         | UserUser |


      Scenario Outline: Verify that the “ADD DEPARTMENT” button is not displayed for Helpdesk and Marketing users.

        When User types "<userName>" in user name input box
        And User types "<password>" in password input box
        And User click on login button
        And User clicks on Employees Module
        Then User can not click to add Department

        Examples:
          | userName              | password |
          | helpdesk20@cydeo.com  | UserUser |
          | marketing69@cydeo.com | UserUser |