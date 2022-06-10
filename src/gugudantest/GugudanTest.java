package gugudantest;

import java.util.Scanner;

public class GugudanTest {
    private static final String INPUT_VALUE = "값을 입력해 주세요 > ";
    public static final String REGEX = ",";
    public static final String EXIT_NUMBER = "0";


    public static void main(String[] args) {
        boolean trueAndFalse =  true;
        while (trueAndFalse) {
            System.out.println(INPUT_VALUE);
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            String[] numbers = input.split(REGEX);

            if (input.equals(EXIT_NUMBER)) {
                trueAndFalse = false;
            }

            if (numbers.length == 1) {
                int number = Integer.parseInt(numbers[0]);
                GugudanTestMethod.gugudan(number, number);
            }
            if (!(numbers.length == 1)) {
                int numberA = Integer.parseInt(numbers[0]);
                int numberB = Integer.parseInt(numbers[1]);
                GugudanTestMethod.gugudan(numberA, numberB);
            }
        }
    }
}
