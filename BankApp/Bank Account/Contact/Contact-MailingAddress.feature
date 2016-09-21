Feature: Manage my mailing address
  As a user
  I want to manage my mailing address
  So that I always receive physical mail at the correct address
  
  Background:
  Given the following users:
  |username| full name |
  | Alice | Alice Delaroche | 
  | Bob | Bob Esquivel | 
  | Charlie | Charlie Smith | 
  
  Scenario: Edit mailing address
    Given I am logged in as: <Username>
    And I have stated my mailing address as being in: <Country>
    When I edit my address with the details:
    | Username | Name            | Building Name        | Building Number | Street Name                 | Locality Name | Post Town | Post Code | Country |
    | Alice    | Alice Delaroche | RESIDENCE DES FLEURS | 8               | ALLEE DES LILAS             | PERNETY       | PARIS     | 75014     | FRANCE   |
    | Bob      | Bob Esquivel    |                      | 138             | Paseo de la Castellan Po 7  |               | Madrid    | 28014     | Spain    |
    | Charlie  | Charlie Smith   |                      | 18              | Glebe Place                 |               | London    | E1 5RZ    | England  |
    Then I am able to save it
    And correspondence goes to the <Country> address
  
  Scenario: Leave UK required fields empty
    Given I am logged in as: <username>
    And I have stated my malining addres as being in: <Country>
    When I edit my address with the details:
    | Username | Name            | Building Name        | Building Number | Street Name                 | Locality Name | Post Town | Post Code | Country |
    | Alice    |                 | RESIDENCE DES FLEURS |                 |                             |               |           |           | FRANCE  |
    Then I am informed: "You have missed out some fields, please ensure they are filled in"