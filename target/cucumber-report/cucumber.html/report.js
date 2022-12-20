$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("desktops.feature");
formatter.feature({
  "line": 1,
  "name": "Desktops Test",
  "description": "As a user I verifying Desktops page Test\r\nGiven I am on home page",
  "id": "desktops-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5488452500,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "verify Product Arrange In AlphaBatical Order",
  "description": "",
  "id": "desktops-test;verify-product-arrange-in-alphabatical-order",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Sanity"
    },
    {
      "line": 4,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I Mouse hoover on desktop and click",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click  \"Show All Desktops\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I select sort by position click on Z to A",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I verify the product will arrange in descending order",
  "keyword": "Then "
});
formatter.match({
  "location": "DesktopsSteps.iMouseHooverOnDesktopAndClick()"
});
formatter.result({
  "duration": 427502300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Show All Desktops",
      "offset": 10
    }
  ],
  "location": "DesktopsSteps.iClick(String)"
});
formatter.result({
  "duration": 823807100,
  "status": "passed"
});
formatter.match({
  "location": "DesktopsSteps.iSelectSortByPositionClickOnZToA()"
});
formatter.result({
  "duration": 1134513500,
  "status": "passed"
});
formatter.match({
  "location": "DesktopsSteps.iVerifyTheProductWillArrangeInDescendingOrder()"
});
formatter.result({
  "duration": 806405400,
  "status": "passed"
});
formatter.after({
  "duration": 699315100,
  "status": "passed"
});
formatter.before({
  "duration": 3208414200,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "verify Product Added To ShoppingCart SuccessFully",
  "description": "",
  "id": "desktops-test;verify-product-added-to-shoppingcart-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@Smoke"
    },
    {
      "line": 10,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "I Mouse hoover on desktop and click",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I click  \"Show All Desktops\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on currency",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I click on select currency pound",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I select sort by position click on A to Z",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I select product HP LP",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I verify the text HP LP laptop",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I select delivary date",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I enter qty 2",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I click on add to cart button",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I click on shopping cart link into success message",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I verify the text Shopping Cart",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I verify the product name HP LP",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I verify delivary date",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I verify model No",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I verify the Total",
  "keyword": "Then "
});
formatter.match({
  "location": "DesktopsSteps.iMouseHooverOnDesktopAndClick()"
});
formatter.result({
  "duration": 193082800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Show All Desktops",
      "offset": 10
    }
  ],
  "location": "DesktopsSteps.iClick(String)"
});
formatter.result({
  "duration": 839975900,
  "status": "passed"
});
formatter.match({
  "location": "DesktopsSteps.iClickOnCurrency()"
});
formatter.result({
  "duration": 169490100,
  "status": "passed"
});
formatter.match({
  "location": "DesktopsSteps.iClickOnSelectCurrencyPound()"
});
formatter.result({
  "duration": 580335200,
  "status": "passed"
});
formatter.match({
  "location": "DesktopsSteps.iSelectSortByPositionClickOnAToZ()"
});
formatter.result({
  "duration": 482289500,
  "status": "passed"
});
formatter.match({
  "location": "DesktopsSteps.iSelectProductHPLP()"
});
formatter.result({
  "duration": 1421124400,
  "status": "passed"
});
formatter.match({
  "location": "DesktopsSteps.iVerifyTheTextHPLPLaptop()"
});
formatter.result({
  "duration": 1059210500,
  "status": "passed"
});
formatter.match({
  "location": "DesktopsSteps.iSelectDelivaryDate()"
});
formatter.result({
  "duration": 8938177900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 12
    }
  ],
  "location": "DesktopsSteps.iEnterQty(String)"
});
formatter.result({
  "duration": 92828900,
  "status": "passed"
});
formatter.match({
  "location": "DesktopsSteps.iClickOnAddToCartButton()"
});
formatter.result({
  "duration": 2168247300,
  "status": "passed"
});
formatter.match({
  "location": "DesktopsSteps.iClickOnShoppingCartLinkIntoSuccessMessage()"
});
formatter.result({
  "duration": 2507355600,
  "status": "passed"
});
formatter.match({
  "location": "DesktopsSteps.iVerifyTheTextShoppingCart()"
});
formatter.result({
  "duration": 2046707100,
  "status": "passed"
});
formatter.match({
  "location": "DesktopsSteps.iVerifyTheProductNameHPLP()"
});
formatter.result({
  "duration": 1033332700,
  "status": "passed"
});
formatter.match({
  "location": "DesktopsSteps.iVerifyDelivaryDate()"
});
formatter.result({
  "duration": 1040215500,
  "status": "passed"
});
formatter.match({
  "location": "DesktopsSteps.iVerifyModelNo()"
});
formatter.result({
  "duration": 32270200,
  "status": "passed"
});
formatter.match({
  "location": "DesktopsSteps.iVerifyTheTotal()"
});
formatter.result({
  "duration": 1036149600,
  "status": "passed"
});
formatter.after({
  "duration": 734255700,
  "status": "passed"
});
formatter.uri("laptopsandnotebooks.feature");
formatter.feature({
  "line": 1,
  "name": "Laptopsandnotebooks Test",
  "description": "As a user I verify laptop and note book test\r\nGiven I am on Home page",
  "id": "laptopsandnotebooks-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3417795700,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "verify Products Price Display High To Low Successfully",
  "description": "",
  "id": "laptopsandnotebooks-test;verify-products-price-display-high-to-low-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Sanity"
    },
    {
      "line": 4,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I mouse hoover  Laptop and notebook tab and click",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click on to \"Show All  Laptops \u0026 Notebooks\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I select sort by \"Price (High \u003e Low)\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "verify the product price will arrange in high to low",
  "keyword": "Then "
});
formatter.match({
  "location": "LaptopAndNoteBookSteps.iMouseHooverLaptopAndNotebookTabAndClick()"
});
formatter.result({
  "duration": 218421500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Show All  Laptops \u0026 Notebooks",
      "offset": 15
    }
  ],
  "location": "LaptopAndNoteBookSteps.iClickOnTo(String)"
});
formatter.result({
  "duration": 1158374200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Price (High \u003e Low)",
      "offset": 18
    }
  ],
  "location": "LaptopAndNoteBookSteps.iSelectSortBy(String)"
});
formatter.result({
  "duration": 1541861100,
  "status": "passed"
});
formatter.match({
  "location": "LaptopAndNoteBookSteps.verifyTheProductPriceWillArrangeInHighToLow()"
});
formatter.result({
  "duration": 1493356100,
  "status": "passed"
});
formatter.after({
  "duration": 695211800,
  "status": "passed"
});
formatter.before({
  "duration": 3175688100,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "verify That User Place Order Successfully",
  "description": "",
  "id": "laptopsandnotebooks-test;verify-that-user-place-order-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@Smoke"
    },
    {
      "line": 11,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "I mouse hoover  Laptop and notebook tab and click",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I click on to \"Show All  Laptops \u0026 Notebooks\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I click on currency field",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I click on currency pound",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I select sort by \"Price (High \u003e Low)\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I select product macBook",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I verify the text MacBook",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I click on Add to cart link",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I verify message sucess",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I click on shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I verify product name MacBook",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I change qty to \"2\"",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I click on Update tab",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I verify the message Success: You have modified your shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I verify the Total Amount",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I click on checkout button",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I verify the text checkout",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I verify the text new customer",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I click on guest checkout button",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I click on continue",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I field all mendotary field",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I click on continue link",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "I add comment about order \"Please delivary onTime\"",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "I click on terms and condition check box",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "I click on continue button",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "I verify the message warning payment required",
  "keyword": "Then "
});
formatter.match({
  "location": "LaptopAndNoteBookSteps.iMouseHooverLaptopAndNotebookTabAndClick()"
});
formatter.result({
  "duration": 184481200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Show All  Laptops \u0026 Notebooks",
      "offset": 15
    }
  ],
  "location": "LaptopAndNoteBookSteps.iClickOnTo(String)"
});
formatter.result({
  "duration": 1149210500,
  "status": "passed"
});
formatter.match({
  "location": "LaptopAndNoteBookSteps.iClickOnCurrencyField()"
});
formatter.result({
  "duration": 210567000,
  "status": "passed"
});
formatter.match({
  "location": "LaptopAndNoteBookSteps.iClickOnCurrencyPound()"
});
formatter.result({
  "duration": 500347600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Price (High \u003e Low)",
      "offset": 18
    }
  ],
  "location": "LaptopAndNoteBookSteps.iSelectSortBy(String)"
});
formatter.result({
  "duration": 1558042200,
  "status": "passed"
});
formatter.match({
  "location": "LaptopAndNoteBookSteps.iSelectProductMacBook()"
});
formatter.result({
  "duration": 1413582200,
  "status": "passed"
});
formatter.match({
  "location": "LaptopAndNoteBookSteps.iVerifyTheTextMacBook()"
});
formatter.result({
  "duration": 1047558000,
  "status": "passed"
});
formatter.match({
  "location": "LaptopAndNoteBookSteps.iClickOnAddToCartLink()"
});
formatter.result({
  "duration": 1067975800,
  "status": "passed"
});
formatter.match({
  "location": "LaptopAndNoteBookSteps.iVerifyMessageSucess()"
});
formatter.result({
  "duration": 1036990500,
  "status": "passed"
});
formatter.match({
  "location": "LaptopAndNoteBookSteps.iClickOnShoppingCart()"
});
formatter.result({
  "duration": 407509700,
  "status": "passed"
});
formatter.match({
  "location": "LaptopAndNoteBookSteps.iVerifyProductNameMacBook()"
});
formatter.result({
  "duration": 49136700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 17
    }
  ],
  "location": "LaptopAndNoteBookSteps.iChangeQtyTo(String)"
});
formatter.result({
  "duration": 132122600,
  "status": "passed"
});
formatter.match({
  "location": "LaptopAndNoteBookSteps.iClickOnUpdateTab()"
});
formatter.result({
  "duration": 1574011600,
  "status": "passed"
});
formatter.match({
  "location": "LaptopAndNoteBookSteps.iVerifyTheMessageSuccessYouHaveModifiedYourShoppingCart()"
});
formatter.result({
  "duration": 1042430100,
  "status": "passed"
});
formatter.match({
  "location": "LaptopAndNoteBookSteps.iVerifyTheTotalAmount()"
});
formatter.result({
  "duration": 1035874200,
  "status": "passed"
});
formatter.match({
  "location": "LaptopAndNoteBookSteps.iClickOnCheckoutButton()"
});
formatter.result({
  "duration": 1453594900,
  "status": "passed"
});
formatter.match({
  "location": "LaptopAndNoteBookSteps.iVerifyTheTextCheckout()"
});
formatter.result({
  "duration": 1051154500,
  "status": "passed"
});
formatter.match({
  "location": "LaptopAndNoteBookSteps.iVerifyTheTextNewCustomer()"
});
formatter.result({
  "duration": 1042529100,
  "status": "passed"
});
formatter.match({
  "location": "LaptopAndNoteBookSteps.iClickOnGuestCheckoutButton()"
});
formatter.result({
  "duration": 1068386900,
  "status": "passed"
});
formatter.match({
  "location": "LaptopAndNoteBookSteps.iClickOnContinue()"
});
formatter.result({
  "duration": 1070925800,
  "status": "passed"
});
formatter.match({
  "location": "LaptopAndNoteBookSteps.iFieldAllMendotaryField()"
});
formatter.result({
  "duration": 1139528300,
  "status": "passed"
});
formatter.match({
  "location": "LaptopAndNoteBookSteps.iClickOnContinueLink()"
});
formatter.result({
  "duration": 74520900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Please delivary onTime",
      "offset": 27
    }
  ],
  "location": "LaptopAndNoteBookSteps.iAddCommentAboutOrder(String)"
});
formatter.result({
  "duration": 1492919400,
  "status": "passed"
});
formatter.match({
  "location": "LaptopAndNoteBookSteps.iClickOnTermsAndConditionCheckBox()"
});
formatter.result({
  "duration": 1092946600,
  "status": "passed"
});
formatter.match({
  "location": "LaptopAndNoteBookSteps.iClickOnContinueButton()"
});
formatter.result({
  "duration": 1083104300,
  "status": "passed"
});
formatter.match({
  "location": "LaptopAndNoteBookSteps.iVerifyTheMessageWarningPaymentRequired()"
});
formatter.result({
  "duration": 36426000,
  "status": "passed"
});
formatter.after({
  "duration": 739173200,
  "status": "passed"
});
formatter.uri("myaccount.feature");
formatter.feature({
  "line": 1,
  "name": "My Account Test",
  "description": "As a user I am on tutorialninja site and verify my account test\r\n Given I am on Home Page",
  "id": "my-account-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3299539900,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "verify User Should Navigate To Register Page Successfully",
  "description": "",
  "id": "my-account-test;verify-user-should-navigate-to-register-page-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Sanity"
    },
    {
      "line": 4,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I click on My account Link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click on \"Register\" option",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I verify the text Rgister Account",
  "keyword": "Then "
});
formatter.match({
  "location": "MyAccountSteps.iClickOnMyAccountLink()"
});
formatter.result({
  "duration": 205708300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Register",
      "offset": 12
    }
  ],
  "location": "MyAccountSteps.iClickOnOption(String)"
});
formatter.result({
  "duration": 627835100,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountSteps.iVerifyTheTextRgisterAccount()"
});
formatter.result({
  "duration": 73063300,
  "status": "passed"
});
formatter.after({
  "duration": 715732700,
  "status": "passed"
});
formatter.before({
  "duration": 3124523100,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "verify User  Should Navigate  To LoginPage Successfully",
  "description": "",
  "id": "my-account-test;verify-user--should-navigate--to-loginpage-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@Smoke"
    },
    {
      "line": 9,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "I click on My account Link",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I click on \"Login\" option",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I verify the text returning customer",
  "keyword": "And "
});
formatter.match({
  "location": "MyAccountSteps.iClickOnMyAccountLink()"
});
formatter.result({
  "duration": 234389100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login",
      "offset": 12
    }
  ],
  "location": "MyAccountSteps.iClickOnOption(String)"
});
formatter.result({
  "duration": 401559600,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountSteps.iVerifyTheTextReturningCustomer()"
});
formatter.result({
  "duration": 53022700,
  "status": "passed"
});
formatter.after({
  "duration": 715602100,
  "status": "passed"
});
formatter.before({
  "duration": 3227755600,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "verify That User Register Account Successfully",
  "description": "",
  "id": "my-account-test;verify-that-user-register-account-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "I click on My account Link",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I click on \"Register\" option",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I filled Registration Form",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I click On Continue",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "i verify message Your Account Has Been Created!",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I click On Continue Tab",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I click On My Account Tab",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I click on \"Logout\" option",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I verify text account logout",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I click On Continue Field",
  "keyword": "And "
});
formatter.match({
  "location": "MyAccountSteps.iClickOnMyAccountLink()"
});
formatter.result({
  "duration": 214784400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Register",
      "offset": 12
    }
  ],
  "location": "MyAccountSteps.iClickOnOption(String)"
});
formatter.result({
  "duration": 667135400,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountSteps.iFilledRegistrationForm()"
});
formatter.result({
  "duration": 713453500,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountSteps.iClickOnContinue()"
});
formatter.result({
  "duration": 533849100,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountSteps.iVerifyMessageYourAccountHasBeenCreated()"
});
formatter.result({
  "duration": 45596700,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountSteps.iClickOnContinueTab()"
});
formatter.result({
  "duration": 331595900,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountSteps.iClickOnMyAccountTab()"
});
formatter.result({
  "duration": 158932900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Logout",
      "offset": 12
    }
  ],
  "location": "MyAccountSteps.iClickOnOption(String)"
});
formatter.result({
  "duration": 747617500,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountSteps.iVerifyTextAccountLogout()"
});
formatter.result({
  "duration": 48313300,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountSteps.iClickOnContinueField()"
});
formatter.result({
  "duration": 400074300,
  "status": "passed"
});
formatter.after({
  "duration": 761707700,
  "status": "passed"
});
formatter.before({
  "duration": 4064756600,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "verify That User Should Login And Logout Successfully",
  "description": "",
  "id": "my-account-test;verify-that-user-should-login-and-logout-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 26,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 28,
  "name": "I click on My account Link",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "I click on \"Login\" option",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I Enter my login detail",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "i click on login",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I click on My account Link",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I click on \"Logout\" option",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I verify the text Account logout",
  "keyword": "Then "
});
formatter.match({
  "location": "MyAccountSteps.iClickOnMyAccountLink()"
});
formatter.result({
  "duration": 156596000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login",
      "offset": 12
    }
  ],
  "location": "MyAccountSteps.iClickOnOption(String)"
});
formatter.result({
  "duration": 427533500,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountSteps.iEnterMyLoginDetail()"
});
formatter.result({
  "duration": 239023000,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountSteps.iClickOnLogin()"
});
formatter.result({
  "duration": 594055900,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountSteps.iClickOnMyAccountLink()"
});
formatter.result({
  "duration": 166562000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Logout",
      "offset": 12
    }
  ],
  "location": "MyAccountSteps.iClickOnOption(String)"
});
formatter.result({
  "duration": 673305800,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountSteps.iVerifyTheTextAccountLogout()"
});
formatter.result({
  "duration": 48195700,
  "status": "passed"
});
formatter.after({
  "duration": 746171500,
  "status": "passed"
});
formatter.uri("topmenu.feature");
formatter.feature({
  "line": 1,
  "name": "TopMenu Test",
  "description": "As a user I varify top menu list of tutorailninja site\r\nGiven I am on main page",
  "id": "topmenu-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3079322500,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "verify User Should Navigate To Desktops Page Successfully",
  "description": "",
  "id": "topmenu-test;verify-user-should-navigate-to-desktops-page-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@Sanity"
    },
    {
      "line": 5,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I mouse hover on desktop tab and click",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I click on \"Show All Desktops\" tab",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I verify the text desktops",
  "keyword": "Then "
});
formatter.match({
  "location": "TopMenuSteps.iMouseHoverOnDesktopTabAndClick()"
});
formatter.result({
  "duration": 205012500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Show All Desktops",
      "offset": 12
    }
  ],
  "location": "TopMenuSteps.iClickOnTab(String)"
});
formatter.result({
  "duration": 862565100,
  "status": "passed"
});
formatter.match({
  "location": "TopMenuSteps.iVerifyTheTextDesktops()"
});
formatter.result({
  "duration": 34351300,
  "status": "passed"
});
formatter.after({
  "duration": 679971100,
  "status": "passed"
});
formatter.before({
  "duration": 3085058200,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "verify User Should Navigate To LaptopsAndNotebooksPage Successfully",
  "description": "",
  "id": "topmenu-test;verify-user-should-navigate-to-laptopsandnotebookspage-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@Smoke"
    },
    {
      "line": 12,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "I mouse hoover on Laptop and notebook tab and click",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I click  \"Show all Laptop and Notebooks\" tab",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I verify the text Laptops \u0026 Notebooks",
  "keyword": "Then "
});
formatter.match({
  "location": "TopMenuSteps.iMouseHooverOnLaptopAndNotebookTabAndClick()"
});
formatter.result({
  "duration": 699205200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Show all Laptop and Notebooks",
      "offset": 10
    }
  ],
  "location": "TopMenuSteps.iClickTab(String)"
});
formatter.result({
  "duration": 647528000,
  "status": "passed"
});
formatter.match({
  "location": "TopMenuSteps.iVerifyTheTextLaptopsNotebooks()"
});
formatter.result({
  "duration": 51660200,
  "status": "passed"
});
formatter.after({
  "duration": 743898500,
  "status": "passed"
});
formatter.before({
  "duration": 3448889800,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "verify User Should Navigate To ComponentsPage Successfully",
  "description": "",
  "id": "topmenu-test;verify-user-should-navigate-to-componentspage-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "I mouse hoover on components tab and link",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "I click on \"Show All Components\"",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I verify the text  Components",
  "keyword": "Then "
});
formatter.match({
  "location": "TopMenuSteps.iMouseHooverOnComponentsTabAndLink()"
});
formatter.result({
  "duration": 317984600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Show All Components",
      "offset": 12
    }
  ],
  "location": "TopMenuSteps.iClickOn(String)"
});
formatter.result({
  "duration": 20651858000,
  "status": "passed"
});
formatter.match({
  "location": "TopMenuSteps.iVerifyTheTextComponents()"
});
formatter.result({
  "duration": 43139100,
  "status": "passed"
});
formatter.after({
  "duration": 692998600,
  "status": "passed"
});
});