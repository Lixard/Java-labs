package lab6;

import java.io.File;
import java.util.GregorianCalendar;

public final class ThreadFileSize extends Thread {
    @SuppressWarnings("InfiniteLoopStatement")
    @Override
    public void run() {
        while (true) {
            try {
                FileSizeMoreThan50();
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void FileSizeMoreThan50() {
        File catalog = new File("src/main/resources/lab6/");
        if (catalog.exists()) {
            File file = new File(catalog, "currentData.txt");
            if (file.exists()) {
                if (file.length() > 50) {
                     if (file.renameTo(new File(catalog, new GregorianCalendar().getTime().toString()))) {
                         System.out.println("New file created!");
                     }
                }
            } else {
                System.out.println("File doesn't exist!");
            }
        } else {
            System.out.println("Catalog doesn't exist!");
        }
    }
}
