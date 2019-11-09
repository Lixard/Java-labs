package lab1_2;

import java.util.Scanner;

public final class Circle {
    private final double x;
    private final double y;

    private final double d;

    public Circle() {
        Scanner scanner = new Scanner(System.in);
        this.x = scanner.nextInt();
        this.y = scanner.nextInt();
        this.d = scanner.nextInt();
    }

    public Circle(int x, int y, int d) {
        this.x = x;
        this.y = y;
        this.d = d;
    }

    public double area() {
        return d/2 * Math.PI;
    }
}
