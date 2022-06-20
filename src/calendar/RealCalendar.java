package calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class RealCalendar {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String ARROW = "> ";
    private static final String INPUT_YEAR = "원하는 연도를 입력하세요.  \n YEAR" + ARROW;
    private static final String INPUT_MONTH = "원하는 달을 입력하세요.  \n MONTH" + ARROW;
    private static final String[] WEEKDAY = {"SU", "MO", "TU", "WE", "TH", "FR", "SA"};
    private static final int[] LAST_DAY = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int[] LEAP_YEAR_LAST_DAY = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static final String INPUT_INT_ERROR = "숫자를 입력해 주세요";
    public static Map<String, List<String>> planMap = new HashMap<>();


    public static void main(String[] args) {
        Prompt prompt = new Prompt();
        prompt.printMenu();
        while (true) {
            System.out.println("명령 (1, 2, 3, 4, h, q)");
            System.out.print(ARROW);
            runPrompt();

        }
    }

    private static void runPrompt() {
        Prompt prompt = new Prompt();
        Scanner cmd = new Scanner(System.in);
        String input = cmd.next();
        if (input.equals("1")) {
            cmdResisterPlanPrompt();
        } else if (input.equals("2")) {
            cmdSearchPlanPrompt();
        } else if (input.equals("3")) {
            watchCalendar();
        } else if (input.equals("4")) {
            showRegisteredPlan();
        } else if (input.equals("h")) {
            prompt.printMenu();
        } else if (input.equals("q")) {
            exitNumbers("q");
        }
    }

    private static void showRegisteredPlan() {
        Iterator<String> keys = planMap.keySet().iterator();
        while (keys.hasNext()) {
            String key = keys.next();
            System.out.println("KEY : " + key);
        }
    }

    private static void cmdResisterPlanPrompt() {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("[일정 등록] 날짜를 입력하세요.");
            System.out.print(ARROW);
            String date = scanner.next();
            try {
               Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(date);
            } catch (ParseException e) {
                System.out.println("yyyy-MM-dd 형식으로 입력해주세요");
                continue;
            }
            System.out.println("일정을 입력하세요");
            System.out.print(ARROW);
            scanner.nextLine();        //  이걸 안쓰면 위에 String date = scanner.next();으로 입력했던 값이 입력버퍼에 남게되고 그 남아있는 데이터를 가져가서 사용하므로 nextLine()을 입력하지 않았는데도 다음으로 넘어간다
                                       //   따라서 쓰기전에 scanner.nextLine()을 한번 사용해서 입력버퍼를 비워준다
            String plan = scanner.nextLine();
            List<String> list = getPlan(date);
            if (list == null) {
                list = new ArrayList<>();
            }

            list.add(plan);
            System.out.println("일정이 등록되었습니다.");
            registerPlan(date, list);
            break;
        }
    }

    private static void registerPlan(String strDate, List<String> plan) {
            planMap.put(strDate, plan);
    }

    private static void cmdSearchPlanPrompt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("[일정 검색] 날짜를 입력하세요.");
        while (true) {
            String date = scanner.next();
            try {
                Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(date);
            } catch (ParseException e) {
                System.out.println("yyyy-MM-dd 형식으로 입력해주세요");
                continue;
            }
            List<String> plans = getPlan(date);
            if (plans != null) {
                System.out.print(ARROW);
                System.out.println(plans.size()+"개의 일정이 있습니다.");
                int count = 0;

                for (String plan : plans) {
                    count++;
                    System.out.println(count + "." + plan);
                }
                break;
            } else {
                System.out.println("등록된 일정이 없습니다.");
                break;
            }
        }
    }

    private static List<String> getPlan(String date) {
        return planMap.get(date);
    }

    private static void watchCalendar() {
        int year = inputYear();
        int month = inputMonth();
        calendarTitle(year, month);
        weekdays();
        boundary();
        calendar(year, month);
        System.out.println();
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
        if (number.equals("q")) {
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