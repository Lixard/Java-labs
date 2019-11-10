package lab5.task1;

public final class Rectangle extends Figure {

    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double areaCount() {
        return length * width;
    }
}
