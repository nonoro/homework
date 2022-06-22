package calendar.lastCalendar;

public class CalendarManager {

    public void manage() {
        Prompt prompt = new Prompt();
        prompt.printMenu();
        System.out.println(prompt.readFile() + "개의 일정을 불러왔습니다.");

        while (true) {
            prompt.printInputCommand();
            prompt.runPrompt();

        }
    }
}