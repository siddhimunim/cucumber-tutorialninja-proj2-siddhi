package com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;

import com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class AccountSucessPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    // 3.12 Verify the message “Your Account Has Been Created!”
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Your Account Has Been Created!')]" )
    WebElement verifySucessMassage;

    public String verifySucessMassageText(){
    log.info("Your Account Has Been Created!"+ verifySucessMassage.toString());

        return getTextFromElement(verifySucessMassage);

    }
   // 3.13 Click on Continue button
   @CacheLookup
   @FindBy(linkText ="Continue" )
   WebElement clickOn;

    public void ClickOnContinueTab(){

        clickOnElement(clickOn);
        log.info("click on countinue tab"+ clickOn.toString());
    }
}
