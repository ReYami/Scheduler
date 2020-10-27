import java.io.FileNotFoundException;
import static java.lang.System.out;
import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;


public class Scheduler {
    public static void main(String [] args) throws FileNotFoundException, FileAlreadyExistsException {
        Scanner text = new Scanner(System.in);
        String check;
        boolean active = true;
        writer Scribe = new writer();
        out.println("Hey, I'll schedule some events for you");
        //its really more of a tasklist right now but whatever.
        while(active == true){
            Event base = new Event("", "", 0, "");
            out.println("is there anything else?");
            check = text.nextLine();
            if(check.equals("yes")){
                active = true;
                Scribe.setOutputTasklist(Scribe.x);
                out.print(base);
                Scribe.setOutputConsole(Scribe.console);
                out.println("Right then, Whats next?");
            }else{
                active = false;
                Scribe.setOutputTasklist(Scribe.x);
                out.print(base);
                Scribe.setOutputConsole(Scribe.console);
                out.println("I've put the tasks in a document for you, see you tomorrow!");
                break;
            }
        }

    }
}
