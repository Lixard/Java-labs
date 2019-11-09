package lab3_4;

import java.io.IOException;

public final class Main {
    public static void main(String[] args) {
        try {
            new CreateFilesWithDate();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
