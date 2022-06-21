package calendar.lastCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PlanItem {
    public String detail;

    public PlanItem(String date, String detail) {
        try {
            Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(date);
        } catch (ParseException e) {
            System.out.println("yyyy-MM-dd 형식으로 입력해주세요");
        }
        this.detail = detail;
    }
}
