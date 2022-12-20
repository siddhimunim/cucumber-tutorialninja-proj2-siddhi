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

public class ShoppingCartPage extends Utility {
    private static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());
    //for all methods for desktop----------------------------------------///
    @CacheLookup
  //  @FindBy(xpath = "//body/div[@id='product-product']/div[1]")
     @FindBy(css=  "body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible")

     WebElement verifyMassage1;
    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']/a[2]")

    WebElement shoppingcart;

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']//h1")
    WebElement VerifyShoppingcart;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a")
    WebElement verifyProductname;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[2]/small[1]")
    WebElement verifyDelivarydate;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[3]")
    WebElement verifyModel;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[6]")
    WebElement verifyTotal;

    public String verifyMassageOfShoppingCart1() {
        log.info("“Success: You have added HP LP3065 to your shopping cart!" + verifyMassage1.toString());


        return getTextFromElement(verifyMassage1);

    }

    public void clickOnShoppingcart() {

        mouseHoverToElementAndClick(shoppingcart);
        log.info("click on shopping  cart" + shoppingcart.toString());
    }

    public String verifyProductnameText() {
        log.info("Verify product name is : HP LP3065" + verifyProductname.toString());


        return getTextFromElement(verifyProductname);

    }

    public String verifyDeliverydateText() {
        log.info(" Delivery Date  : 2022-11-30" + verifyDelivarydate.toString());


        return getTextFromElement(verifyDelivarydate);

    }

    public String verifyModelNo() {
        log.info("the Model : Product21" + verifyModel.toString());


        return getTextFromElement(verifyModel);

    }

    public String verifyShoppingCartText() {
        log.info("Verify ShoppingCart text" + VerifyShoppingcart.toString());


        return getTextFromElement(VerifyShoppingcart);

    }

    public String verifyTotal() {
        log.info(" the Todat  £74.73" + verifyTotal.toString());


        return getTextFromElement(verifyTotal);

    }



    //----------------all methods for laptop and notebook--------------------------//
   // 2.9 Verify the text "Shopping Cart"
  @CacheLookup
  @FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/h1[1]")
  WebElement  verifyShoppingCart;

    public String verifyMassageShoppingcart(){
        log.info(" Text veify Shopping Cart" + verifyShoppingCart.toString());


        return getTextFromElement(verifyShoppingCart);
    }
    //2.10 Verify the Product name "MacBook"
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a")
    WebElement verifyProductMacBook ;

    public String verifyTextOfMacBook(){
        log.info("The Product name :MacBook" + verifyProductMacBook.toString());


        return getTextFromElement(verifyProductMacBook);
    }
  //2.11 Change Quantity "2"
  @CacheLookup
  @FindBy(xpath = "//div[@class='input-group btn-block']/input")
  WebElement changeQty;

    public void clearQty(String text){

        WebElement changeqty =   driver.findElement(By.xpath("//div[@class='input-group btn-block']/input"));
        changeqty.clear();
        sendTextToElement(changeQty,text);
        log.info("clear Quantity and change to " +text + changeQty.toString());
    }
    //public void newQtychange(String text){
     //  sendTextToElement(changeQty,text);}
   //2.12 Click on “Update” Tab
   @CacheLookup
   @FindBy(xpath = "//tbody/tr[1]/td[4]/div[1]/span[1]/button[1]/i[1]")
   WebElement updateButton;

    public void clickOnUpdateButton(){

        clickOnElement(updateButton);
        log.info("click on Update button" + updateButton.toString());
    }

//2.13 Verify the message “Success: You have modified your shopping cart!”
@CacheLookup
@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
WebElement verifySuccessModifyCart;

    public String verifySuceesfullyUpdatecartMassage(){
        log.info("Success: You have modified your shopping cart!" + verifySuccessModifyCart.toString());


        return getTextFromElement(verifySuccessModifyCart);
    }
  //2.14 Verify the Total £737.45
  @CacheLookup
  @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[6]")
  WebElement verifyPriceCheck;

    public String verifyPrice(){
        log.info(" The Total  £737.45" + verifyPriceCheck.toString());


        return getTextFromElement(verifyPriceCheck);
    }
 //2.15 Click on “Checkout” button
 @CacheLookup
 @FindBy(linkText="Checkout")
 WebElement checkout;

    public void clickOnCheckOut(){

        mouseHoverToElementAndClick(checkout);
        log.info("click on checkout " +checkout.toString());
    }
}
