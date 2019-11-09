package lab3_4;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

final class CreateFilesWithDate {

    private static final File catalog = new File("src/main/resources/lab3_4");

    CreateFilesWithDate() throws IOException {
        if (catalog.mkdirs()) {
            System.out.println("Catalog created!");
        }
        create10Files();
        delete3Files();
        createSumFile();
    }

    private void create10Files() throws IOException {
        for (int i = 1; i <= 10; i++) {
            File file = new File(catalog, i + ".txt");
            if (file.createNewFile()) {
                System.out.println(file.getName() + " created!");
            }
            SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss");
            Date date = new Date();
            FileWriter writer = new FileWriter(file, false);
            writer.write(format.format(date));
            writer.close();
        }
    }

    private void delete3Files() {
        for (int i = 0; i < 3; i++) {
            int random = ThreadLocalRandom.current().nextInt(1, 10);
            File file = new File(catalog, random + ".txt");
            if (!file.exists()) {
                i--;
            }
            if (file.delete()) {
                System.out.println(file.getName() + " deleted!");
            }
        }
    }

    private void createSumFile() throws IOException {
        File sumFile = new File(catalog, "all.txt");
        if (sumFile.createNewFile()) {
            System.out.println(sumFile.getName() + " created!");
        }
        cleanFile(sumFile);
        FileWriter writer = new FileWriter(sumFile, true);

        for (int i = 1; i <= 10; i++) {
            File file = new File(catalog, i + ".txt");
            if (file.exists()) {
                Scanner scanner = new Scanner(file);
                String str = scanner.nextLine();
                scanner.close();
                writer.write(str + " - " + file.getName());
                writer.write(System.lineSeparator());
            }
        }
        writer.close();
    }

    private void cleanFile(File file) throws IOException {
        FileWriter writer = new FileWriter(file, false);
        writer.write("");
        writer.close();
    }
}
