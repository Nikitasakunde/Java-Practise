import java.util.Scanner;

class MyException extends Exception{
    public String toString(){
        return "I am toString method()";
    }

    public String getMessage(){
        return "I am getMessage method()";
    }
}

public class exceptionClass{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a ");
        int a = sc.nextInt();

        if(a<9){
            try{
                throw new MyException();
            }
            catch(Exception e){
                System.out.println(e.toString());
                // System.out.println(e.getMessage());
                System.out.println(e);
                e.printStackTrace();
                System.out.println("finished");
            }
        }
    }
}