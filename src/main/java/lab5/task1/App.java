package lab5.task1;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public final class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        final int size = scanner.nextInt();
        Figure[] massive = new Figure[size];
        for (int i = 0; i < massive.length; i++) {
            boolean coinFlip = ThreadLocalRandom.current().nextBoolean();
            if (coinFlip) {
                massive[i] = new Circle(ThreadLocalRandom.current().nextDouble(1, 10));
            } else {
                massive[i] = new Rectangle(ThreadLocalRandom.current().nextDouble(1, 10),
                        ThreadLocalRandom.current().nextDouble(1, 10));
            }
        }
        getAll(massive);
    }

    private static void getAll(@NotNull Figure[] massive) {
        int circleCount = 0;
        int rectangleCount = 0;
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] instanceof Circle) {
                System.out.println(i + 1 + ". " + massive[i].areaCount() + " - Circle");
                circleCount++;
            } else {
                System.out.println(i + 1 + ". " + massive[i].areaCount() + " - Rectangle");
                rectangleCount++;
            }
        }

        System.out.println("Total circles: " + circleCount);
        System.out.println("Total rectangles: " + rectangleCount);
    }
}
