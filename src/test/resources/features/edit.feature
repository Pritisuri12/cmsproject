@edit
Feature: Want to edit the content for publication

  Scenario: edit content for publication as editor
    Given I am login as user
    And enter the user name "editor"
    And enter the password "editor"
    And click on login button
    And click on channels
    And click on My Hippo Project
    And click on events button
    And click on the edit option
    And select My Hippo Project
    And click on event button
    And click on edit button
    And add text on title
    When I click on save
    Then title is updated with the new text


   Scenario: edit content for publication as admin Given I am login as user
     And enter the user name "admin"
     And enter the password "admin"
     And click on login button
     And click on channels
     And click on the events
     And pick the event and click on the edit button
     And add text in the title
     And click on the save button
     And able to see the publish button
     And click on the publish button
     And popup menu displayed with ok and cancel button
     When Click on publish button


  Scenario: edit content for publication as editor
    Given I am login as user
    And enter the user name "admin"
    And enter the password "admin"
    And click on login button
    And click on channels
    And click on My Hippo Project
    And click on events button
    And click on the edit option
    And select My Hippo Project
    And click on event button
    And click on edit button
    And add text on title
    When I click on save
    Then title is updated with the new text


  Scenario: edit content for publication as editor
    Given I am login as user
    And enter the user name "author"
    And enter the password "Author"
    And click on login button
    And click on channels
    And click on My Hippo Project
    And click on events button
    And click on the edit option
    And select My Hippo Project
    And click on event button
    And click on edit button
    And add text on title
    When I click on save
    Then title is updated with the new text

  #TODO:add and delete different kind of content
  #TODO: images
  #TODO: test format , indentations
  #TODO:apply different validations
   #TODO:pick specific dates  for publish

