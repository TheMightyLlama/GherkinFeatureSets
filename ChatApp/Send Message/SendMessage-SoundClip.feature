Feature: Send Message - Record Sound Clip
    As a ChatApp user
    I want to send a contact a sound clip
    So that I can communicate with them faster than text

    Scenario: Record and send
        Given I have an account
        And I have a contact named: "Bob"
        When I record a clip
        And I send it to "Bob"
        Then I should be able to listen to it
        And "Bob" should be able to listen to it

    Scenario: Record and clip limit exceeded
        Given I have an account
        And I have a contact named: "Bob"
        When I record a clip
        And I attempt to record more than 1 minute of audio
        Then the clip should be sent immediately to "Bob"
        And I should be able to listen to it
        And "Bob" should be able to listen to it
