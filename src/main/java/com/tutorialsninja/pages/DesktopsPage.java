package com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;

import com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopsPage extends Utility {
    private static final Logger log = LogManager.getLogger(DesktopsPage.class.getName());
    //verify desktoptext on page
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Desktops')]" )
    WebElement verifyDesktopText;
    @CacheLookup
    @FindBy(xpath = "//select[@id='input-sort']" )
    WebElement clickOnZtoA;
    @CacheLookup
    @FindBy(xpath = "//select[@id='input-sort']" )
    WebElement clickOnAtoZ;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'HP LP3065')]" )
    WebElement selectHp3065;

    public void clickOnHpLaptop() {

        clickOnElement(selectHp3065);
        log.info("click on HP Laptop"+ selectHp3065.toString());

    }


    public String verifyText() {
        log.info("verify desktop text"+ verifyDesktopText.toString());

        return getTextFromElement(verifyDesktopText);
    }

    public void clickonAtoZ() {

        selectByVisibleTextFromDropDown(clickOnAtoZ, "Name (A - Z)");
        log.info("click on A toZ "+ clickOnAtoZ.toString());

    }

    public void clickonZtoA() {

        //  clickOnElement(clickOnZtoA);
        selectByVisibleTextFromDropDown(clickOnZtoA, "Name (Z - A)");
        log.info("click on Z to A"+ clickOnZtoA.toString());

    }

    //verify z-a order
    @CacheLookup
    @FindBy(xpath = "//h4/a" )
   List< WebElement> allProductName;

    By sortOutZToA = By.id("input-sort");

    public ArrayList<String> verifyProductZToA() {
        // Get all the products name and stored into array list
        List<WebElement> products = allProductName;
        ArrayList<String> originalProductsName = new ArrayList<>();
        for (WebElement e : products) {
            originalProductsName.add(e.getText());
        }
        System.out.println(originalProductsName);
        // Sort By Reverse order//
        Collections.reverse(originalProductsName);
        //System.out.println(originalProductsName);
        // Select sort by Name Z - A//
        selectByVisibleTextFromDropDown(sortOutZToA, "Name (Z - A)");
        // After filter Z -A Get all the products name and stored into array list
        products = (allProductName);
        ArrayList<String> afterSortByZToAProductsName = new ArrayList<>();
        for (WebElement e : products) {
            afterSortByZToAProductsName.add(e.getText());

        }
        return afterSortByZToAProductsName;
    }


}
