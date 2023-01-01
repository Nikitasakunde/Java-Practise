import java.util.Scanner;

public class factorialIterative {
    static int factorial(int t){
        if(t ==0 ||  t ==1){
            return 1;
        }else {
            int product = 1;
            for (int i = 1; i <= t; i++) {
                product *= i;
            }
            return product;
        }
    }
    public static void main(String[] args) {
        System.out.println("enter the number you want to calculate the factorial: ");
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();

        System.out.println("the factorial of " + t + " is: " + factorial(t));

    }
}
