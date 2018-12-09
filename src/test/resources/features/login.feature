@login
Feature: As a employee want to login in the application

  Scenario:Able to login in the web page
    Given I am login as admin
    And I pick the the user name
    And password value
    When I click on login button
    Then I should be able to login
