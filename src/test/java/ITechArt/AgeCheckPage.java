package ITechArt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class AgeCheckPage {

    public void fillAgeCheckForm() {

        if ($("#ageDay").exists()) {
            $("#ageDay").selectOption("1");
            $("#ageMonth").selectOption("January");
            $("#ageYear").selectOption("1997");
            $("a.btnv6_blue_hoverfade").click();
        }
    }}
