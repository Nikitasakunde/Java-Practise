import java.util.Scanner;

public class recursion {
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            int fact = n*factorial(n-1);
            return fact;
        }
    }



    public static void main(String[] args) {


        // recursive approach
        System.out.println("the factorial of 5 is " + factorial(1));


    }




}
