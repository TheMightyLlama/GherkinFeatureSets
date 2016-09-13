Feature: Registration - Chat App Account
    As a ChatApp user
    I want to create a new ChatApp account
    In order to chat with my friends


    #See list of valid and invalid email addreses at: http://codefool.tumblr.com/post/15288874550/list-of-valid-and-invalid-email-addresses
    #See wikipedia entry at: https://en.wikipedia.org/wiki/Email_address
    #See password strength options at: http://www.passwordmeter.com/

    Scenario Outline: Valid Email and Password
        Given I do not have a chat app account
        When I attempt to register with the email address: <email> 
        And I attempt to register with the password: <password>
        Then I should be sent a registration email

        Examples:
            | <email>                                                           | <password>                         |  
            | email@example.com                                                 | CorrectHorseBatteryStaple          |                           
            | firstname.lastname@example.com                                    | CorrectHorseBatteryStaple          |                           
            | email@subdomain.example.com                                       | CorrectHorseBatteryStaple          |                           
            | firstname+lastname@example.com                                    | CorrectHorseBatteryStaple          |                           
            | email@123.123.123.123                                             | CorrectHorseBatteryStaple          |                           
            | email@[123.123.123.123]                                           | CorrectHorseBatteryStaple          |                           
            | “email”@example.com                                               | CorrectHorseBatteryStaple          |                           
            | 1234567890@example.com                                            | CorrectHorseBatteryStaple          |                           
            | email@example-one.com                                             | CorrectHorseBatteryStaple          |                           
            | _______@example.com                                               | CorrectHorseBatteryStaple          |                           
            | email@example.name                                                | CorrectHorseBatteryStaple          |                           
            | email@example.museum                                              | CorrectHorseBatteryStaple          |                           
            | email@example.co.jp                                               | CorrectHorseBatteryStaple          |                           
            | firstname-lastname@example.com                                    | CorrectHorseBatteryStaple          |                           
            | much.“more\ unusual”@example.com                                  | CorrectHorseBatteryStaple          |                           
            | very.unusual.“@”.unusual.com@example.com                          | CorrectHorseBatteryStaple          |                           
            | very.“(),:;<>[]”.VERY.“very@\\"very”.unusual@strange.example.com  | CorrectHorseBatteryStaple          |  


    Scenario Outline: Invalid Email
        Given I do not have a chat app account
        When I attempt to register with the email address: <email>
        And I attempt to register with the password: <password>
        Then I should be informed "Email is not a valid format"

        Examples:
            | <email>                       | <password>                |  
            | plainaddress                  | CorrectHorseBatteryStaple |  
            | #@%^%#$@#$@#.com              | CorrectHorseBatteryStaple |  
            | @example.com                  | CorrectHorseBatteryStaple |  
            | Joe Smith <email@example.com> | CorrectHorseBatteryStaple |  
            | email.example.com             | CorrectHorseBatteryStaple |  
            | email@example@example.com     | CorrectHorseBatteryStaple |  
            | .email@example.com            | CorrectHorseBatteryStaple |  
            | email.@example.com            | CorrectHorseBatteryStaple |  
            | email..email@example.com      | CorrectHorseBatteryStaple |  
            | あいうえお@example.com         | CorrectHorseBatteryStaple |  
            | email@example.com (Joe Smith) | CorrectHorseBatteryStaple |  
            | email@example                 | CorrectHorseBatteryStaple |  
            | email@-example.com            | CorrectHorseBatteryStaple |  
            | email@example.web             | CorrectHorseBatteryStaple |  
            | email@111.222.333.44444       | CorrectHorseBatteryStaple |  
            | email@example..com            | CorrectHorseBatteryStaple |  
            | Abc..123@example.com          | CorrectHorseBatteryStaple |  


    #This depends entirely on your password policy
    Scenario Outline: Invalid Password
        Given I do not have a chat app account
        When I attempt to register with the email address: <email>
        And I attempt to register with the password: <password>
        Then I should be informed "Password is not a valid format"

        Examples:
            | <email>           | <password> |  
            | email@example.com |            |  
            | email@example.com |            |  
            | email@example.com |            |  
            | email@example.com |            |  
            | email.example.com |            |  
            | email@example.com |            |  



    Scenario: Email already in use
        Given I have a chat app account
        And I use the email address: "alice@thechatapp.com"
        When I attempt to register with the email address: "alice@thechatapp.com" 
        Then I should be informed: "An account already exists with this email address. Reset Password?"


