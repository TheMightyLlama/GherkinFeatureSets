Feature: Request Cards
  As a user
  I want to request a new card against my account
  So that I can use the card for purchases against my account
  
  Background:
  Given the following user:
  |username| full name |
  | Bob | Bob Esquivel | 

  Scenario: No Cards
    Given I am logged in as Bob
    And I have not requested any cards against my account
    When I request a new card
    Then I should be informed: "You will receive your card in the post shortly."
    And I should be able to see my cards number
    And I should be able to see my cards expiry date
    And I should be able to see my cards status


  Scenario: Cards in use
    Given I am logged in as Bob
    And I have requested cards against my account
    When I request a new card
    Then I should be asked: "Your existing card will be automatically cancelled. Do you wish to proceed?"
    And I should be informed: "You will receive your card in the post shortly."
    And I should be able to see my cards number
    And I should be able to see my cards expiry date
    And I should be able to see my cards status

