public final class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();

        Circle circleWithArgs = new Circle(1, 2,3 );

        System.out.println(circle.area());
        System.out.println(circleWithArgs.area());
    }
}
