package com.tutorialsninja.cucumber.steps;

import com.tutorialsninja.pages.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


import java.util.Collections;
import java.util.List;

public class DesktopsSteps {
    @When("^I Mouse hoover on desktop and click$")
    public void iMouseHooverOnDesktopAndClick() {
        new HomePage().mouseHoverOnDesktop();
    }

    @And("^I click  \"([^\"]*)\"$")
    public void iClick(String menu)  {
        new HomePage().selectmenu(menu);

    }
    @And("^I click on currency$")
    public void iClickOnCurrency() {
        new HomePage().clickOnCurrency();
    }

    @And("^I click on select currency pound$")
    public void iClickOnSelectCurrencyPound() {
        new HomePage().selectCurrencyPound();
    }

    @And("^I select sort by position click on Z to A$")
    public void iSelectSortByPositionClickOnZToA() {
        new DesktopsPage().clickonZtoA();
    }

    @Then("^I verify the product will arrange in descending order$")
    public void iVerifyTheProductWillArrangeInDescendingOrder() {
        DesktopsPage desktopsPage = new DesktopsPage();
        List<String> expText  = desktopsPage.verifyProductZToA();
        List<String> actText  = desktopsPage.verifyProductZToA();
        System.out.println("Expected list " + expText );
        Assert.assertEquals(Collections.singleton(actText),Collections.singleton(expText));
        System.out.println("Actual List " + actText);
    }

    @And("^I select sort by position click on A to Z$")
    public void iSelectSortByPositionClickOnAToZ() {
        new DesktopsPage().clickonAtoZ();
    }

    @And("^I select product HP LP$")
    public void iSelectProductHPLP() {
        new DesktopsPage().clickOnHpLaptop();
    }
    @And("^I verify the text HP LP laptop$")
    public void iVerifyTheTextHPLPLaptop()throws InterruptedException {
        Assert.assertEquals("HP LP3065",new ProductLP3065Page().verifyLaptopText());
        Thread.sleep(1000);
    }

    @And("^I verify the text HP LP(\\d+)$")
    public void iVerifyTheTextHPLP()throws InterruptedException {

       Assert.assertEquals("HP LP3065",new ProductLP3065Page().verifyLaptopText());
        Thread.sleep(1000);
    }
    @And("^I select delivary date$")
    public void iSelectDelivaryDate() {
        new ProductLP3065Page().pickUpDate();
    }



    @And("^I enter qty (\\d+)$")
    public void iEnterQty(String text) {
        new ProductLP3065Page().enterQuantityInToTab(" ");

    }

    @And("^I click on add to cart button$")
    public void iClickOnAddToCartButton()throws InterruptedException {
        Thread.sleep(1000);
        new ProductLP3065Page().clickOnAddToCart();
        Thread.sleep(1000);
    }



    @And("^I click on shopping cart link into success message$")
    public void iClickOnShoppingCartLinkIntoSuccessMessage()throws InterruptedException {
        Thread.sleep(1000);
        new ShoppingCartPage().clickOnShoppingcart();
        Thread.sleep(1000);
    }

    @And("^I verify the text Shopping Cart$")
    public void iVerifyTheTextShoppingCart()throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals("Shopping Cart  (1.00kg)",new ShoppingCartPage().verifyShoppingCartText());
        Thread.sleep(1000);
    }

    @And("^I verify the product name HP LP$")
    public void iVerifyTheProductNameHPLP() throws InterruptedException{
        Assert.assertEquals("HP LP3065",new ShoppingCartPage().verifyProductnameText());
        Thread.sleep(1000);
    }

    @And("^I verify delivary date$")
    public void iVerifyDelivaryDate() throws InterruptedException{
        Assert.assertEquals("Delivery Date: 2022-11-30",new ShoppingCartPage().verifyDeliverydateText());
        Thread.sleep(1000);
    }

    @And("^I verify model No$")
    public void iVerifyModelNo() {
        Assert.assertEquals("Product 21",new ShoppingCartPage().verifyModelNo());
    }

    @Then("^I verify the Total$")
    public void iVerifyTheTotal()throws InterruptedException {
        Assert.assertEquals("£74.73",new ShoppingCartPage().verifyTotal());
        Thread.sleep(1000);
    }






}
