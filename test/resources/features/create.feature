@create
Feature: Want to create content for publication

  Scenario: Create content for publication
    Given I am login as Author
    And enter the user name "author"
    And enter the password "author"
    And click on login button
    And click on content
    And click on the My Hippo Project
    And click on the news
    And click on the 2018
    And click on the 12
    And click on downarrow
    And select the add the news item
    And enter the name "climateTest"
    And new popup menu is visible
    And add text on title "Climate Text"
    And add Text in introduction "skjdhkjqhkdkjhdkqjhdkjqhkwdjhkwejd"
    And click on the Set to now
    When click on save and close button
   Then title is updated with the new text
#

