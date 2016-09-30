Feature: Manage my email address
  As a user
  I want to manage my email address
  So that I always receive calls at the correect device
  
  Background:
  Given the following users:
  |username| full name |
  | Bob | Bob Esquivel | 
  
  Scenario Outline: Successfully edit email address
    Given I am logged in as: <Username>
    When I edit my email address to: <Email>
    Then I am able to save it
    And the bank can send me emails at: <Email>

    Examples:
    | Username | Email                  | 
    | Alice    | alice@thebankapp.com   | 
    | Bob      | bob@thebankapp.com     |
    | Charlie  | charlie@thebankapp.com |

  Scenario Outline: Edit email address with badly formatted email
    Given I am logged in as: <Username>
    When I edit my email address to: <Email>
    Then I am not able to save it
    And I am informed: "The email address is not formatted correctly, please try again"

        Examples:
           | <Username>  | <email>                        | 
           | Bob         | plainaddress                   |
           | Bob         |  #@%^%#$@#$@#.com              |
           | Bob         |  @example.com                  |
           | Bob         |  Joe Smith <email@example.com> |
           | Bob         |  email.example.com             |
           | Bob         |  email@example@example.com     |
           | Bob         |  .email@example.com            |
           | Bob         |  email.@example.com            |
           | Bob         |  email..email@example.com      |
           | Bob         |  あいうえお@example.com         | 
           | Bob         |  email@example.com (Joe Smith) |
           | Bob         |  email@example                 |
           | Bob         |  email@-example.com            |
           | Bob         |  email@example.web             |
           | Bob         |  email@111.222.333.44444       |
           | Bob         |  email@example..com            |
           | Bob         |  Abc..123@example.com          |


  
  Scenario: Leave required fields empty
    Given I am logged in as: <username>
    And I have set my email address as empty
    When I attempt to save it
    Then I am informed: "Your email address cannot be empty. Please fill the field"