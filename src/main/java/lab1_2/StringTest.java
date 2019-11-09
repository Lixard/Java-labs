public final class StringTest {
    public static void main(String[] args) {
        String str = "d";
        String str1 = "d";
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            str += str1;
        }
        System.out.println(System.currentTimeMillis() - startTime);

        StringBuilder strBuilder = new StringBuilder("d");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            strBuilder.append(str1);
        }
        System.out.println(System.currentTimeMillis() - startTime);

        StringBuffer strBuffer = new StringBuffer("d");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            strBuffer.append(str1);
        }
        System.out.println(System.currentTimeMillis() - startTime);
    }
}
