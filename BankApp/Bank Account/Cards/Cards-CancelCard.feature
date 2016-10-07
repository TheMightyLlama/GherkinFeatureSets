Feature: Cancel Cards
  As a user
  I want to cancel an existing card against my account
  So that I can no longer use the card for purchases against my account
  
  Background:
  Given the following user:
  |username| full name |
  | Bob | Bob Esquivel | 

  Scenario: Card in use
    Given I am logged in as Bob
    And I have requested a cards against my account
    When I cancel the card
    Then I should be informed: "Your card has been cancelled, and it will no longer be possible to use it"
    And I should be able to see my cards number
    And I should be able to see my cards expiry date
    And I should be able to see my cards status has been set to "Cancelled"