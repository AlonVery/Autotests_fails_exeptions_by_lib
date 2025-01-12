package steps;

import io.cucumber.java.en.Then;
import pages.BasicPage;

public class BasicPageDef {
    BasicPage basicPage = new BasicPage();

    @Then("Click {string} button")
    public void clickButton(String arg0) {
        basicPage.clickButton(arg0);
    }
}
