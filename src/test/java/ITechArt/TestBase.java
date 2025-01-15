package ITechArt;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import static com.codeborne.selenide.Selenide.*;

public class TestBase {
    protected final String baseUrl = "https://store.steampowered.com";
    @BeforeTest
    protected void setup() {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setPlatform(Platform.WINDOWS);
        String browser = System.getProperty("browser", "chrome");
        switch (browser) {
            case "chrome" -> caps.setBrowserName(Browser.CHROME.browserName());
            case "edge" -> caps.setBrowserName(Browser.EDGE.browserName());
        }
        open(baseUrl);
    }
    @AfterTest
    protected void tearDown() {
        WebDriverRunner.closeWebDriver();
    }
}