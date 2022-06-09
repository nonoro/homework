package gugudan;

public class Array {
    public static void main(String[] args) {

        int[] result = new int[9];
        for (int i = 0; i < 9; i++) {
            result[i] = i + 1;
            System.out.println();
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d * %d = %d%n", result[i], j, (result[i] * j));
            }
        }
    }
}
