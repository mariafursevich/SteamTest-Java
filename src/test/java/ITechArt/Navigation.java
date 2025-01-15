package ITechArt;
import ITechArt.Enum.GenresEnum;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.actions;

public class Navigation {
    public void selectTabCategory() {
        SelenideElement categories = $(By.xpath("//div[@id='genre_tab']"));
        actions().moveToElement(categories).perform();
    }
    public void selectGameCategory(GenresEnum Genres) {
        SelenideElement gameGenre = $(By.xpath("//a[contains(text(), '" + Genres.getDisplayName() + "')]"));
        gameGenre.click();
    }
}