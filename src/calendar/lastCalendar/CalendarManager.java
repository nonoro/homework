package calendar.lastCalendar;

public class CalendarManager {

    public void manage() {
        Prompt run = new Prompt();
        Prompt prompt = new Prompt();
        prompt.printMenu();
        while (true) {
            System.out.println("명령 (1, 2, 3, 4, h, q)");
//            run.readFile();
            System.out.print(run.ARROW);
            run.runPrompt();

        }
    }
}