package lab6;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Класс создает поток, который выводит на экран дату и время каждые 5 секунд и это время записывает в файл currentData.txt
 *
 * @author Maksim Borisov
 * @version 1.0
 * @see java.lang.Thread
 */
public final class ThreadDate extends Thread {

    /**
     * Главный метод, который является одной из реализаций потоков в Java.
     */
    @SuppressWarnings("InfiniteLoopStatement")
    @Override
    public void run() {
        while (true) {
            try {
                String date = date();
                writeToFile(date);
                System.out.println(date);
                Thread.sleep(5000);
            } catch (InterruptedException | IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * @return Возвращает строку с датой и временем.
     */
    private String date() {
        Calendar calendar = new GregorianCalendar();
        return calendar.getTime().toString();
    }

    /**
     * @param str получает строку чтобы записать ее в файл.
     * @throws IOException компилятор сообщает, что в этом методе может быть проблема ввода-вывода и просит отследить
     *                     возможную ошибку.
     */
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
