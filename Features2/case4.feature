Feature: Remove the product the cart

  Scenario: Relizing after removing the product from the cart option is not available
    Given testMe app homepage is open
    When user click on SignIn link
    And user provides "lalitha" as username
    And user provides "password123" as password
    And user click on Login button
    Then logIn page is displayed
    When user click on Search box
    And user enters "head" on search box to scroll down and select headphone
    And user clicks on Add to Cart button
    And user clicks on cart link
    Then cart page is displayed
    When User clicks on remove button
    Then Error message is displayed 