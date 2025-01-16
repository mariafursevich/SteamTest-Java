package ITechArt.Pages;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class AgeCheckPage {
    public SelenideElement ageCheckForm = $(By.cssSelector("div[class='agegate_text_container'] h2"));
    public void fillAgeCheckForm() {
        if ($("#ageDay").exists()) {
            $("#ageDay").selectOption("1");
            $("#ageMonth").selectOption("January");
            $("#ageYear").selectOption("1997");
            $("a.btnv6_blue_hoverfade").click();
        }
    }
}