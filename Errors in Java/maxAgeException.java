import java.util.Scanner;


class AgeException extends Exception{
    public String age(){
        return "this is age method";
    }
}


public class maxAgeException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age");
        int age = sc.nextInt();

        if(age > 125){
            try {
                // throw new AgeException();
                throw new ArithmeticException("Age is not valid");
            }
            catch (Exception e) {
                System.out.println(e);
                e.printStackTrace();
            }
        }
    }
}
