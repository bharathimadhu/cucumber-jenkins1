Feature: Testme login functionality
Scenario Outline: Login with valid credentials
Given user opens testme application and clicks signin button
When user enters the "<username>" and "<password>"
And user clicks the login button

Examples:
|username|password|
|lalitha|password123|
