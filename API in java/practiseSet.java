import java.sql.Date;
import java.util.Date;
import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;

public class practiseSet {
    public static void main(String[] args) {

        // practise set question no 1
        // ArrayList<String> ar = new ArrayList<>();
        // ar.add("Student 1");
        // ar.add("Student 2");
        // ar.add("Student 3");
        // ar.add("Student 4");
        // ar.add("Student 5");
        // ar.add("Student 6");
        // ar.add("Student 7");
        // ar.add("Student 8");
        // ar.add("Student 9");
        // ar.add("Student 10");


        // for (Object o : ar) {
        //     System.out.println(o);
        // }


        // 2 .use the date class in java that will print in the following format
        // Date d = new Date();
        // System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());


        // 5. create a set and store the duplicate elements in that set

        // HashSet<Integer> s = new HashSet<>();

        // s.add(3);
        // s.add(4);
        // s.add(5);
        // s.add(5);
        // s.add(8);
        // s.add(3);

        // System.out.println(s);

        // Repeat 2 using calender class
        // Calendar cal = Calendar.getInstance();
        // System.out.println(cal.get(Calendar.HOUR_OF_DAY) +":" + cal.get(Calendar.MINUTE) +":" + cal.get(Calendar.SECOND));



        // Repeat 2 using java.time api
        // LocalDateTime lt = LocalDateTime.now();
        //    System.out.println(lt);
    
        //    DateTimeFormatter df = DateTimeFormatter.ofPattern("H:mm:ss");
        //    String time = lt.format(df);
        //    System.out.println(time);
    }
}
