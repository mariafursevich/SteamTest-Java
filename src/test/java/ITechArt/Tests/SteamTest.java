package ITechArt.Tests;
import ITechArt.*;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.File;
import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.*;

public class SteamTest extends TestBase {
    @Test
    public void downloadAndRenameGame() throws Exception {
        setup();

        new CategoriesTab().selectTabCategory();
        new CategoriesTab().selectGameCategory(Genres.Action);
        new CategoryAction().openNewAndTrendingTab();
        new NewTrendingGames().selectGameWithMaxDiscountOrPrice();

        SelenideElement ageCheckForm = $(By.cssSelector("div[class='agegate_text_container'] h2"));
        if (ageCheckForm.isDisplayed())
        {new AgeCheckPage().fillAgeCheckForm();
        };

        DownloadGame downloadPage = new DownloadGame();
        File downloadedFile = downloadPage.downloadSteamSetup();
        downloadPage.renameFile(downloadedFile);

        tearDown();
    }
}

