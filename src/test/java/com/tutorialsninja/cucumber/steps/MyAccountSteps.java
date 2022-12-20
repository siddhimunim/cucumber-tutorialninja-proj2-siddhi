package com.tutorialsninja.cucumber.steps;

import com.tutorialsninja.pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyAccountSteps {
    @When("^I click on My account Link$")
    public void iClickOnMyAccountLink() {
        new HomePage().clickOnMyAccount();
    }


    @And("^I click on \"([^\"]*)\" option$")
    public void iClickOnOption(String option)  {
        new HomePage().selectMyAccountOptions(option);

    }

    @Then("^I verify the text Rgister Account$")
    public void iVerifyTheTextRgisterAccount() {
        Assert.assertEquals("Register Account",new RegisterAccountPage().verifyRegAccountText());
    }


    @And("^I verify the text returning customer$")
    public void iVerifyTheTextReturningCustomer() {
        Assert.assertEquals("Returning Customer",new LoginPage().verifyReturningCustomer());
    }

    @And("^I filled Registration Form$")
    public void iFilledRegistrationForm() {
        new RegisterAccountPage().enterFirstName("Jenu");
        new RegisterAccountPage().enterLastName("Thak");
        new RegisterAccountPage().enterEmail("jenuthak");
        new RegisterAccountPage().enterTelephone("02035895647");
        new RegisterAccountPage().enterPassword("jenkate123");
        new RegisterAccountPage().enterConfirmPassword("jenkate123");
        new RegisterAccountPage().clickOnSubscribe();
        new RegisterAccountPage().clickOnCheckbox();
    }

    @And("^I click On Continue$")
    public void iClickOnContinue() {
        new RegisterAccountPage().clickOnContinue();
    }

    @And("^i verify message Your Account Has Been Created!$")
    public void iVerifyMessageYourAccountHasBeenCreated() {
        Assert.assertEquals("Your Account Has Been Created!",new AccountSucessPage().verifySucessMassageText());
    }

    @And("^I click On Continue Tab$")
    public void iClickOnContinueTab() {
      new AccountSucessPage().ClickOnContinueTab();
    }

    @And("^I click On My Account Tab$")
    public void iClickOnMyAccountTab() {
        new MyAccountPage().clickMyAccountTab();
    }

    @And("^I verify text account logout$")
    public void iVerifyTextAccountLogout() {
        Assert.assertEquals("Account Logout",new LogOutAccountPage().verifyAccountLogout());
    }

    @And("^I click On Continue Field$")
    public void iClickOnContinueField() {
        new LogOutAccountPage().clickOnContinueField();
    }


    @And("^I Enter my login detail$")
    public void iEnterMyLoginDetail() {
        new RegisterAccountPage().enterEmailId("jenuthakerkate@gmail.com");
        new RegisterAccountPage().enterPassword("jenkate12");
    }
    @And("^i click on login$")
    public void iClickOnLogin() {
        new LoginPage().clickOnLoginField();
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
      new LoginPage().clickOnLoginField();
    }

    @Then("^I verify the text Account logout$")
    public void iVerifyTheTextAccountLogout() {
        Assert.assertEquals("Account Logout",new LogOutAccountPage().verifyAccountLogout());

    }


}
