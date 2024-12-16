package ITechArt;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.*;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.urlContaining;

public class CategoryAction extends TestBase {

public void openNewAndTrendingTab() {

        SelenideElement section13268 = $(By.id("SaleSection_13268"));
        section13268.scrollTo();
        SelenideElement newTrending = $x("//div[text()='New & Trending']").shouldBe(visible);
        executeJavaScript("arguments[0].click();", newTrending);
        webdriver().shouldHave(urlContaining("contenthub_newandtrending"));


    }
}

