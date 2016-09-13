Feature: Sharing an Emoji 
    As a ChatApp user
    I want to send a contact an Emoji
    So that they know how I'm feeling

    #For full emoji list see here: http://unicode.org/emoji/charts/full-emoji-list.html
    Scenario: Contact sends an emoji
        Given I have an account
        And I have the ChatApp in the background
        And Bob is a contact
        When Bob sends me a message with an emoji
        And it has an emoji
        Then I should see the emoji
        And Bob should see the emoji
