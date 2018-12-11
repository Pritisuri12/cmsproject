@login
Feature: As a employee want to login in the application

  Scenario:Able to login in the web page
    Given I am login as admin
    And  enter the user name "author"
    And enter the password "author"
    When click on login button
    Then should be able to login


