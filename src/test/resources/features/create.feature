@create
Feature: Want to create content for publication

  Scenario: Create content for publication
    Given I am login as Author
    And enter the user name "author"
    And enter the password "author"
    And click on login button
    And click on content
    And click on the My Hippo Project
    And click on the events
    And click on the 2018
    And click on the 12
    And click on down arrow
    And select the add button the event item
    And enter the name "Test"
    And click on OK button
    And add text on title "Climate Text"
    And add Text in introduction "skjdhkjqhkdkjhdkqjhdkjqhkwdjhkwejd"
    And click on the Set to now
    And click on save and close button
    And title is updated with the new text
    And move mouse on publication
    When click on publish request
    Then Header is changed to Publication request



Scenario: Create new event as author from channel
  Scenario: Create content for publication
    Given I am login as Author
    And enter the user name "admin"
    And enter the password "admin"
    And click on login button
    And click on content
    And click on the events
    And click on the + singh to add new event
    And enter "new test" as the document name
    And click on the create button
    And enter the text in the title
    And pick the current date as the start date
    And click on the save button
    And enter the "intro " in the title
    And click on publish button
    And Request publication popup menu is displayed
    And accept the "Request publication"

    Scenario: Create new event as editor from content
      Given I am login as Author
      And enter the user name "editor"
      And enter the password "editor"
      And click on login button
      And click on content
      And click on the My Hippo Project
      And click on the events
      And click on the 2018
      And click on the 12
      And click on the downarrow
      And select the "Add new event..."
      And "sample" as name
      And click on OK button
      And add "sample text " as the title
      And "this is the sample" in introduction
      And " the is the sample test to check the content of the form " in the content
      And click on the set to now button for start date
      And click on the set to now button for end date
      And Click on the "Save & Close" button



  #TODO: Add more functionality like images,text, content
  #TODO: create news items
  #TODO:  events
  #TODO: # colours
  #TODO: # both from channels and content tab
  #TODO: different dates and
