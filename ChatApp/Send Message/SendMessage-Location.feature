Feature: Send Message - Location
    As a ChatApp user
    I want to send a contact my current location
    So that they know where I am

    Scenario: Pasted Google Maps Link
        Given I have an account
        And I have a contact named: "Bob"
        And I have copied a google maps link
        When I paste the google maps link
        Then I should see a thumbnail of the map
        And I should be redirected to the map when using it
        And "Bob" should see a thumbnail of the map
        And "Bob" should be redirected to the map when using it

    Scenario: Shared Location
        Given I have an account
        And I have a contact named: "Bob"
        And I have a google maps link
        And I can share it to an app
        When I share it with the ChatApp
        And I share it to my chat with "Bob"
        Then I should see a thumbnail of the map
        And I should be redirected to the map when using it
        And "Bob" should see a thumbnail of the map
        And "Bob" should be redirected to the map when using it