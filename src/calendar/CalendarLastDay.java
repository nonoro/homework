package calendar;

import java.util.Scanner;

public class CalendarLastDay {

    public static final int MONTH_LAST_DAY_28 = 27;
    public static final int MONTH_LAST_DAY_30 = 29;
    public static final int MONTH_LAST_DAY_31 = 30;

    public static void main(String[] args) {
        // 입력 받은 달의 최대 일 수 구하기
        int numberInput = 0;
        String stringInput;

        Scanner input = new Scanner(System.in);
        int[] days = new int[31];

        for (int i = 0; i < days.length; i++) {
            days[i] = i + 1;
        }

        while (true) {
            System.out.print("달을 입력하세요 > ");
            stringInput = input.next();

            try {
                numberInput= Integer.parseInt(stringInput);

            } catch (Exception e) {
                System.out.println("1~12까지 숫자를 입력해 주세요");
                continue;
            }

            if (numberInput == 0) {
                System.out.println("Bye Bye");
                break;
            }
            if (numberInput == 2) {
                System.out.printf("%s월은 %d일까지 있습니다.%n", numberInput, days[MONTH_LAST_DAY_28]);
            } else if (numberInput == 4 || numberInput == 6 || numberInput == 9 || numberInput == 11) {
                System.out.printf("%s월은 %d일까지 있습니다.%n", numberInput, days[MONTH_LAST_DAY_30]);
            } else if (!(0 < numberInput && numberInput < 13)) {
                System.out.println("1~12까지 숫자를 입력해 주세요");
            } else {
                System.out.printf("%s월은 %d일까지 있습니다.%n", numberInput, days[MONTH_LAST_DAY_31]);
            }
        }
    }
}



