package pages;

import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;

public class BasicPage {
    private static final String homePage = "https://demowebshop.tricentis.com/";

    public void openBasicPage() {
        open("https://demowebshop.tricentis.com/");
    }

    public void clickButton(String text) {
        $(By.xpath("//a[text()='" + text + "']")).click();
    }
    public void redirectOnMainPage() {
        String currentUrl = WebDriverRunner.url();  // Получение текущего URL
        assert currentUrl.equals(homePage);  // Замените на URL вашей главной страницы
    }

}
