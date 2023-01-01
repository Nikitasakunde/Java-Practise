


public class tryCatch {
    public static void main(String[] args) {
        int a = 85787;
        int b =0;
 
        // without try and catch it will show error
        // int c = a/b;
        // System.out.println(c);


        // with try and catch
        try {
            int c = a/b;
            System.out.println("The result is " + c);

        } catch (Exception e1) {
            System.out.print("We failed to divide Reason is : ");
            System.out.println(e1);
        }



    }
}
