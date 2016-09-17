Feature: Login to App
  As a user
  I want to login
  So that I can perform actions against my accounts

    Background:
      Given a user with the credentials: 
      | username      | password   |
      | username12345 | blahblah55 |


    Scenario: Correct Username Pass Combo
        Given I am not logged into the BankApp
        When I attempt to login as: "username12345"
        Then I should be given access to the service

    Scenario: Incorrect Password
        Given I am not logged into the BankApp
        When I attempt to login as: "username12345"
        And I use the password: "badpass"
        Then I should be informed: "The email and password combindation does not match an account. Please try again"

    Scenario: Non-existent username
        Given I am not logged into the BankApp
        And I use the username: "nonexistentusername"
        And I use the password: "goodpass"
        When I attempt to login
        Then I am informed that the username I am attempting has not been registered
        And I should be prompted: "Please contact your bank on xxx-xxx-xxx"
        

    Scenario: Login incorrectly 3 times
        Given I am not logged into the BankApp
        And I attempt to login
        And I use the username: "badusername"
        And I use the password: "badpass"
        When I attempt the login 3 times
        Then I should be informed that I have made too many attempts
        And I should be informed that my account has been locked
        And I should be informed: "Please contact your bank on xxx-xxx-xxx"