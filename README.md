# Gherkin Feature Sets
Sets of exemplary Gherkin features and step definitions written for fictitious applications

Generic Applications available are:
* Chat App
* Banking App

Each feature file:
* Contains a feature summary

```gherkin
    Feature: Login with the ChatApp account
       As a ChatApp user
       I want to login with my ChatApp credentials
       So that I can chat with my friends
```


* Contains Scenarios in the format of specific Acceptance Tests (ATDD)
 
```gherkin
    Scenario: Correct Email Pass Combo
        Given I am not logged into the ChatApp
        And I use the email address: "foo@example.com"
        And I use the password: "goodpass"
        When I attempt to login
        Then I should be given access to the service
```

* Has related a specific step definition file for each of:
 * Java
 * Ruby
 * JavaScript
