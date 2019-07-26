Feature: Register Feature

Scenario: User clicks on signup link
  Given the Signup page is opened
  When  user enters username as "illu1"
  And user enters firstname as "illu" 
  And user enters lastname as "lu"
  And user enters password as "pass123"
  And user enters confirm password as "pass123"
  And user clicks gender as "male"
  And user enters email as "illu@345.com"
  And user enters mobile number as 1234567890 
  And user enters dateof birth as "27/09/1900"
  And user enters address as "fkjvngfkjg"
  And user select security question 
  And user enters answer as "blr"
  And user will click on register
  Then user will be directed to login page
