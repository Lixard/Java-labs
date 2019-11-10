package lab5.task2_3;

final class Circle implements IFigure {

    private final double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }
}
