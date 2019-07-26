Feature: Purchase from testme app
  Scenario: SignIn into TestMe app and search product to purchase
    Given TestMe app homepage is open
    When User click on SignIn link
    And User provides "lalitha" as username
    And User provides "password123" as password
    And User clicks on Login button
    Then LogIn page is displayed
    When User click on Search box
    And User enters "head" on search box to scroll down and select headphone
    And User clicks on Add to Cart button
    And User clicks on cart link
    Then Cart page is displayed
    When User clicks on Checkout button
    And User enters Shipping Address as "Bengaluru"
    And User clicks on Proceed to Pay button
    Then Payment page is displayed
    When User selects Bank in Net Banking
    And User clicks on Continue button
    And User enters Username as "123456"
    And User enters Passwword as "Pass@456"
    And User clicks on LOGIN button
    And User enters Transaction Password as "Trans@456"
    And User clicks PAYNOW button
    Then Order details page is displayed

