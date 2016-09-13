Feature: Send Message - Video
    As a ChatApp user
    I want to send a contact a short video
    So that they can replay a moment from my day

    Scenario: Record and send
        Given I have an account
        And I have a contact named: "Bob"
        When I record a video clip
        And I send it to "Bob"
        Then I should be able to view a thumbnail of the video clip
        And "Bob" should be able to view the video clip

    Scenario: Record and send size limit hit
        Given I have an account
        And I have a contact named: "Bob"
        And I record a video clip
        When it is over 2MB in size
        Then the clip should be sent immediately to "Bob"
        And I should be able to view a thumbnail of the video clip
        And "Bob" should be able to view the video clip

    Scenario: Share from Camera
        Given I have an account
        And I have a contact named: "Bob"
        When I select a video clip from my device gallery
        And I send it to "Bob"
        Then I should be able to view a thumbnail of the video clip
        And "Bob" should be able to view the video clip

    Scenario: Share from Gallery Clip Size limit hit
        Given I have an account
        And I have a contact named: "Bob"
        And I select a video clip from my device gallery
        When it is over 2MB in size
        Then the clip should be sent immediately to "Bob"
        And I should be able to view a thumbnail of the video clip
        And "Bob" should be able to view the video clip