Feature: View Cards
  As a user
  I want to view any cards I have against my account
  So that I can cancel them if necessary
  
  Background:
  Given the following user:
  |username| full name |
  | Bob | Bob Esquivel | 

  Scenario: No Cards
    Given I am logged in as Bob
    And I have not requested any cards against my account
    When I view my active cards
    Then I should be informed: "You have not yet requested any cards"


  Scenario: Cards in use
    Given I am logged in as Bob
    And I have requested cards against my account
    When I view my active cards
    Then I should be able to see the following cards:
    | Card Number | Name on Card | Expiry Date | Status | 
    | 12345678901 | Bob Esquivel | 11/09/2019  | Active | 
    | 12345678902 | Bob Esquivel | 11/09/2020  | Active | 

  Scenario: Cancelled Cards
    Given I am logged in as Bob
    And I have requested cards against my account
    And I have cancelled the card: 12345678901
    When I view my cards
    Then I should be able to see the following cards:
    | Card Number | Name on Card | Expiry Date | Status    |
    | 12345678901 | Bob Esquivel | 11/09/2019  | Cancelled |
    | 12345678902 | Bob Esquivel | 11/09/2020  | Active    |

  Scenario: Expired Cards
    Given I am logged in as Bob
    And I have requested cards against my account
    And todays date is: 11/09/2020
    When I view my cards
    Then I should be able to see the following cards:
    | Card Number | Name on Card | Expiry Date | Status    |
    | 12345678901 | Bob Esquivel | 11/09/2019  | Cancelled |
    | 12345678902 | Bob Esquivel | 11/09/2020  | Expired   |

  