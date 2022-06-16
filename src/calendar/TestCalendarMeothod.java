package calendar;

import java.util.Scanner;

public class TestCalendarMeothod {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String PROMPT = "> ";
    private static final String INPUT_YEAR = "년도를 입력하세요. \n YEAR" + PROMPT;
    private static final String INPUT_MONTH = "달을 입력하세요. \n MONTH" + PROMPT;
    private static final String INPUT_WEEKDAY = "첫번째 요일을 입력하세요. (SU, MO, TU, WE, TH, FR, SA)\n WEEKDAY" + PROMPT;
    private static final String INPUT_WEEKDAY_ERREOR = "(SU, MO, WE, TH, FR, SA) 이 값들 중 하나를 입력해주세요.";
    private static final String[] WEEKDAY = {"SU", "MO", "TU", "WE", "TH", "FR", "SA"};
    private static final int[] LAST_DAY = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int[] LEAP_YEAR_LAST_DAY = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static final String INPUT_INT_ERROR = "숫자를 입력해 주세요";


    public static void main(String[] args) {
        int year = inputYear();
        int month = inputMonth();
        String weekday = inputWeekday();
        calendarTitle(year, month);
        weekdays();
        boundary();
        parseDay(weekday);
        calendar(year, month - 1, weekday);
    }

    private static int parseDay(String week) {
        if (week.equals("su")) {
            return 0;
        } else if (week.equals("mo")) {
            System.out.print("  ");
            return 1;
        } else if (week.equals("tu")) {
            System.out.print("\t");
            return 2;
        } else if (week.equals("we")) {
            System.out.print("      ");
            return 3;
        } else if (week.equals("th")) {
            System.out.print("\t\t");
            return 4;
        } else if (week.equals("fr")) {
            System.out.print("          ");
            return 5;
        } else if (week.equals("sa")) {
            System.out.print("\t\t\t");
            return 6;
        }
        return 0;
    }

    private static boolean isLeapYear(int year) {
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    private static void calendar(int year, int month, String weekday) {
        int weekdayNumber = parseDay(weekday);
        int count = 7 - weekdayNumber;
        int delim = (count < 7) ? count : 0;
        for (int i = 1; i <= count; i++) {
            System.out.printf("%d\t", i);
        }
        printNewLine();

        if (isLeapYear(year)) {
            for (int i = count + 1; i <= LEAP_YEAR_LAST_DAY[month]; i++) {
                System.out.printf("%d\t", i);
                if (i % 7 == delim) {
                    printNewLine();
                }
            }
        } else {
            for (int i = count + 1; i <= LAST_DAY[month]; i++) {
                System.out.printf("%d\t", i);
                if (i % 7 == delim) {
                    printNewLine();
                }
            }
        }
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
        System.out.printf("      <%4d년 %3d월>\n", year, month);
    }

    private static int inputYear() {
        System.out.print(INPUT_YEAR);
        return inputInt();
    }

    private static int inputMonth() {
        System.out.print(INPUT_MONTH);
        return inputInt();
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

    private static String inputWeekday() {
        while (true) {
            System.out.print(INPUT_WEEKDAY);
            try {
                String inputWeekday = SCANNER.next();
                exitNumbers(inputWeekday);
                if (isNotValidateWeekday(inputWeekday)) {
                    throw new IllegalArgumentException(INPUT_WEEKDAY_ERREOR);
                }
                return inputWeekday;
            } catch (IllegalArgumentException e) {
                System.out.println(INPUT_WEEKDAY_ERREOR);
                printNewLine();
            }
        }
    }

    private static boolean isNotValidateWeekday(String inputWeekday) {
        for (String weekday : WEEKDAY) {
            if (inputWeekday.equalsIgnoreCase(weekday)) {
                return false;
            }
        }
        return true;
    }
}
