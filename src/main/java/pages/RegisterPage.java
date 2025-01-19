package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

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
    public void clickRegisterConfirmButton(String Confirm) {
        // для таких видов HTML кода: <input type="button" class="button-1 register-continue-button" onclick="location.href='/'" value="Continue">
        $x("//input[@class='button-1 register-continue-button']").click();
    }

    //#todo: add confirm correct mail after registration
//    public void checkCorrectMailAfterRegisteration() {
//        // Проверка, что элемент с классом "account" содержит этот текст
//        $("a.account").shouldHave(text(String.valueOf(registerEmail)));
//    }
}
