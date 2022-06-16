package calendar;

import java.util.Scanner;

public class RealCalendar {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String PROMPT = "> ";
    private static final String INPUT_YEAR = "원하는 연도를 입력하세요. (-1을 누르면 프로그램을 종료합니다.) \n YEAR" + PROMPT;
    private static final String INPUT_MONTH = "원하는 달을 입력하세요. (-1을 누르면 프로그램을 종료합니다.) \n MONTH" + PROMPT;
    private static final String[] WEEKDAY = {"SU", "MO", "TU", "WE", "TH", "FR", "SA"};
    private static final int[] LAST_DAY = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int[] LEAP_YEAR_LAST_DAY = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static final String INPUT_INT_ERROR = "숫자를 입력해 주세요";


    public static void main(String[] args) {
        while (true) {
            int year = inputYear();
            int month = inputMonth();
            calendarTitle(year, month);
            weekdays();
            boundary();
            calendar(year, month);
            System.out.println();
        }
    }


    private static boolean isLeapYear(int year) {
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    private static void calendar(int year, int month) {
        int day;
        int firstDayOfMonth;

        if (isLeapYear(year)) {
            day = (year - 1) * 365 + (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;
            for (int i = 0; i < month - 1; i++) {
                day += LEAP_YEAR_LAST_DAY[i];
            }
            firstDayOfMonth = (day % 7) + 1;

            for (int i = 0; i < firstDayOfMonth; i++) {
                if (firstDayOfMonth == 7) {
                    break;
                }
                printBlank();
            }
            for (int i = 1; i <= LEAP_YEAR_LAST_DAY[month - 1]; i++) {
                System.out.printf("%d\t", i);
                firstDayOfMonth++;
                if (firstDayOfMonth % 7 == 0) {
                    printNewLine();
                }
            }
            if (firstDayOfMonth % 7 != 0) {
                printNewLine();
            }
        } else {
            day = (year - 1) * 365 + (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;
            for (int i = 0; i < month - 1; i++) {
                day += LAST_DAY[i];
            }
            firstDayOfMonth = (day % 7) + 1;


            for (int i = 0; i < firstDayOfMonth; i++) {
                if (firstDayOfMonth == 7) {
                    break;
                }
                printBlank();
            }

            for (int i = 1; i <= LAST_DAY[month - 1]; i++) {
                System.out.printf("%d\t", i);
                firstDayOfMonth++;


                if (firstDayOfMonth % 7 == 0) {
                    printNewLine();
                }
            }
            if (firstDayOfMonth % 7 != 0) {
                printNewLine();
            }
        }

    }

    private static void printBlank() {
        System.out.print("\t");
    }

    private static void printNewLine() {
        System.out.println();
    }


    private static void weekdays() {
        for (String weekdays : WEEKDAY) {
            System.out.printf("%s\t", weekdays);
        }
        printNewLine();
    }

    private static void boundary() {
        for (int i = 0; i < 26; i++) {
            System.out.print("-");
        }
        printNewLine();
    }

    private static void calendarTitle(int year, int month) {
        System.out.printf("      <%d년 %d월>\n", year, month);
    }

    private static int inputYear() {
        System.out.print(INPUT_YEAR);
        return inputInt();
    }

    private static int inputMonth() {
        while (true) {
            System.out.print(INPUT_MONTH);
            int number = inputInt();
            if (number > 12 || number < 1) {
                System.out.println("잘못된 입력입니다. 1 ~ 12 까지의 숫자 중 하나를 입력해 주세요");
                continue;
            }
            return number;
        }
    }

    private static void exitNumbers(String number) {
        if (number.equals("-1")) {
            System.out.println("Bye Bye");
            System.exit(0);
        }
    }


    private static int inputInt() throws IllegalArgumentException {
        while (true) {
            String input = SCANNER.next();
            exitNumbers(input);
            try {
                return Integer.parseInt(input);
            } catch (IllegalArgumentException e) {
                System.out.println(INPUT_INT_ERROR);
            }
        }
    }
}
