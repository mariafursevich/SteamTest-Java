package ITechArt;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Utils {
    public static void renameFile(File file) throws Exception {
        String newFileName = file.getName().replace(".exe", "") + "_" + System.currentTimeMillis() + ".exe";
        Files.move(file.toPath(), Paths.get(file.getParent(), newFileName));
        System.out.println(newFileName);
    }
}