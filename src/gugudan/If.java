package gugudan;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isValidValue = true;
        while (isValidValue) {
            System.out.println();
            System.out.println("구구단 중 출력할 단은?(0을 입력하면 종료됩니다) >" );
            int number = scanner.nextInt();
            if (number == 0) {
                isValidValue = false;
                break;
            }
            if (0 < number & number < 10) {
                for (int i = 1; i < 10; i++) {
                    System.out.println(number * i);
                }
            } else {
                System.out.println("1 ~ 9까지의 숫자로 다시 입력해 주세요.");
            }
        }
    }
}

