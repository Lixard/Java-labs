package lab6;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;


public final class ThreadDate extends Thread {

    @SuppressWarnings("InfiniteLoopStatement")
    @Override
    public void run() {
        while (true) {
            try {
                String date = date();
                writeToFile(date);
                Thread.sleep(5000);
            } catch (InterruptedException | IOException e) {
                e.printStackTrace();
            }
        }
    }

    private String date() {
        Calendar calendar = new GregorianCalendar();
        return calendar.getTime().toString();
    }

    private void writeToFile(String str) throws IOException {
        File catalog = new File("src/main/resources/lab6/");
        if (catalog.mkdirs()) {
            System.out.println("Catalog created!");
        }
        File file = new File(catalog, "currentData.txt");
        if (file.createNewFile()) {
            System.out.println(file.getName() + " created!");
        }
        FileWriter writer = new FileWriter(file, true);
        writer.write(str);
        writer.write(System.lineSeparator());
        writer.close();
    }
}
