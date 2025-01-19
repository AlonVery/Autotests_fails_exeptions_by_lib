package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.BasicPage;

public class BasicPageDef {
    BasicPage basicPage = new BasicPage();
    Hooks hooks = new Hooks();

    @Given("Open page")
    public void openPage() {
        basicPage.openBasicPage();
    }

    @Then("Click {string} button")
    public void clickButton(String arg0) {
        basicPage.clickButton(arg0);
    }
    @Then("Check correct redirect on main page")
    public void checkCorrectRedirectOnMainPage() {
        basicPage.redirectOnMainPage();
    }


}
