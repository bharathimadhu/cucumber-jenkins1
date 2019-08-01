Feature: New registration 


Scenario: Registration for testme application
Given user opens web browser and launches application
When user clicks the signup
When user enters username as "selvi"
When user enters firstname as "shiroh"
When user enters lastname as "sudha"
Then user enters password as "sudha"
Then user enters confirm password as "sudha"
And user enters gender as "female"
And user enters email as "sudhadass1997@gmail.com"
And user enters mobile number as "7398954811"
And user enters dob as "22/05/1995"
When user enters address as "chennaikancheepuram"
When user enters security question as "What is your Birth Place?"
When user enters answer as "chennai"
And user clicks on register button