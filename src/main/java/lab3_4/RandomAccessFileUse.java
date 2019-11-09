package lab3_4;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public final class RandomAccessFileUse {
    public static void main(String[] args) throws IOException {
        File catalog = new File("src/main/resources/lab3_4");
        File file = new File(catalog, "text.txt");

        RandomAccessFile accessFile = new RandomAccessFile(file, "rw");
        ArrayList<String> list = new ArrayList<>();
        String str = "";
        String substr = "russia";
        while (str != null) {
            str = accessFile.readLine();
            list.add(str);
        }
        accessFile.seek(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains(substr)) {
                list.set(i, list.get(i).replaceAll(substr, "RUSSIA"));
            }
            accessFile.writeBytes(list.get(i));
        }
    }
}
