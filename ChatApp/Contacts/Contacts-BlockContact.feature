Feature: Contacts - Block Contact
    As a ChatApp user
    I want to block an existing ChatApp contact
    So that they no longer have the option to send me messages

    Scenario: Contact is linked
        Given I have an account
        And I am linked with a contact
        When I choose to block them
        Then I should not receive messages from them
        And they should not be able to send messages to me
        And I should not be able to send messages to them