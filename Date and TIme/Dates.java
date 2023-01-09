import java.util.Date;

public class Dates {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
        

        // methods are all depricated 
        System.out.println("Time is " + d.getTime());
        System.out.println("date is " + d.getDate());
        System.out.println("Hours are "+d.getHours());
        System.out.println("minutes are "+d.getMinutes());
        System.out.println("Year is "+d.getYear());



    }
}
