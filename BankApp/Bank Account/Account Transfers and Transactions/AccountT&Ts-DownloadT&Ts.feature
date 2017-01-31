Feature: Download Transfers and Transactions
  As a user
  I want to download any transers and transactions I have against my account
  So that I can perform calculations in a spreadsheet
  
  Background:
  Given the following user:
  |username| full name |
  | Bob | Bob Esquivel | 


  Scenario Outline: No Transactions or Transfers
    Given I am logged in as Bob
      And I have no transactions or transfers against my account
    When I want to download transactions or transfers against my account
    Then I am not able to perform a download


  Scenario Outline: Transactions and Transfers
    Given I am logged in as Bob
      And I have transactions or transfers against my account
    When I want to download transactions or transfers against my account
    Then I should be able to start a download
    And I should download a csv file of my transactions and transfers
