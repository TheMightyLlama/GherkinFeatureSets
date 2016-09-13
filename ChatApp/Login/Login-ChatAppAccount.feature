Feature: Login with the ChatApp account
    As a ChatApp user
    I want to login with my ChatApp credentials
    So that I can chat with my friends

    Background:
        Given a user with the username "foo@chatapp.com"
        And a password "goodpass"


    Scenario: Correct Email Pass Combo
        Given I am not logged into the ChatApp
        And I use the email address: "foo@chatapp.com"
        And I use the password: "goodpass"
        When I attempt to login
        Then I should be given access to the service


    Scenario Outline: Non-existent username
        Given I am not logged into the ChatApp
        And I use the email address: <email>
        And I use the password: <password>
        When I attempt to login
        Then I am informed that the username I am attempting has not been registered
        And I should be prompted to register with <email>
        
      Examples:
        | email              | password | 
        | badmail.com        | goodpass | 
        | badmail@com        | goodpass | 
        | !@£$%              | goodpass | 


    Scenario: Login incorrectly 3 times
        Given I am not logged into the ChatApp
        And I attempt to login
        And I use the email address: "foo@chatapp.com"
        And I use the password: "badpass"
        When I attempt the login 3 times
        Then I should be informed that I have made too many attempts
        And I should be informed that I can only attempt to login from my ip after five minutes
