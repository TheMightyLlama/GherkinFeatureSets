Feature: Notification when a contact sends a message
    As a ChatApp user
    I want to know when a contact of mine sends me a message
    So that I can continue chatting with them

    Scenario: Contact sends a text string
        Given I have an account
        And I have the ChatApp in the background
        And Bob is a contact
        When Bob sends me a message
        And it is only text
        Then I should receive a notification showing the first 30 characters

    Scenario: Contact sends an emoji
        Given I have an account
        And I have the ChatApp in the background
        And Bob is a contact
        When Bob sends me a message
        And it has an emoji
        Then I should receive a notification showing the first 30 characters
        And it should show the emoji

    Scenario: Contact sends a location
        Given I have an account
        And I have the ChatApp in the background
        And Bob is a contact
        When Bob sends me a message
        And it contains a location
        Then I should be informed: "Bob has sent you a location"
        And I should be able to open it in google maps

    Scenario: Contact sends a sound clip
        Given I have an account
        And I have the ChatApp in the background
        And Bob is a contact
        When Bob sends me a message
        And it contains a sound clip
        Then I should be informed: "Play sound clip from Bob"
        And I should be able listen to it.

    Scenario: Contact sends a video clip
        Given I have an account
        And I have the ChatApp in the background
        And Bob is a contact
        When Bob sends me a message
        And it contains a sound clip
        Then I should be informed: "Play video clip from Bob"
        And I should be able view it.

    Scenario: Contact sends a web link
        Given I have an account
        And I have the ChatApp in the background
        And Bob is a contact
        When Bob sends me a message
        And it contains a web link
        Then I should be informed: "View link from Bob"
        And I should be redirected to it.

