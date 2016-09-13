Feature: Connectivity - Network Unavailable
    As a ChatApp user
    I want to be informed when my network connection has dropped
    So that I know to check I am connected to the internet


    Scenario: All network options switched off
    	Given the following network options are switched on:
    	    | 3g    |
    	    | Wi-Fi |
	    When they are switched off
	    Then I should be informed that I'm not connected to the internet
	    And I should check my phone settings

    Scenario: Walk outside of range of data
    	Given the following network options are switched on:
    	    | 3g    |
    	    | Wi-Fi |
	    When I walk out of range of either
	    Then I should be informed that I'm not connected to the internet
	    And I should check my phone settings

    Scenario: Chat server unavailable
        Given I have logged onto the Chat Application
        When the server is unavailable
        Then I should be informed that the server is unavailable
        And I should retry in a few moments
