package com.tutorialsninja.cucumber.steps;

import com.tutorialsninja.pages.ComponentsPage;
import com.tutorialsninja.pages.DesktopsPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LaptopAndNoteBookPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;
import org.junit.Assert;

public class TopMenuSteps {
    @Given("^I am on main page$")
    public void iAmOnMainPage() {
    }

    @When("^I mouse hover on desktop tab and click$")
    public void iMouseHoverOnDesktopTabAndClick() {
        new HomePage().mouseHoverOnDesktop();
    }

    @And("^I click on \"([^\"]*)\" tab$")
    public void iClickOnTab(String menu)  {
        new HomePage().selectmenu(menu);

    }

    @Then("^I verify the text desktops$")
    public void iVerifyTheTextDesktops() {
        Assert.assertEquals("Desktops",new DesktopsPage().verifyText());
    }

    @When("^I mouse hoover on Laptop and notebook tab and click$")
    public void iMouseHooverOnLaptopAndNotebookTabAndClick() throws InterruptedException {
        new HomePage().mouseHoverOnlaptopAndNoteBook();
        Thread.sleep(500);
    }

    @And("^I click  \"([^\"]*)\" tab$")
    public void iClickTab(String menu) throws InterruptedException  {
      //  new HomePage().selectmenu(menu);
       // Thread.sleep(500);
        new HomePage().clickOnAllLaptop();

    }


    @Then("^I verify the text Laptops & Notebooks$")
    public void iVerifyTheTextLaptopsNotebooks() {
        Assert.assertEquals("Laptops & Notebooks",new LaptopAndNoteBookPage().verifyTextOfLaptop());

    }


    @When("^I mouse hoover on components tab and link$")
    public void iMouseHooverOnComponentsTabAndLink() {
        new HomePage().mouseHoverOnComponents();
    }

    @And("^I click on \"([^\"]*)\"$")
    public void iClickOn(String menu)  {
        new HomePage().selectmenu(menu);

    }

    @Then("^I verify the text  Components$")
    public void iVerifyTheTextComponents() {
        Assert.assertEquals("Components",new ComponentsPage().verifyTextOfComponents());

    }


}
