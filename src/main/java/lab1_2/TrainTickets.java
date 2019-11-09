package lab1_2;

public final class TrainTickets {
    public static void main(String[] args) {
        int luckyTickets = 0;

        for (int i = 1001; i < 1000000; i++) {
            int num1 = i / 100000 % 10;
            int num2 = i / 10000 % 10;
            int num3 = i / 1000 % 10;
            int num4 = i / 100 % 10;
            int num5 = i / 10 % 10;
            int num6 = i % 10;
            if ((num1 + num2 + num3) == (num4 + num5 + num6)) {
                luckyTickets++;
            }
        }
        System.out.println(luckyTickets);
    }
}
