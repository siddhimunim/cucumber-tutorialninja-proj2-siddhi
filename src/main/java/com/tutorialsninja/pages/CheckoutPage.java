package com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;

import com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CheckoutPage extends Utility {
    private static final Logger log = LogManager.getLogger(CheckoutPage.class.getName());
    //2.16 Verify the text “Checkout”
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Checkout')]")
    WebElement verifyCheckoutText;

    public String verifycheckoutTextOnPage() {
        log.info("verify checkout text on page" + verifyCheckoutText.toString());

        return getTextFromElement(verifyCheckoutText);
    }

    //2.17 Verify the Text “New Customer”
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'New Customer')]")
    WebElement verifyNewCustomerText;


    public String verifyNewCustomerTab() {
        log.info("verify New customer text" + verifyNewCustomerText.toString());

        return getTextFromElement(verifyNewCustomerText);
    }

    // 2.18 Click on “Guest Checkout” radio button
    @CacheLookup
    @FindBy(xpath = "//input[@value='guest']")
    WebElement guestCheckout;

    public void clickOnGuestCheckout() {

        clickOnElement(guestCheckout);
        log.info("click on guest checkout" + guestCheckout.toString());

    }

    //2.19 Click on “Continue” tab
    @CacheLookup
    @FindBy(id = "button-account")
    WebElement Continue;

    public void clickOnContinueTab() {

        clickOnElement(Continue);
        log.info("click on continue" + Continue.toString());
    }

    //fill all field  of guestcheckout form------------------
    @CacheLookup
    @FindBy(id = "input-payment-firstname")
    WebElement firstname;

    public void enterFirstname(String text) {
        log.info("First name " + text + firstname.toString());
        sendTextToElement(firstname, text);

    }

    @CacheLookup
    @FindBy(id = "input-payment-lastname")
    WebElement lastname;

    public void enterLastname(String text) {
        log.info("Last name " + text + lastname.toString());
        sendTextToElement(lastname, text);

    }

    @CacheLookup
    @FindBy(id = "input-payment-email")
    WebElement email;

    public void enterEmail(String text) {
        log.info("Email " + text + email.toString());
        sendTextToElement(email, text);
    }

        @CacheLookup
        @FindBy(id = "input-payment-telephone")
        WebElement telephoneField;

    public void enterTelephone(String text) {
        log.info("Telephone no is " + text + telephoneField.toString());
        sendTextToElement(telephoneField, text);

    }
    @CacheLookup
    @FindBy(id = "input-payment-address-1")
    WebElement address1;

    public void enterAddress1(String text) {
        log.info("Address is " + text + address1.toString());
        sendTextToElement(address1, text);

    }
    @CacheLookup
    @FindBy(id = "input-payment-city")
    WebElement city;

    public void enterCityName(String text) {
        log.info("City name is " + text + city.toString());
        sendTextToElement(city, text);

    }

    @CacheLookup
    @FindBy(id = "input-payment-postcode")
    WebElement postcode;

    public void enterPostcode(String text) {
        log.info("Postcode is  " + text + postcode.toString());
        sendTextToElement(postcode, text);

    }

    @CacheLookup
    @FindBy(xpath = "//select[@id='input-payment-country']")
    WebElement Country;


    public void enterCountryName(String text) {
        log.info("Country name " + text + Country.toString());
        selectByVisibleTextFromDropDown(Country, text);

    }

    @CacheLookup
    @FindBy(xpath = "//select[@id='input-payment-zone']")
    WebElement region;

    public void enterRegionField(String text) {
        log.info("Region is " + text + region.toString());
        selectByVisibleTextFromDropDown(region, text);

    }

    //click on countinue
    @CacheLookup
    @FindBy(id= "button-guest")
    WebElement continueField;
    public void clickOnContinue() {
        log.info("click on continue" + continueField.toString());
        clickOnElement(continueField);

    }

    //2.22 Add Comments About your order into text area
    @CacheLookup
    @FindBy(xpath="//body/div[@id='checkout-checkout']/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/p[2]/textarea[1]")
    WebElement comment;


    public void addCommentOnTextArea(String text) {
        log.info(text + comment.toString());
        sendTextToElement(comment, text);

    }

    //2.23 Check the Terms & Conditions check box
    @CacheLookup
    @FindBy(xpath="//input[@type='checkbox']")
    WebElement termsCondition;


    public void clickOnTermsAndCondition() {
        log.info("clickOnTermsAndCondition" + termsCondition.toString());
        clickOnElement(termsCondition);

    }

    //2.24 Click on “Continue” button
    @CacheLookup
    @FindBy(id= "button-payment-method")
    WebElement contTab;

    public void clickOnContinueField() {
        log.info("click on continue" + contTab.toString());
        clickOnElement(contTab);

    }

    //2.25 Verify the message “Warning: Payment method required
    @CacheLookup
    @FindBy(xpath="//body/div[@id='checkout-checkout']/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]")
    WebElement verifyWarningMassage;


    public String verifyWarningSign() {
        log.info("“Warning: Payment method required " + verifyWarningMassage.toString());

        return getTextFromElement(verifyWarningMassage);
    }


}
