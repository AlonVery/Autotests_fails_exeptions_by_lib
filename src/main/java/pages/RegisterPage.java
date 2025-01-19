package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class RegisterPage {
    private SelenideElement registerFirstName = $(By.xpath("//*[@id=\"FirstName\"]"));
    private SelenideElement registerLastName = $(By.xpath("//*[@id=\"LastName\"]"));
    private SelenideElement registerEmail = $(By.xpath("//*[@id=\"Email\"]"));
    private SelenideElement registerPasswd = $(By.xpath("//*[@id=\"Password\"]"));
    private SelenideElement registerConfirmPasswd = $(By.xpath("//*[@id=\"ConfirmPassword\"]"));

    public void fillRegisterForm(String firstName, String lastName, String email, String passwd, String confirmPasswd) {
        this.registerFirstName.setValue(firstName);
        this.registerLastName.setValue(lastName);
        this.registerEmail.setValue(email);
        this.registerPasswd.setValue(passwd);
        this.registerConfirmPasswd.setValue(confirmPasswd);
    }
    public void choiseGenderMaie() {
        $(By.xpath("//*[@id=\"gender-male\"]")).click();
    }
    public void clickRegisterButton() {
       $(By.xpath("//*[@id=\"register-button\"]")).click();

    }
    public void checkRegisterWelcomeText(String welcomeText) {
        $(".result").shouldHave(text(welcomeText)).shouldBe(visible);
    }
}
