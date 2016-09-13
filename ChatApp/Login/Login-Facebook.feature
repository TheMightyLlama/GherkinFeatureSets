Feature: Login with Facebook 
    As a ChatApp user
    I want to login with my facebook credentials
    So that I can chat with my friends

  #See documentation on facebook usernames: https://www.facebook.com/help/329992603752372/
  #See documentation on facebook passwords: https://www.facebook.com/help/124904560921566/

    Background:
        Given a user with the username: "firstname.lastname"
        And a password: "shortpass"


    Scenario: Correct Email Pass Combo
        Given I use the username: "firstname.lastname"
        And I use the password: "shortpass"
        When I attempt to login
        Then I should be given access to the service


    Scenario Outline: Incorrect password
        Given I use the username: <username>
        And I use the password: <password>
        When I attempt to login
        Then I should be informed that the password I have entered is incorrect

        Examples:
            | username           | password | 
            | firstname.lastname | badpass  |
            | badmail@com        | goodpass | 
            | !@£$%              | goodpass | 
            | foo@bar.com        | badpass  | 
            | foo@bar.com        | !@£$%%^  | 

    Scenario Outline: Incorrect username
        Given I use the username: <username>
        And I use the password: <password>
        When I attempt to login
        Then I should be informed that: "The email address or phone number that you've entered doesn't match any account. Sign up for an account."
                
      Examples:
        | username           | password | 
        | notausername       | goodpass |

