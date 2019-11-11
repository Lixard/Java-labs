package lab6;

//параметр запуска для javadoc: "-encoding UTF-8 -docencoding UTF-8 -charset UTF-8"
public class App {
    public static void main(String[] args) {
        ThreadDate threadDate = new ThreadDate();
        System.out.println("ThreadDate started!");
        threadDate.start();

        ThreadFileSize threadFileSize = new ThreadFileSize();
        System.out.println("ThreadFileSize started!");
        threadFileSize.start();
    }
}
