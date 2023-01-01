import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {

        //pattern

        // for (int i = 4; i > 0; i-- ){
        //     for (int j = 0; j < i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();

        // }

        // problem 2 fist three even numbers sum-
        // int n = 4;  
        // int sum =0;

        // for (int i = 0; i < n; i++) {
        //     sum = sum + (2*i);

        // }
        // System.out.println("sum of even numbers is: "+ sum);
        // while (n%2== 0  ) {
        //     System.out.println(sum+=n);
        //     n++;
        // }



        // problem 3 . multiplication table of given number
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the the number: ");
        int t =sc.nextInt();

        for (int i = 10; i >= 1; i--) {
            System.out.println(t + " X "+ i + " = " + t*i);
        }

    }
}
