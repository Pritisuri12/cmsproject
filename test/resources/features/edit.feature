@edit
Feature: Want to edit the content for publication

  Scenario: Create content for publication
    Given I am login as Author
    And enter the user name "author"
    And enter the password "author"
    And click on login button
    And click on channels
    And click on the My Hippo Project
    And click on the news
    And click on the 2018
    And select My Hippo Project
    And click on event button
    And click on edit button
    And add text on title
    When I click on save
    Then title is updated with the new text

