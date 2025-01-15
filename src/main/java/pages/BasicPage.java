package pages;

import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;

public class BasicPage {
    public void openBasicPage() {
        open("https://demowebshop.tricentis.com/");
    }

    public void clickButton(String text) {
        $(By.xpath("//a[text()='" + text + "']")).click();
    }

}
