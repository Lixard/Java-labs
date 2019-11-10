package lab5.task2_3;


import java.util.concurrent.ThreadLocalRandom;

public final class Main {
    public static void main(String[] args) {
        Client client = new Client();

        Circle circle = new Circle(ThreadLocalRandom.current().nextDouble(1, 10));

        Rectangle rectangle = new Rectangle(ThreadLocalRandom.current().nextDouble(1, 10),
                ThreadLocalRandom.current().nextDouble(1,10));

        Adapter adapter = new Adapter(ThreadLocalRandom.current().nextDouble(1, 10),
                ThreadLocalRandom.current().nextDouble(1, 10));

        client.getArea(circle);
        client.getArea(rectangle);
        client.getArea(adapter);

    }
}
