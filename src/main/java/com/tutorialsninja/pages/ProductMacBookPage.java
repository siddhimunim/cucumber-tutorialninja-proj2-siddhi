package com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;

import com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ProductMacBookPage extends Utility {
    private static final Logger log = LogManager.getLogger(ProductMacBookPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'MacBook')]")
    WebElement verifyMacBookText ;


    public String verifyMacBookProduct() {
        log.info("verify MacBook text" + verifyMacBookText.toString());

        return getTextFromElement(verifyMacBookText);
    }

    //2.6 Click on ‘Add To Cart’ button
    @CacheLookup
    @FindBy(xpath = "//button[@id='button-cart']")
    WebElement addToCart1;


    public void clickOnCart() {

        clickOnElement(addToCart1);
        log.info("click on Add to cart" + addToCart1.toString());

    }
  //  2.7 Verify the message “Success: You have added MacBook to your shopping cart!”
  @CacheLookup
  @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
  WebElement verifymacBookText;

    public String verifyMacBookTab(){
        log.info("Success: You have added MacBook to your shopping cart!" + verifymacBookText.toString());

        return getTextFromElement(verifymacBookText);
    }
    // 2.8 Click on link “shopping cart” display into success message
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'shopping cart')]")
    WebElement shopcart;

    public void clickOnShoppingCart(){

        clickOnElement(shopcart);
        log.info("click on Shopping cart" + shopcart.toString());
    }
}
