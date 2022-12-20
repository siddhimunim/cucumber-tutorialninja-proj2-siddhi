package com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;

import com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class MyAccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(MyAccountPage.class.getName());
    //click on my account and logout
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'My Account')]")
    WebElement myAccount;

    public void clickMyAccountTab() {

        mouseHoverToElementAndClick(myAccount);

        log.info("click on My account" + myAccount.toString());
    }

    //verify My Account
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'My Account')]")
    WebElement verifyMyAcc;

    public String verifyMyAccount() {
        log.info("Verify My account text" + verifyMyAcc.toString());


        return getTextFromElement(verifyMyAcc);
    }

}
