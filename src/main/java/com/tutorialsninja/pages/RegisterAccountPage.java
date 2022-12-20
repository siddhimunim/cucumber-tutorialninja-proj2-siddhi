package com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;

import com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegisterAccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegisterAccountPage.class.getName());
    //verify register account text
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register Account')]")
    WebElement regAccountText;


    public String verifyRegAccountText() {
    log.info("Verify Register account text" + regAccountText.toString());

        return getTextFromElement(regAccountText);
    }

    // filled mendotary field
    @CacheLookup
    @FindBy(id= "input-firstname")
    WebElement firstName;

    public void enterFirstName(String text) {

        sendTextToElement(firstName, text + getRandomString(1));
        log.info("enter first name " + text + firstName.toString());
    }
    @CacheLookup
    @FindBy(id= "input-lastname")
    WebElement lastName;

    public void enterLastName(String text) {

        sendTextToElement(lastName, text + getRandomString(1));
        log.info("enter last  name " + text + lastName.toString());
    }
    @CacheLookup
    @FindBy(id= "input-email")
    WebElement email;

    public void enterEmail(String text) {

        sendTextToElement(email, text + getRandomString(2) + "@gmail.com");
        log.info("Enter Email " + text + email.toString());
    }
    @CacheLookup
    @FindBy(id= "input-telephone")
    WebElement telephone;

    public void enterTelephone(String text) {

        sendTextToElement(telephone, text);
        log.info("enter Telephone :  " + text + telephone.toString());
    }
    @CacheLookup
    @FindBy(id= "input-password")
    WebElement password;

    public void enterPassword(String text) {

        sendTextToElement(password, text);
        log.info("Enter password : " + text + password.toString());
    }
    @CacheLookup
    @FindBy(id= "input-confirm")
    WebElement confirmPass;
    public void enterConfirmPassword(String text) {

        sendTextToElement(confirmPass, text);
        log.info("Enter Confirm Password : " + text + confirmPass.toString());
    }

    // 3.9 Select Subscribe Yes radio button
    @CacheLookup
    @FindBy(name="newsletter")
    WebElement subscribe;
    public void clickOnSubscribe() {

        clickOnElement(subscribe);
        log.info("Click on Subscribe" + subscribe.toString());
    }

    //3.10 Click on Privacy Policy check box
    @CacheLookup
    @FindBy(name="agree")
    WebElement checkbox;
    public void clickOnCheckbox() {

        clickOnElement(checkbox);
        log.info("click on checkbox  " +  checkbox.toString());
    }

    //3.11 Click on Continue button
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='account-register']/div[1]/div[1]/form[1]/div[1]/div[1]/input[2]")
    WebElement continueBox ;
    public void clickOnContinue() {

        clickOnElement(continueBox);
        log.info("click on continue" + continueBox.toString());
    }
    //for login extra email id
    @CacheLookup
    @FindBy(id= "input-email")
    WebElement emailId;

    public void enterEmailId(String text) {

        sendTextToElement(emailId, text );
        log.info("Enter Email " + text + emailId.toString());
    }

}
