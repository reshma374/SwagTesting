Feature: Test login functionality

  Scenario Outline: Check login is successful with valid credentials
    Given browser is open
    And user is on login page
    When user enters "<username>" and "<password>"  
     And user clicks on login
    Then user is navigated to the inventory page

    
      Examples:

      | username      | password     |
      | standard_user | secret_sauce |
      | problem_user | secret_sauce |
     