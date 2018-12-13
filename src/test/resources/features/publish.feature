@publish
  Feature: As a user I want to publish my changes on website

    Scenario: publish the content on website
      Given I am login as Author
      And enter the user name "author"
      And enter the password "author
      And click on login button
      And click on content
      And click on the My Hippo Project
      And click on the events
      And click on the 2018
      And click on the 12
      And click on test folder
      And from publication request for publish
      When click on publish request
      Then title have the request for publish request


    Scenario: publish the content on website
      Given I am login as Author
      And enter the user name "admin"
      And enter the password "admin"
      And click on login button
      And click on content
      And click on the My Hippo Project
      And click on the events
      And click on the 2018
      And click on the 12
      And click on test folder
      And from request tab accept the public request
      When click on my Hippo Project from view tab
      Then website page will be display

    Scenario: publish the content on website
      Given I am login as Author
      And enter the user name "editor"
      And enter the password "editor"
      And click on login button
      And click on content
      And click on the My Hippo Project
      And click on the events
      And click on the 2018
      And click on the 12
      And click on test folder
      And from request tab accept the public request
      When click on my Hippo Project from view tab
      Then website page will be display


    #TODO:reject the publish request
    #TODO:not able to edit due to event is locked
    #TODO:publish it in future
    #TODO:request it to publish it in future
    #TODO:same we can implement for web , mobile and tablet
    # due to server issue



