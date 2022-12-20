Feature: My Account Test
  As a user I am on tutorialninja site and verify my account test
   Given I am on Home Page
@Sanity @Regression
  Scenario: verify User Should Navigate To Register Page Successfully
    When I click on My account Link
    And  I click on "Register" option
    Then I verify the text Rgister Account
@Smoke @Regression
  Scenario: verify User  Should Navigate  To LoginPage Successfully
    When I click on My account Link
    And I click on "Login" option
    And I verify the text returning customer
@Regression
  Scenario: verify That User Register Account Successfully
    When  I click on My account Link
    And I click on "Register" option
    And I filled Registration Form
    And I click On Continue
    And i verify message Your Account Has Been Created!
    And I click On Continue Tab
    And I click On My Account Tab
    And I click on "Logout" option
    And I verify text account logout
    And I click On Continue Field
@Regression
  Scenario: verify That User Should Login And Logout Successfully
    When I click on My account Link
    And I click on "Login" option
    And I Enter my login detail
  And i click on login
  And I click on My account Link
    And  I click on "Logout" option
  Then I verify the text Account logout