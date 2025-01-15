package ITechArt.Pages;
import java.io.File;
import static com.codeborne.selenide.Selenide.$;
public class AboutPage {
    public File clickInstallLink() throws Exception {
        File file = $("a.about_install_steam_link").download();
        return file;
    }
}
