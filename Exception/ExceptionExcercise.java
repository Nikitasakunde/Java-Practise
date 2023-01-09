

class newException extends Exception{
    
}
public class ExceptionExcercise{
    public static float divid(int a , int b) throws ArithmeticException{
        int c = a/b;
       return c;
    }
    public static void main(String[] args) {
    
       try {
        float c = divid(50, 2);
        System.out.println(c);
        
       } catch (ArithmeticException e) {
        System.out.println("HAHA Arithmetic Exception");
       }
       catch (IllegalArgumentException e){
        System.out.println("HEHE IllegalArgument Exception");
       }
       catch (Exception e){
        System.out.println(e);
       }
    }
}