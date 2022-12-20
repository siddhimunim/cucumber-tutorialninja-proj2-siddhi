package com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;


import com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());
    //verify returning customer
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Returning Customer')]")
    WebElement returningCustomer;

    public String verifyReturningCustomer() {
        log.info("verifying text Returning customer" + returningCustomer.toString());

        return getTextFromElement(returningCustomer);
    }

    //4.3 Enter Email address

    @CacheLookup
    @FindBy(id="input-email")
    WebElement email1;

    public void enterEmailField(String text) {

        sendTextToElement(email1, text);
        log.info("enter email" + text + email1.toString());
    }

    //4.5 Enter Password
    @CacheLookup
    @FindBy(id="input-password")
    WebElement password1;


    public void enterPasswordField(String text) {

        sendTextToElement(password1, text);
        log.info("enter password :" + text + password1.toString());
    }

    //4.6 Click on Login button
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='account-login']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]")
    WebElement loginButton1;


    public void clickOnLoginField() {

        mouseHoverToElementAndClick(loginButton1);
        log.info("click on login " + loginButton1.toString());
    }

}
