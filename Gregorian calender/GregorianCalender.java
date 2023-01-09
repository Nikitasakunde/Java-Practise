import java.sql.Time;
import java.util.TimeZone;

public class GregorianCalender {
    public static void main(String[] args) {
        // GregorianCalender cal = new GregorianCalender();
        // System.out.println(cal.isLeapYear);


        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[100]);
        System.out.println(TimeZone.getAvailableIDs()[200]);


        System.out.println(TimeZone.getDefault());



    }
}
