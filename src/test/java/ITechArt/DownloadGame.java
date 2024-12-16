package ITechArt;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import static com.codeborne.selenide.Selenide.$;

public class DownloadGame {


    public File downloadSteamSetup() throws Exception {
        $(".header_installsteam_btn").click();
        File file = $("a.about_install_steam_link").download();
        return file;
    }

    public void renameFile(File file) throws Exception {
        String newFileName = file.getName().replace(".exe", "") + "_" + System.currentTimeMillis() + ".exe";
        Files.move(file.toPath(), Paths.get(file.getParent(), newFileName));
        System.out.println(newFileName);
    }
}
