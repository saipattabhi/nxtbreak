Feature: Register into the TutorialNinja application

@register
Scenario: Register into the application with valid crendiatals
Given I navigate to the application
When I enter following details
|firstname      |udayramayya               |
|lastname       |boda                      |
|email          |saipattabhi58@gmail.com   |
|telephone      |12345                     |
|password       |Uday@123                  |
And I select on privacy policy
And I click on continue button
Then I sucessfully register into the application