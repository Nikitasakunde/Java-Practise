import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Java_Time{
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        System.out.println("Todays date is  "+ d);

        LocalTime t = LocalTime.now();
        System.out.println("Time is " + t);

        // localdate and time 
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
    }
}