package calendar;

import java.util.Scanner;

public class CalendarTestMethod {

    private final static String PROMPT = "> ";
    public static final int EXIT_NUMBER = -1;
    public static final int FEB = 2;
    public static final int APR = 4;
    public static final int JUN = 6;
    public static final int SEP = 9;
    public static final int NOV = 11;
    public static final int FEB_LAST_DAYS = 28;
    public static final int APR_JUN_SEP_NOV_LAST_DAYS = 30;

    public void runPrompt() {
        String string;
        int monthInput;
        int monthOfLastDay = 0;
        Scanner input = new Scanner(System.in);


        while (true) {
            System.out.println("월을 입력하세요.");
            System.out.print(PROMPT);
            string = input.next();
            try {
                monthInput = Integer.parseInt(string);

            } catch (Exception e) {
                System.out.println("1~12까지 숫자를 입력해 주세요");
                continue;
            }
            if (monthInput == EXIT_NUMBER) {
                System.out.println("Bye Bye");
                break;
            } else if (!(0 < monthInput && monthInput < 13)) {
                System.out.println("1~12까지 숫자를 입력해 주세요");
                continue;
            }
            String[] day1 = {"일", "월", "화", "수", "목", "금", "토"};
            for (String days : day1) {
                System.out.printf("%s\t", days);
            }
            System.out.println();
            for (int i = 0; i < 26; i++) {
                System.out.print("-");
            }
            System.out.println();

            if (monthInput == FEB) {
                monthOfLastDay = FEB_LAST_DAYS;
            } else if (monthInput == APR || monthInput == JUN || monthInput == SEP || monthInput == NOV) {
                monthOfLastDay = APR_JUN_SEP_NOV_LAST_DAYS;
            } else {
                monthOfLastDay = 31;
            }

            int[] days = new int[31];
            for (int i = 0; i < monthOfLastDay; i++) {
                days[i] = i + 1;
                System.out.printf("%d\t", days[i]);
                if (i == 6 || i == 13 || i == 20 || i == 27) {
                    System.out.println();
                }
            }
            System.out.println();
        }
    }
}
