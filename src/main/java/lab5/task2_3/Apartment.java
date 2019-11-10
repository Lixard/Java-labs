package lab5.task2_3;

class Apartment {

    private final double length;
    private final double width;

    Apartment(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double returnArea() {
        return length * width;
    }
}
