package com.tutorialsninja.cucumber.steps;

import com.tutorialsninja.pages.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;

import java.util.Collections;
import java.util.List;

public class LaptopAndNoteBookSteps {
    @When("^I mouse hoover  Laptop and notebook tab and click$")
    public void iMouseHooverLaptopAndNotebookTabAndClick() {
        new HomePage().mouseHoverOnlaptopAndNoteBook();
    }

    @And("^I click on to \"([^\"]*)\"$")
    public void iClickOnTo(String menu) throws InterruptedException  {
        Thread.sleep(500);
        //new HomePage().selectmenu(menu);
        new HomePage().clickOnAllLaptop();

    }
    @And("^I click on currency field$")
    public void iClickOnCurrencyField() {
        new HomePage().clickOnCurrency();
    }
    @And("^I click on currency pound$")
    public void iClickOnCurrencyPound() {
        new HomePage().selectCurrencyPound();
    }


    @And("^I select sort by \"([^\"]*)\"$")
    public void iSelectSortBy(String text) throws InterruptedException {
        Thread.sleep(1000);
        new LaptopAndNoteBookPage().sortProductToHighLow(text);
    }


    @Then("^verify the product price will arrange in high to low$")
    public void verifyTheProductPriceWillArrangeInHighToLow() throws InterruptedException{
        Thread.sleep(1000);
        LaptopAndNoteBookPage laptopAndNoteBookPage = new LaptopAndNoteBookPage();
        List<Double> expText  = laptopAndNoteBookPage.verifyPriceHighToLow();
        List<Double> actText  = laptopAndNoteBookPage.verifyPriceHighToLow();
        System.out.println("Expected list " + expText );


       Assert.assertEquals(Collections.singleton(actText),Collections.singleton(expText));
        System.out.println("Actual List " + actText);
    }

    @And("^I select product macBook$")
    public void iSelectProductMacBook(

    ) {
        new LaptopAndNoteBookPage().clickOnMacBook();
    }



    @And("^I verify the text MacBook$")
    public void iVerifyTheTextMacBook() throws InterruptedException {
        Assert.assertEquals("MacBook",new ProductMacBookPage().verifyMacBookProduct());
        Thread.sleep(1000);

    }

    @And("^I click on Add to cart link$")
    public void iClickOnAddToCartLink() throws InterruptedException {
        new ProductMacBookPage().clickOnCart();
        Thread.sleep(1000);

    }

    @And("^I verify message sucess$")
    public void iVerifyMessageSucess() throws InterruptedException{
        Assert.assertEquals("Success: You have added MacBook to your shopping cart!\n×",new ProductMacBookPage().verifyMacBookTab());
        Thread.sleep(1000);
    }

    @And("^I click on shopping cart$")
    public void iClickOnShoppingCart()throws InterruptedException {
        new ProductMacBookPage().clickOnShoppingCart();
    }

/*    @And("^I verify text shopping cart$")
    public void iVerifyTextShoppingCart() {
    }*/

    @And("^I verify product name MacBook$")
    public void iVerifyProductNameMacBook() throws InterruptedException{
        Assert.assertEquals("MacBook",new ShoppingCartPage().verifyTextOfMacBook());
    }

    @And("^I change qty to \"([^\"]*)\"$")
    public void iChangeQtyTo(String qty)  {
        new ShoppingCartPage().clearQty(qty);

    }

    @And("^I click on Update tab$")
    public void iClickOnUpdateTab()throws InterruptedException {
        new ShoppingCartPage().clickOnUpdateButton();
        Thread.sleep(1000);
    }

    @And("^I verify the message Success: You have modified your shopping cart$")
    public void iVerifyTheMessageSuccessYouHaveModifiedYourShoppingCart()throws InterruptedException {
        Assert.assertTrue(new ShoppingCartPage().verifySuceesfullyUpdatecartMassage().contains("Success: You have modified your shopping cart!"));
        Thread.sleep(1000);
    }

    @And("^I verify the Total Amount$")
    public void iVerifyTheTotalAmount()throws InterruptedException {
        Assert.assertEquals("£737.45",new ShoppingCartPage().verifyPrice());
        Thread.sleep(1000);
    }

    @And("^I click on checkout button$")
    public void iClickOnCheckoutButton() throws InterruptedException{
        new ShoppingCartPage().clickOnCheckOut();
        Thread.sleep(1000);
    }

    @And("^I verify the text checkout$")
    public void iVerifyTheTextCheckout() throws InterruptedException{
        Assert.assertEquals("Checkout",new CheckoutPage().verifycheckoutTextOnPage());
        Thread.sleep(1000);
    }

    @And("^I verify the text new customer$")
    public void iVerifyTheTextNewCustomer() throws InterruptedException{
        Assert.assertEquals("New Customer",new CheckoutPage().verifyNewCustomerTab());
        Thread.sleep(1000);
    }

    @And("^I click on guest checkout button$")
    public void iClickOnGuestCheckoutButton() throws InterruptedException{
        new CheckoutPage().clickOnGuestCheckout();
        Thread.sleep(1000);
    }

    @And("^I click on continue$")
    public void iClickOnContinue()throws InterruptedException {
        new CheckoutPage().clickOnContinueTab();
        Thread.sleep(1000);

    }

    @And("^I field all mendotary field$")
    public void iFieldAllMendotaryField( ) {
        new CheckoutPage().enterFirstname("Jenna");
        new CheckoutPage().enterLastname("Munim");
        new CheckoutPage().enterEmail("Jennamun@gmail.com");
        new CheckoutPage().enterTelephone("0208564585");
        new CheckoutPage().enterAddress1("20.hanver lane");
        new CheckoutPage().enterCityName("London");
        new CheckoutPage().enterPostcode("LS2 4ZX");
        new CheckoutPage().enterCountryName("Switzerland");
        new CheckoutPage().enterRegionField("Bern");

    }

    @And("^I click on continue link$")
    public void iClickOnContinueLink() {
        new CheckoutPage().clickOnContinue();
    }
    @And("^I add comment about order \"([^\"]*)\"$")
    public void iAddCommentAboutOrder(String text)throws InterruptedException {
        new CheckoutPage().addCommentOnTextArea(text);
        Thread.sleep(1000);

    }



    @And("^I click on terms and condition check box$")
    public void iClickOnTermsAndConditionCheckBox()throws InterruptedException {
        new CheckoutPage().clickOnTermsAndCondition();
        Thread.sleep(1000);

    }

    @And("^I click on continue button$")
    public void iClickOnContinueButton() throws InterruptedException{
        new CheckoutPage().clickOnContinueField();
        Thread.sleep(1000);

    }

    @Then("^I verify the message warning payment required$")
    public void iVerifyTheMessageWarningPaymentRequired() {
        Assert.assertEquals("Warning: Payment method required!" + "\n×",new CheckoutPage().verifyWarningSign());
    }


}
