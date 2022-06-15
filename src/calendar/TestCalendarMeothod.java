package calendar;

import java.util.Scanner;

public class TestCalendarMeothod {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String PROMPT = "> ";
    private static final String INPUT_YEAR = "년도를 입력하세요. \n YEAR" + PROMPT;
    private static final String INPUT_MONTH = "달을 입력하세요. \n MONTH" + PROMPT;
    private static final String INPUT_WEEKDAY = "첫번째 요일을 입력하세요. (SU, MO, WE, TH, FR, SA)\n WEEKDAY" + PROMPT;
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
        calendar(month - 1, weekday);
    }

    private static int parseDay(String week) {
        if (week.equals("su")) {
            return 0;
        } else if (week.equals("mo")) {
            System.out.printf("\t");
        } else if (week.equals("tu")) {
            System.out.printf("\t\t");
        } else if (week.equals("we")) {
            System.out.printf("\t\t\t");

        } else if (week.equals("th")) {
            System.out.printf("\t\t\t\t");

        } else if (week.equals("fr")) {
            System.out.printf("\t\t\t\t\t");

        } else if (week.equals("sa")) {
            System.out.printf("\t\t\t\t\t\t");
        }
        return 0;
        }



    private static void calendar(int month, String weekday) {
        int weekdayNumber = Integer.parseInt(weekday);
        for (int i = weekdayNumber; i <= LAST_DAY[month]; i++) {
            System.out.printf("%d\t", i);
            if (weekdayNumber == 1) {
                for (int j = 1; j <= weekdayNumber; j++) {

                }
                }
            }
        }
    }


    private static void weekdays() {
        for (String weekdays : WEEKDAY) {
            System.out.printf("%s\t", weekdays);
        }
        System.out.println();
    }

    private static void boundary() {
        for (int i = 0; i < 26; i++) {
            System.out.print("-");
        }
        System.out.println();
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
        int number;
        number = inputInt();
        return number;
    }


    private static int inputInt() throws IllegalArgumentException {
        while (true) {
            String input = SCANNER.next();
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

                if (isNotValidateWeekday(inputWeekday)) {
                    throw new IllegalArgumentException(INPUT_WEEKDAY_ERREOR);
                }
                return inputWeekday;
            } catch (IllegalArgumentException e) {
                System.out.println(INPUT_WEEKDAY_ERREOR);
                System.out.println();
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
