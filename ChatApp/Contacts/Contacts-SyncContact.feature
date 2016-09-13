Feature: Contacts - Synchronise Contacts
    As a ChatApp user
    I want to check if any of my local contacts are already using the ChatApp
    So that I can begin chatting with them immediately

    Scenario: Contacts already use the ChatApp
        Given I have an account
        When I import contats from my local address book
        And my contacts already have ChatApp accounts
        Then I should be able to see them as ChatApp contacts
        And I should be able to see their account details

    Scenario: Contacts do not use the ChatApp
        Given I have an account
        When I import contacts from my local address book
        And my contacts do not have ChatApp accounts
        Then I should not be able to see them as ChatApp contacts