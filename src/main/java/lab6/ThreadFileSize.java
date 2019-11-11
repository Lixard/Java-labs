package lab6;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

/**
 * Класс создает поток, который каждые 15 секунд проверяет размер файла currentData.txt и если этот размер превысил 50 байт,
 * то переименовывает имеющийся файл в текущую дату и время.
 *
 * @author Maksim Borisov
 * @version 1.0
 * @see java.lang.Thread
 */
public final class ThreadFileSize extends Thread {
    /**
     * Используется для форматирования даты и времени, которым мы будем называть файл.
     */
    private final SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");

    /**
     * Главный метод, который является одной из реализаций потоков в Java.
     */
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

    /**
     * Главный метод программы, в котором происходит вся реализация.
     * Осуществляет проверки на различные ошибки и проверяет условие (размер файла > 50). Если условие верно,
     * то переименовываем существующий файл в текущую дату и время.
     */
    private void FileSizeMoreThan50() {
        File catalog = new File("src/main/resources/lab6/");
        if (catalog.exists()) {
            File file = new File(catalog, "currentData.txt");
            if (file.exists()) {
                if (file.length() > 50) {
                    if (file.renameTo(new File(catalog, format.format(new GregorianCalendar().getTime()) + ".txt"))) {
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
