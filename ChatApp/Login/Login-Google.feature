Feature: Login with a Google Account 
    As a ChatApp user
    I want to login with my Google credentials
    So that I can chat with my friends

    Background:
        Given a user with the username: "foo@gmail.com"
        And a password: "goodpass"


    #SUCCESSFUL LOGINS
    Scenario Outline: Successful Login - Token Available
        Given I am logged into a <google service>
        When I attempt to login with google authentication
        Then I should be given access to the ChatApp services

        Examples:
        | google service |  
        | gmail          |  
        | google+        |  


    Scenario: Successful Login - No Token
        Given I am not logged into a google service
        When I attempt to login with google authentication
        And I use the password: "goodpass"
        Then I should be given access to the ChatApp services


    Scenario: Successful Login - Cleared Cache
        Given I am not logged into a google service
        When I attempt to login with google authentication
        And I use the email address: "foo@gmail.com"
        And I use the password: "goodpass"
        Then I should be given access to the ChatApp services


    #UNSUCCESSFUL LOGINS
    Scenario Outline: Unsuccessful Login - Cleared Cache - Non-Valid Email
        Given I am not logged into a google service
        When I attempt to login with google authentication
        And I use the email address: <email> 
        Then I should be informed: "Sorry, Google doesn't recognize that email."

        Examples:
            | <email>                       | 
            | plainaddress                  | 
            | #@%^%#$@#$@#.com              |  
            | @example.com                  |  
            | Joe Smith <email@example.com> |  
            | email.example.com             |  
            | email@example@example.com     |  
            | .email@example.com            |  
            | email.@example.com            |  
            | email..email@example.com      |  
            | あいうえお@example.com         |  
            | email@example.com (Joe Smith) |  
            | email@example                 |  
            | email@-example.com            |  
            | email@example.web             |  
            | email@111.222.333.44444       |  
            | email@example..com            |  
            | Abc..123@example.com          |  

            
    Scenario: Unsuccessful Login - Cleared Cache - Non-Valid password
        Given I am not logged into a google service
        When I attempt to login with google authentiaction
        And I use the email address: "foo@gmail.com" 
        And I use the password: "qwertyuiop"
        Then I should be informed: "The email and password you entered don't match."

    