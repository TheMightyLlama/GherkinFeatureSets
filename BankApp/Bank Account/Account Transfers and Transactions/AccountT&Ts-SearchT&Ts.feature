Feature: Search Transfers and Transactions
  As a user
  I want to search any transers and transactions I have against my account
  So that I can confirm how much I have transferred to any given recipient
  
  Background:
  Given the following user:
  |username| full name |
  | Bob | Bob Esquivel | 
  And the following transactions:
  | type   | value | balance|
  | BGC    | 50    | 1050   |  
  | C/P    | -50   | 950    |  
  | CHG    | -3    | 997    |    
  | CHQ    | -50   | 950    |  
  | COR    | 2     | 1002   |  
  | CR     | -25   | 975    |  
  | CSH    | -20   | 980    |  
  | CW     | -20   | 980    |  
  | D/D    | -325  | 675    |  
  | DIV    | 100   | 1100   |  
  | DR     | -350  | 650    |  
  | EUR    | 100   | 1100   |  
  | F/FLOW | 100   | 1100   |  
  | FPI    | 200   | 1200   |  
  | FPO    | 300   | 1300   |  
  | INT    | 3     | 1003   |  
  | OTH    | -25   | 975    |  
  | P/C    | 75    | 1075   |  
  | S/O    | -50   | 950    |  
  | SAL    | 1000  | 2000   |  
  | TFR    | 100   | 1100   |  

  Scenario Outline: Transactions and Transfers no Search Results
    Given I am logged in as Bob
      And my balance is £1000.00
    When I search for <criteria> with <searchvalue>
    Then I am informed: "There are no results that match your criteria".

  #Transaction types obtained from here: https://www.lloydsbankcommercial.com/lloydslinkonlinesupport/resources-and-faqs/faqs/What-do-the-statement-transaction-codes-mean/
  Scenario Outline: Transactions and Transfers Search Results
    Given I am logged in as Bob
      And my balance is £1000.00
    When I search for <criteria> with <searchvalue>
    Then I should be able to see ID of the transaction, the <type>, the <value> and <balance>
    Examples:
    | criteria | searchvalue | type   | value | balance |
    | type     | BGC         | BGC    | 50    | 1050    |  
    | type     | C/P         | C/P    | -50   | 950     |  
    | type     | CHG         | CHG    | -3    | 997     |    
    | value    | -20         | CSH    | -20   | 980     |  
    | value    | -20         | CW     | -20   | 980     |  
