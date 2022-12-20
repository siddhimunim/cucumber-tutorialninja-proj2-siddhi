package com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;

import com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());


    //for desktop tab
    @CacheLookup
    @FindBy(xpath = "//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*")
    List<WebElement> menuField;
    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement desktopsField;
    @CacheLookup
    @FindBy(linkText = "Show All Desktops")
    WebElement allDesktopField;

    @CacheLookup
    @FindBy(linkText = "Laptops & Notebooks")
    WebElement laptopAndNoteBookField;

    @CacheLookup
    @FindBy(linkText = "Components")
    WebElement componentsField;

    @CacheLookup
    @FindBy(xpath="//span[contains(text(),'Currency')]")
    WebElement currencyField;

    @CacheLookup
    @FindBy(xpath="//button[contains(text(),'£ Pound Sterling')]")
    WebElement SelectPound;



    //method for homepage
    public void clickOnAllDesktop() {

        clickOnElement(allDesktopField);
        log.info("click on All desktop tab"+ allDesktopField.toString());

    }

    public void mouseHoverOnlaptopAndNoteBook() {

        mouseHoverToElementAndClick(laptopAndNoteBookField);
        log.info("click on laptop and notebook"+ laptopAndNoteBookField.toString());

    }

    public void mouseHoverOnDesktop() {

        mouseHoverToElementAndClick(desktopsField);
        log.info("click on desktop tab"+ desktopsField.toString());

    }

    public void mouseHoverOnComponents() {

        mouseHoverToElementAndClick(componentsField);
        log.info("click on Components"+ componentsField.toString());
    }

    public void selectmenu(String menu) {
        log.info("click on All desktop tab"+ allDesktopField.toString());
        List<WebElement> topMenuList = (menuField);
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                }
            }
        } catch (
                StaleElementReferenceException e) {
            topMenuList = (menuField);
        }
    }

    public void clickOnCurrency() {

        mouseHoverToElementAndClick(currencyField);
        log.info("click on currency"+ currencyField.toString());

    }

    public void selectCurrencyPound() {

        clickOnElement(SelectPound);
        log.info("Select currency pound "+ SelectPound.toString());

    }

    //---------------------------------method for select my account tabs-------------------------------//
    By myAccountList1 = By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']/li");

    public void selectMyAccountOptions(String option) {

        List<WebElement> myAccountList = driver.findElements(myAccountList1);
        try {
            for (WebElement option1 : myAccountList) {
                System.out.println(option1.getText());
                if (option1.getText().equals(option)) {
                    option1.click();
                    break;
                }

            }

        } catch (StaleElementReferenceException e) {
            myAccountList = driver.findElements(myAccountList1);
        }
    }

    //click on my account
    By myAccountButton = By.xpath("//span[contains(text(),'My Account')]");

    public void clickOnMyAccount() {
        mouseHoverToElementAndClick(myAccountButton);
    }

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Show All Laptops & Notebooks')]")
  WebElement allLaptop;
    public void clickOnAllLaptop(){
        mouseHoverToElementAndClick(allLaptop);
    }
}
