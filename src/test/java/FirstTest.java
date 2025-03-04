import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FirstTest {
    @Test
    void successfulSearchTest() {
        Configuration.holdBrowserOpen = true;
        open("http://localhost:8080/app/#!");

        $("[type=text]").setValue("admin");
        $("[type=password]").setValue("admin");
        $("[class=\"v-button v-widget v-has-width\"]").click();


    }
}