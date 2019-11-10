package lab5.task2_3;

public class Adapter extends Table implements IFigure  {

    Adapter(double length, double width) {
        super(length, width);
    }

    @Override
    public double getArea() {
       return calculateArea();
    }
}
