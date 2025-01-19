package steps;

import config.UserConfig;
import io.cucumber.java.en.Then;
import pages.RegisterPage;

public class RegisterPageDef {
    RegisterPage registerPage = new RegisterPage();

    @Then("Choise gender")
    public void choiseGender() {
        registerPage.choiseGenderMaie();
    }

    @Then("Fill register form")
    public void fillRegisterForm() {
        registerPage.fillRegisterForm(
                UserConfig.LAST_NAME,
                UserConfig.FIST_NAME,
                UserConfig.EMAIL,
                UserConfig.PASSWD,
                UserConfig.CONFIRM_PASSWD
        );
    }

    @Then("Click Register button on register page")
    public void clickRegisterButtonOnRegisterPage() {
        registerPage.clickRegisterButton();
    }

    @Then("Content with {string} is visible")
    public void contentWithVisible(String arg0) {
        registerPage.checkRegisterWelcomeText(arg0);
    }

}
