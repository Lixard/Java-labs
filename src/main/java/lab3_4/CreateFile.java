import java.io.File;
import java.io.IOException;

/**
 * The program creates a file in the directory specified in the startup parameters.
 * @author Lixard
 * @version 1.0
 */
public final class CreateFile {
    public static void main(String[] args) throws IOException {
        if (fileCreation(args[0])) {
            System.out.println("File created!");
        }
    }
    /**
     * Creating a file
     * @param fileName File path with file name
     * @return  true/false
     * @throws IOException the error occurs when the program can't perform actions with file(access denied, file missing, etc)
     */
    public static boolean fileCreation(String fileName) throws IOException {
        File file = new File(fileName);
        return file.createNewFile();
    }
}
