import java.io.PrintStream;
import static java.lang.System.out;
import java.util.Scanner;

public class Event {
    private String name;
    private String organization;
    private int priorityLv;
    private String details;

    public Event(String nameX, String organizationX, int PriorityLvX, String detailsX){
        Scanner input = new Scanner(System.in);
        out.println("What's this task called?");
        name = input.nextLine();
        out.println("Who is this task for?");
        organization = input.nextLine();
        out.println("On a scale of 1 to ten, how important is this task?");
        priorityLv = input.nextInt();
        input.nextLine();
        out.println("Are there any other details I should record for you?");
        input.nextLine();
    }

    public String toString(){
            return "Task name: " + name +
                    "\n Organization: " + organization +
                    "\n Priority level: " + priorityLv +
                    "\n Details: " + details +
                    "\n =========================================================";

    }
}
