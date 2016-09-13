Feature: Notification when a contact registers
    As a ChatApp user
    I want to know when a contact of mine registers with ChatApp
    So that I can start chatting with them

    Scenario: Contact registers
        Given I have an account
        And I have a contact with the details:
            | Name | Number   | 
            | Bob  | 555-1234 |
        When they register an account with the number 555-1234
        Then I should receive a notification saying: "Bob has joined. Say hi!"
