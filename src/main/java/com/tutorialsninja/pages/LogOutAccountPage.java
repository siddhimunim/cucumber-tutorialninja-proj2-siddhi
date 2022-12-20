package com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;

import com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LogOutAccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(LogOutAccountPage.class.getName());
    // 3.16 Verify the text “Account Logout”
    @CacheLookup
    @FindBy(xpath="//h1[contains(text(),'Account Logout')]")
    WebElement logOut;

    public String verifyAccountLogout() {
        log.info("verifying account logout text" + logOut.toString());

        return getTextFromElement(logOut);
    }

    // 3.17 Click on Continue button
    @CacheLookup
    @FindBy(xpath="//a[contains(text(),'Continue')]")
    WebElement fieldContinue;


    public void clickOnContinueField() {

        clickOnElement(fieldContinue);
        log.info("click on continue" + fieldContinue.toString());

    }


}
