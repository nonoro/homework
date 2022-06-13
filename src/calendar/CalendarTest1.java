package calendar;

public class CalendarTest1 {

    public static void main(String[] args) {
        System.out.println("Hello. Calendar");
        String[] day1 = {"일", "월", "화", "수", "목", "금", "토"};
        for (int i = 0; i < day1.length; i++) {
            System.out.printf("%s\t", day1[i]);
        }
        System.out.println();
        for (int i = 0; i < 26; i++) {
            System.out.print("-");
        }
        System.out.println();
        Integer[] day2 = new Integer[28];
        for (int i = 0; i < 28; i++) {
            day2[i] = i + 1;
            System.out.printf("%d\t", day2[i]);

            if (i == 6 || i == 13 || i == 20) {
                System.out.println();
            }
        }
    }
}


