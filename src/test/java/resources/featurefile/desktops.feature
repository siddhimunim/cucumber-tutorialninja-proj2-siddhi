Feature: Desktops Test
  As a user I verifying Desktops page Test
  Given I am on home page
@Sanity @Regression
  Scenario: verify Product Arrange In AlphaBatical Order
    When I Mouse hoover on desktop and click
    And I click  "Show All Desktops"
    And I select sort by position click on Z to A
    Then I verify the product will arrange in descending order
@Smoke @Regression
  Scenario: verify Product Added To ShoppingCart SuccessFully
    When I Mouse hoover on desktop and click
    And I click  "Show All Desktops"
  And I click on currency
  And I click on select currency pound
    And I select sort by position click on A to Z
    And I select product HP LP
    And I verify the text HP LP laptop
    And I select delivary date
    And I enter qty 2
    And I click on add to cart button
    And I click on shopping cart link into success message
    And I verify the text Shopping Cart
    And I verify the product name HP LP
    And I verify delivary date
    And I verify model No
    Then I verify the Total





