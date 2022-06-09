package gugudantest;

import java.util.Scanner;

public class MethodTest {
    public static boolean whl() {

        Scanner scanner = new Scanner(System.in);
        boolean taf = true;
        while (taf) {
            System.out.println("값을 입력해 주세요 > ");
            String inputValue = scanner.nextLine();
            String[] splitedValue = inputValue.split(",");
            int first = Integer.parseInt(splitedValue[0]);
            int second = Integer.parseInt(splitedValue[1]);
            for (int i = 2; i < (first + 1); i++) {
                for (int j = 1; j <= second; j++) {
                    System.out.printf("%d * %d = %d%n", i, j, (i * j));
                }
                System.out.println();
                continue;
            }
        }
        return taf;
    }
}
