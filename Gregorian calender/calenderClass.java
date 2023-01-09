import java.util.Calendar;

public class calenderClass{
    public static void main(String[] args) {
        Calendar a = Calendar.getInstance();
        System.out.println(a.getTime());


        // System.out.println(a.getTimeZone());

        // it will give the date of the day
        System.out.println("date is " + a.get(Calendar.DATE));


        // it will give the hour 
        System.out.println("Hour is " +a.get(Calendar.HOUR));
        System.out.println("second is " +a.get(Calendar.SECOND));

        // it will give the hour of the day and minutes are
        System.out.println("Hour of the day is " +a.get(Calendar.HOUR_OF_DAY) + " Minutes are " + a.get(Calendar.MINUTE));


        //  Today's Time is 

        System.out.println("Todays time is " + a.get(Calendar.HOUR_OF_DAY) + ":"+ a.get(Calendar.MINUTE) +":"+ a.get(Calendar.SECOND));




    }
}