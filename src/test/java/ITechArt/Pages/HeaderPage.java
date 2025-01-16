package ITechArt.Pages;
import static com.codeborne.selenide.Selenide.$;

public class HeaderPage {
    public void clickHeaderInstallButton() throws Exception {
        $(".header_installsteam_btn").click();
    }
}
