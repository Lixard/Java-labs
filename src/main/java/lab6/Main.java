package lab6;


public class Main {
    public static void main(String[] args) {
        ThreadDate threadDate = new ThreadDate();
        System.out.println("ThreadDate started!");
        threadDate.start();

        ThreadFileSize threadFileSize = new ThreadFileSize();
        System.out.println("ThreadFileSize started!");
        threadFileSize.start();
    }
}
