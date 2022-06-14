package calendar;

import java.util.Scanner;

public class CalendarTestMethod {

    private final static String PROMPT = "> ";
    public static final int EXIT_MONTH_NUMBER = -1;
    public static final int EXIT_YEAR_NUMBER = -1;
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
        int year;
        int monthOfLastDay = 0;
        Scanner input = new Scanner(System.in);


        while (true) {
            System.out.println("년도를 입력하세요.");
            string = input.next();
            try {
                year = Integer.parseInt(string);
            } catch (Exception e) {
                System.out.println("숫자를 입력해 주세요");
                continue;
            }

            if (year == EXIT_YEAR_NUMBER) {
                System.out.println("Bye Bye");
                break;
            }

            System.out.println("월을 입력하세요.");
            System.out.print(PROMPT);
            string = input.next();
            try {
                monthInput = Integer.parseInt(string);

            } catch (Exception e) {
                System.out.println("1~12까지 숫자를 입력해 주세요");
                continue;
            }

            if (monthInput == EXIT_MONTH_NUMBER) {
                System.out.println("Bye Bye");
                break;
            } else if (!(0 < monthInput && monthInput < 13)) {
                System.out.println("1~12까지 숫자를 입력해 주세요");
                continue;
            }
            System.out.printf("     <<%4d년 %3d월>>\n", year, monthInput);
            String[] day1 = {"SU", "MO", "TU", "WE", "TH", "FR", "SA"};
            for (String days : day1) {
                System.out.printf("%s\t", days);
            }
            System.out.println();
            for (int i = 0; i < 26; i++) {
                System.out.print("-");
            }
            System.out.println();

            if (monthInput == FEB && year % 4 == 0 && (year % 100 != 0 || year % 400 != 0)) {
                monthOfLastDay = 29;
            } else if (monthInput == FEB) {
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
            System.out.println();
        }
    }
}
