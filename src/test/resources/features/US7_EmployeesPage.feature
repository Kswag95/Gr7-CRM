Feature: Employees page structure verification
  Agile Story: As a user, I should be able to access the Employees page

  Background: User is on the Activity Stream Page
    Given is on the login page
    When user should login witch correct credentials


@US7-AC1

  Scenario: Verify users should be able to access the Employees page

    When user click on the Employees button
    Then user should be able to see following modules
    |Company Structure|
    |Find Employee    |
    |Telephone Directory|
    |Staff Changes      |
    |Efficiency Report  |
    |Honored Employees  |
    |Birthdays          |
    |New page           |


