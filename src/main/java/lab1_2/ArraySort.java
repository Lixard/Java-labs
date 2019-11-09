import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public final class ArraySort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] mass = new int[size];
        for (int i = 0; i < size; i++) {
            mass[i] = ThreadLocalRandom.current().nextInt(1, 19);
            if (mass[i] % 10 == 0) {
                mass[i]--;
            }
        }
        Arrays.sort(mass);
        System.out.println(Arrays.toString(mass));
    }
}
