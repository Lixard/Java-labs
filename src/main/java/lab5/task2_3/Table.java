package lab5.task2_3;

class Table {

    private final double length;
    private final double width;

    Table(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        return length * width;
    }
}
