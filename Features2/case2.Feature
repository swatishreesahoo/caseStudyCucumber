 Feature: Login Feature
 
Scenario Outline:  User enters Username and password
Given the login page is opened
 And User enters "<username>" and "<password>"
  And user clicks on Login button
  Then user is directed to home page
  
 Examples:
   | username | password    |
   | lalitha  | password123 |
   | admin    | password456 | 