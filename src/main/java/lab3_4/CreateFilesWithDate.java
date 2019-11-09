import java.io.File;
import java.io.IOException;

public final class CreateFilesWithDate {
    public static void main(String[] args) {
        creatingTenFiles();
    }

    public static void creatingTenFiles() {
        for (int i = 1; i <= 10; i++) {
            File file = new File(i + ".txt");
            try {
                if (file.createNewFile()) {
                    System.out.println("File " + i + " created!");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
