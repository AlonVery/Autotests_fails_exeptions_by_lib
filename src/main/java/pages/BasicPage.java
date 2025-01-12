package pages;
import static com.codeborne.selenide.Selenide.*;

import org.openqa.selenium.By;

public class BasicPage {


    public void clickButton(String text) {
        $(By.xpath("//div[text()='" + text + "']")).click();
    }
}
