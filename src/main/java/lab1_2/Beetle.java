package lab1_2;

public class Beetle extends Insect {
    int k = prt("Beetle.k initialized");
    Beetle() {
        prt("k = " + k);
        prt("j = " + j);
    }
    static int x2 = prt("static Beetle.x2 initialized");
    public static void main(String[] args) {
        prt("Beetle constructor");
        Beetle b = new Beetle();
    }

}
