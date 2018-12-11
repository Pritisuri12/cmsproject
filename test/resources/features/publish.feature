@publish
  Feature: As a user I want to publish my changes on website

    Scenario: publish the content on website
      Given I am login as Author
      And enter the user name "editor"
      And enter the password "editor"
      And click on login button
