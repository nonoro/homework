package gugudan;


public class GugudanMain {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            int[] result = Method.calculate(i);
            Method.print(result);
            System.out.println();
        }
    }
}

