@logout
  Feature:As a user want to logout the application
    Scenario: Able to logout the application
      Given I am logged in as a user
      When I click on logout button
      Then should be logged out the application