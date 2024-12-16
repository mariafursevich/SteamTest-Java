package ITechArt;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.actions;


public class CategoriesTab {

    public void selectTabCategory () {
        SelenideElement categories = $(By.xpath("//div[@id='genre_tab']"));
        actions().moveToElement(categories).perform();
    }
    public void selectGameCategory (Genres Genres) {

       SelenideElement gameGenre = $(By.xpath("//a[contains(text(), '" + Genres.getDisplayName() + "')]"));
       gameGenre.click();
    }


}
