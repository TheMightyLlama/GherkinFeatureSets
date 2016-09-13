# Gherkin Feature Sets
Sets of exemplary Gherkin features and step definitions written for fictitious applications

## Generic Applications available are:
* Chat App
* Banking App

## Each feature file has:

A feature summary
Scenarios in the format of specific Acceptance Tests (ATDD)
Step definition files for Java, JavaScript and Ruby

```gherkin
    Feature: Login with the ChatApp account
       As a ChatApp user
       I want to login with my ChatApp credentials
       So that I can chat with my friends
```


 
```gherkin
    Scenario: Correct Email Pass Combo
        Given I am not logged into the ChatApp
        And I use the email address: "foo@example.com"
        And I use the password: "goodpass"
        When I attempt to login
        Then I should be given access to the service
```

```Java
    @Given("^a user with the username \"([^\"]*)\"$")
    public void a_user_with_the_username_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @Given("^I am not logged into the ChatApp$")
    public void i_am_not_logged_into_the_chatapp() throws Throwable {
        throw new PendingException();
```

```JavaScript
```

```Ruby
    Given /^a user with the username \"([^\"]*)\"$/ do |foochatappcom|
        # do something
    end
    Given /^I am not logged into the ChatApp$/ do 
        # do something
    end
    When /^I attempt to login$/ do 
        # do something
    end
```
