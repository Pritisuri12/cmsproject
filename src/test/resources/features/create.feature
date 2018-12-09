@create
  Feature: Want to create content for publication

    Scenario: Create content for publication
      Given I am login as admin
      And click on channels
      And select My Hippo Project
      And click on event button
      And click on edit button
      And add text on title
      When I click on save
      Then title is updated with the new text


