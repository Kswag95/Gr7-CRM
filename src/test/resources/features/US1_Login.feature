#@US1 @login @B32G7-165
Feature: User login functionality
  Agile Story: As a user , I should be able to login
#@B32G7-159
  Background: User is on the login page of the application
    Given User type in application url into browser
    Then User in on the "Authorization"  page

  @AC1   @B32G7-158
  Scenario Outline: User can login with valid credentials and land on the home page after successful login
    When User types "<userName>" in user name input box
    And User types "<password>" in password input box
    And User click on login button
    Then User in on the "Portal"  page

    @hr
    Examples:
      | userName        | password |
      | hr1@cydeo.com   | UserUser |
      | hr51@cydeo.com  | UserUser |
      | hr101@cydeo.com | UserUser |

    @helpDesk
    Examples:
      | userName              | password |
      | helpdesk1@cydeo.com   | UserUser |
      | helpdesk61@cydeo.com  | UserUser |
      | helpdesk101@cydeo.com | UserUser |

    @marketing
    Examples:
      | userName               | password |
      | marketing1@cydeo.com   | UserUser |
      | marketing71@cydeo.com  | UserUser |
      | marketing101@cydeo.com | UserUser |

  @AC2  @B32G7-160
  Scenario Outline: User can see "Incorrect login or password" message when enters valid user name and invalid password

    When User types "<userName>" in user name input box
    And User types "<invalidPassword>" in password input box
    And User click on login button
    Then User should see error message "Incorrect login or password"


    Examples:
      | userName               | invalidPassword |
      | hr1@cydeo.com          | UserUser1       |
      | helpdesk61@cydeo.com   | userUser        |
      | marketing101@cydeo.com | password        |

  @AC2  @B32G7-161
  Scenario Outline: User can see "Incorrect login or password" message when enters invalid user name and valid password

    When User types "<invalidUserName>" in user name input box
    And User types "<password>" in password input box
    And User click on login button
    Then User should see error message "Incorrect login or password"


    Examples:
      | invalidUserName       | password |
      | hr0@cydeo.com         | UserUser |
      | helpdesk102@cydeo.com | UserUser |
      | something1@cydeo.com  | UserUser |

  @AC3  @B32G7-162
  Scenario Outline: User can see "Please fill out this field" message is the password or username is empty

    When User types "<UserName>" in user name input box
    And User types "<password>" in password input box
    And User click on login button
    Then User should see error message "Please fill out this field"


    Examples:
      | UserName      | password |
      | hr0@cydeo.com |          |
      |               | UserUser |
      |               |          |

  @AC4 @RememberMe @B32G7-163
  Scenario:  User can see and click on "Remember me on this computer" check box
    When User should see "Remember me on this computer" checkbox
    Then User clicks Remember me on this computer checkbox

  @AC5 @bulletPassword @B32G7-164
  Scenario: Password is in bullet signs by default

    When User types "UserUser" in password input box
    Then User should see bullet signs




