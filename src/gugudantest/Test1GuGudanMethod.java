package gugudantest;

public class Test1GuGudanMethod {
    public static void gugudan(int numberA, int numberB) {
        for (int i = 1; i <= numberA; i++) {
            for (int j = 1; j <= numberB; j++) {
                System.out.printf("%d * %d = %d%n", i, j, i * j);
            }
        }
    }
}
