Feature: Register for Online Account
  As a user
  I want to register online
  So that I can perform account actions online
  
  Scenario: Successful Registration
    Given I have an account
    And I have made a request for online banking
    And I have received a confirmation code by post
    And I have received a one time password by post
    When I attempt to register for online banking
    And I use the confirmation code: "123456789"
    And I use the password: "blahblah55"
    Then I should be informed: "Account setup has been successful"

  Scenario: Incorrect confirmation code
    Given I have an account
    And I have made a request for online banking
    And I have received a confirmation code by post
    And I have received one time password by post
    When I attempt to register for online banking
    And I use: <bad confirmation code>
    And I use: <one time password>
    Then I should be informed: "The confirmation code cannot be validated please check it and try again"

    
    Examples:
    | <confirmation code> | <one time password> |
    | abcdefghi           | blahblah55          |
    | qwertyuio           | blahblah55          |

    
  Scenario Outline: Mismatched account password
    Given I have an account
    And I have made a request for online banking
    And I have received a confirmation code by post
    And I have received a one time password by post
    When I attempt to register for online banking
    And I use the confirmation code: "123456789"
    And I use the password: "blahblah55"
    And I use: <account password>
    And I use: <account password confirmation>
    Then I am informed: "Your passwords do not match. Please check them and try again"

    Examples:
    | <account password>  | <account password confirmation> |
    | bar.foo             | foo.bar                         |

    
  Scenario: Mismatched actions password
    Given I have an account
    And I have made a request for online banking
    And I have received by post: <confirmation code>
    And I have received by post: <one time password>
    When I attempt to register for online banking
    And I use the confirmation code: "123456789"
    And I use the password: "blahblah55"
    And I use: <account actions password>
    And I use: <account actions password confirmation>
    Then I am informed: "Your passwords do not match. Please check them and try again"
    
    Examples:
    | <account actions password>  | <account actions password confirmation> |
    | bar.foo                     | foo.bar                                 |