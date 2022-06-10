package gugudantest;

public class GugudanTestMethod {

    public static void gugudan (int numberA, int numberB) {
        for (int i = 2; i <= numberA; i++) {
            for (int j = 1; j <= numberB; j++) {
                System.out.printf("%d * %d = %d%n", i, j, (i * j));
            }
        }
    }
}
