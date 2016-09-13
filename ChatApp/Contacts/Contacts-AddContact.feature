Feature: Contacts - Add a Contact
    As a ChatApp user
    I want to add someone to local contacts
    So that I can see their account details

    Scenario: 
        Given I have an account
        When I am sent a message from someone
        And I do no have their contact details
        Then I should be able to add them to my local address book