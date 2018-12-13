@login
Feature: As a employee want to login in the application

  Scenario:Able to login in the web page
    Given I am login as admin
    And  enter the user name "author"
    And enter the password "author"
    When click on login button
    Then should be able to login


  Scenario: Not Able to login in the web page
    Given I am login as admin
    And  enter the user name "author"
    And enter the password " "
    When click on login button
    Then should error message display for empty password


  Scenario:login with wrong username and password
    Given I am login as admin
    And  enter the user name "author"
    And enter the password "author1 "
    When click on login button
    Then should error message display for wrong password

  Scenario:login with special chracters username and password
    Given I am login as admin
    And  enter the user name "author"
    And enter the password "****** "
    When click on login button
    Then should error message display for wrong password

  Scenario:login with spaces in username and password
    Given I am login as admin
    And  enter the user name "author"
    And enter the password "au    hor1 "
    When click on login button
    Then should error message display for wrong password



#getting error while logged in with the author getting refresh page in every second.

