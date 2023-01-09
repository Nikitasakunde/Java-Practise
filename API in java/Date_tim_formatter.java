import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date_tim_formatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);


        // formatter will print dd/MM/yyyy in this pattern
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy  -- E  H:m a");
        // d will print date 
        // M will print month 
        // y will print year 
        // E will print the text of the day
        // a will print the am or pm
        // H will print the hour
        // m will print the minutes


        // it will print the date which is formated by dt
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;
        
        String mydate = dt.format(df);
        String mydate2 = dt.format(df2);

        System.out.println(mydate);
        System.out.println(mydate2);

    }
}
