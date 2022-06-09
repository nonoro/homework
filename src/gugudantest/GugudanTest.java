package gugudantest;

import java.util.Scanner;

public class GugudanTest {
    public static void main(String[] args) {
        boolean trueAndFalse = true;
        while (trueAndFalse) {
            System.out.println("값을 입력해 주세요 > ");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            String[] numbers = input.split(",");
            if (input.equals("0")) {
                trueAndFalse = false;
            }

            if (numbers.length == 1) {
                int number = Integer.parseInt(numbers[0]);
                gugudan(number);
            }
            if (!(numbers.length == 1)) {
                int numberA = Integer.parseInt(numbers[0]);
                int numberB = Integer.parseInt(numbers[1]);
                gugudan(numberA, numberB);
            }
        }
        }
        public static void gugudan (int number) {
        gugudan(numberA, numberB);
            for (int i = 2; i <= number; i++) {
                for (int j = 1; j <= number; j++) {p
                    System.out.printf("%d * %d = %d%n", i, j, (i * j));
                }
            }
        }

//        public static void gugudan (int numberA, int numberB) {
//            for (int i = 2; i <= numberA; i++) {
//                for (int j = 1; j < numberB; j++) {
//                    System.out.printf("%d * %d = %d%n", i, j, (i * j));
//                }
//            }
//        }
    }
