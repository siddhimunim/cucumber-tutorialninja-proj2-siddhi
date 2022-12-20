package com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;

import com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ComponentsPage extends Utility {
    private static final Logger log = LogManager.getLogger(ComponentsPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Components')]" )
    WebElement verifyComponentText;


    public String  verifyTextOfComponents() {
        log.info("verify text components"+ verifyComponentText.toString());

        return getTextFromElement(verifyComponentText);
    }
}
