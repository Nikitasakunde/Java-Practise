


public class throws1 {
    // made by me
    public static int divide(int a , int b) throws ArithmeticException{
        int result = a/b;
        return result;

    }
   public static void main(String[] args) {
        // it uses my friend
        try {
            float c = divide(2,0);
            System.out.println(c);
        } 
        catch (Exception e) {
            System.out.println("Exception");
        }
      


   } 
}
