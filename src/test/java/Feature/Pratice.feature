Feature: Login to the application

@smoke
Scenario Outline: Login to the application with valid crendiatals

Given I navigate to the application URL
When I enter username as <username> and password as <password> into the fields
And I clicks on the login button
Then User should sucessfully see the <expectedstatus> after login

Examples: 
|username               |password    |expectedstatus|
|sairam                 |Sai@2255    |failure       |
|udaysesha              |ram@123     |failure       |
|saipattabhi18@gmail.com|Sai@336699  |success       |
