Feature: Laptopsandnotebooks Test
  As a user I verify laptop and note book test
  Given I am on Home page
@Sanity @Regression
  Scenario: verify Products Price Display High To Low Successfully
    When I mouse hoover  Laptop and notebook tab and click
    And I click on to "Show All  Laptops & Notebooks"
    And I select sort by "Price (High > Low)"
    Then verify the product price will arrange in high to low

  @Smoke @Regression
  Scenario:  verify That User Place Order Successfully
    When I mouse hoover  Laptop and notebook tab and click
    And I click on to "Show All  Laptops & Notebooks"
    And I click on currency field
    And I click on currency pound
    And I select sort by "Price (High > Low)"
    And I select product macBook
    And I verify the text MacBook
    And I click on Add to cart link
    And I verify message sucess
    And I click on shopping cart
    And I verify product name MacBook
    And I change qty to "2"
    And I click on Update tab
    And I verify the message Success: You have modified your shopping cart
    And I verify the Total Amount
    And I click on checkout button
    And I verify the text checkout
    And I verify the text new customer
    And I click on guest checkout button
    And I click on continue
    And I field all mendotary field
    And I click on continue link
    And I add comment about order "Please delivary onTime"
    And I click on terms and condition check box
    And I click on continue button
    Then I verify the message warning payment required



