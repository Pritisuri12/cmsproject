@logout
  Feature:As a user want to logout the application
    Scenario: Able to logout the application as admin
      Given I am logged in as a user
      And enter the name "admin"
      And enter the password "admin"
      And click on login button
      When I click on logout button
      Then should be logged out the application


    Scenario: Able to logout the application as author
      Given I am logged in as a user
      And enter the name "author"
      And enter the password "author"
      And click on login button
      When I click on logout button
      Then should be logged out the application

    Scenario:  Scenario: Able to logout the application as editor
     Given I am logged in as a user
     And enter the name "editor"
     And enter the password "editor"
     And click on login button
     When I click on logout button
     Then should be logged out the application

  #TODO: more sceneios
  #TODO: more validations
  #TODO:more functionalities
  #TODO:Negative scenerios
  #TODO:logout button is not visible
