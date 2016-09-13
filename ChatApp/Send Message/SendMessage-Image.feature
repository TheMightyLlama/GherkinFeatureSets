Feature: Send Message - Image
    As a ChatApp user
    I want to send a contact an image
    So that they know what I have seen

    Scenario: File from Camera
        Given I have an account
        And I have a contact named: "Bob"
        And I take a picture with my device camera
        When I select it
        And I send it to "Bob"
        Then I should be able to see it 
        And "Bob" should be able to see it

    Scenario: File from Gallery
        Given I have an account
        And I have a contact named: "Bob"
        And I select a picture from my device gallery
        When I select it
        And I send it to "Bob"
        Then I should be able to see it 
        And "Bob" should be able to see it

    Scenario: File from File System
        Given I have an account
        And I have a contact named: "Bob"
        And I select a picture from my device file system
        And it is an image type
        When I select it
        And I send it to "Bob"
        Then I should be able to see it 
        And "Bob" should be able to see it

    Scenario: Incorrect File Type
        Given I have an account
        And I have a contact named: "Bob"
        And I select a picture from my device file system
        And it is not an image type
        When I select it
        And I send it to "Bob"
        Then I should be able to see it 
        And "Bob" should be able to see it

    Scenario: File size limit exceeded
        Given I have an account
        And I have a contact named: "Bob"
        And I select a picture from my device file system
        And it is an image type
        And it is larger than 2MB
        When I select it
        And I send it to "Bob"
        Then I should be informed that it is too large
        And that it will be scaled to below 2MB
        And I should be able to see it
        And "Bob" should be able to see it
