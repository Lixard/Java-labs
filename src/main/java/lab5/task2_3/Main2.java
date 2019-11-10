package lab5.task2_3;


import java.util.concurrent.ThreadLocalRandom;

public final class Main2 {
    public static void main(String[] args) {
        Apartment apartment = new Apartment(ThreadLocalRandom.current().nextDouble(1, 10),
                ThreadLocalRandom.current().nextDouble(1, 10));

        IFigure iFigure = new IFigure() {
            @Override
            public double getArea() {
                return apartment.returnArea();
            }
        };
        Client client = new Client();

        client.getArea(iFigure);
    }
}
