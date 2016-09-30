Feature: Manage my telephone address
  As a user
  I want to manage my telephone address
  So that I always receive calls at the correect device
  
  Background:
  Given the following users:
  |username| full name |
  | Alice | Alice Delaroche | 
  | Bob | Bob Esquivel | 
  | Charlie | Charlie Smith | 
  
  Scenario Outline: Edit mailing address
    Given I am logged in as: <Username>
    And I have stated my telephone address as being in: <Country>
    And my country has the international dialling code: <Code>
    When I edit my telephone address with the number: <number>
    Then I am able to save it
    And the bank can call me at: "00<code><number>"

    Examples:
    | Username | Country            | Code        | Number     | 
    | Alice    | FRANCE             | +33         | 555 555 32 | 
    | Bob      | Spain              | +34         | 555 555 31 | 
    | Charlie  | England            | +44         | 555 555 30 | 

  
  Scenario: Leave required fields empty
    Given I am logged in as: <username>
    And I have stated my telephone addres as being in: <Country>
    When I edit my telephone address with the details:
    | Username | Country            | Code        | Number     | 
    | Alice    | FRANCE             | +33         |            | 
    | Bob      | Spain              | +34         |            | 
    | Charlie  | England            | +44         |            | 
    Then I am informed: "You have missed out some fields, please ensure they are filled in"