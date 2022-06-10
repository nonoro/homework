package gugudantest;

import java.util.Scanner;

public class Test1 {

    public static final String INPUT_NUMBER_MESSAGE = "숫자를 입력해 주세요 > ";
    public static final String DELIMETER = ",";
    public static final String EXIT_CODE = "0";

    public static void main(String[] args) {
        boolean isEnd = true;
        while (isEnd) {
            System.out.println(INPUT_NUMBER_MESSAGE);
            String numbers = Test1InputNumber.inputNumber();
            String[] split = numbers.split(DELIMETER);


            if (checkEndGame(numbers)) {
                isEnd = false;
            }

            if (isLength(split, 1)) {
                int number = Integer.parseInt(split[0]);
                Test1GuGudanMethod.gugudan(number, number);
            }

            if (isLength(split, 2)) {
                int numberA = Integer.parseInt(split[0]);
                int numberB = Integer.parseInt(split[1]);

                Test1GuGudanMethod.gugudan(numberA, numberB);
            }
        }
    }
    private static boolean isLength(String[] split, int x) {
        return split.length == x;
    }
    private static boolean checkEndGame(String numbers) {
        return numbers.equals(EXIT_CODE);
    }

}
