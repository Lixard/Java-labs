package lab5.task1;

public final class Circle extends Figure {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double areaCount() {
        return radius * radius * Math.PI;
    }

}
