import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.io.PrintStream;
import static java.lang.System.out;

public class writer {
    Date today;
    String pattern;
    SimpleDateFormat Pattern;
    PrintStream x;
    PrintStream console;

    public writer() throws FileNotFoundException{
        //formatting the date
        today = new Date();
        pattern = "yyyy-MM-dd";
        Pattern = new SimpleDateFormat(pattern);
        Pattern.format(today);
        //creating a file to read the date from.
        x = new PrintStream(new File(today + " TASKS.txt"));
        console = System.out;

    }

    public void setOutputConsole(PrintStream console){
        System.setOut(console);
    }
    public void setOutputTasklist(PrintStream tasklist){
        System.setOut(tasklist);

}
}
