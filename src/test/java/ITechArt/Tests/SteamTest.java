package ITechArt.Tests;
import ITechArt.*;
import ITechArt.Enum.GenresEnum;
import ITechArt.Pages.AboutPage;
import ITechArt.Pages.CategoryPage;
import ITechArt.Pages.HeaderPage;
import org.testng.annotations.Test;
import java.io.File;

public class SteamTest extends TestBase {
    @Test
    public void downloadAndRenameGame() throws Exception {
        setup();
        new Navigation().selectTabCategory();
        new Navigation().selectGameCategory(GenresEnum.Action);
        new CategoryPage().openNewAndTrendingTab();
        new Tabs().selectGameWithMaxDiscountOrPrice();
        new HeaderPage().clickHeaderInstallButton();
        AboutPage downloadPage = new AboutPage();
        File downloadedFile = downloadPage.clickInstallLink();
        Utils.renameFile(downloadedFile);
        tearDown();
    }
}

