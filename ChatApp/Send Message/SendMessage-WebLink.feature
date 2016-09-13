Feature: Send Message - Web Link
    As a ChatApp user
    I want to send a contact a web link
    So that they can see a website I have been looking at

    Scenario: Send Website Link
        Given I have an account
        And I have a contact named: "Bob"
        When I send a link to a website
        Then "Bob" should be able to see the name of the linked page
        And "Bob" should be able to see a thumbnail of the website
        And "Bob" should be able to use the link to the website
        And I should be able to see the name of the linked page
        And I should be able to see a thumbnail of the website
        And I should be able to use the link to the website


    Scenario: Send Youtube Link
        Given I have an account
        And I have a contact named: "Bob"
        When I send a link to a youtube video
        Then "Bob" should be able to see the name of the youtube video
        And "Bob" should be able to see a thumbnail of the youtube video
        And "Bob" should be able to use the link to open the youtube video
        And I should be able to see the name of the youtube video
        And I should be able to see a thumbnail of the youtube video
        And I should be able to use the link to the youtube video