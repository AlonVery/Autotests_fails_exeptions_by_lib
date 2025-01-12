package steps;

import static com.codeborne.selenide.Selenide.*;
import org.junit.Before;

public class Hooks {
    @Before
    public void openUrl(){
        open("https://demowebshop.tricentis.com/");
    }
}
