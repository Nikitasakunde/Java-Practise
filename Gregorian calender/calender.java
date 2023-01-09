import java.util.Calendar;
import java.util.TimeZone;

public class calender {
    public static void main(String[] args) {
        Calendar d = Calendar.getInstance(TimeZone.getTimeZone("Asia/Calcutta"));
        System.out.println(d.getCalendarType());
        System.out.println(d.getTimeZone().getID());
    }
}
