import java.util.Scanner;

public class practiseSet {
    public static void main(String[] args) {
        //1. write a program to enccrypt 

        // encrypt
        // char grade = 'B';
        // grade += 8;
        // System.out.println(grade);


        // // decrypt the grade
        // grade -= 8;
        // System.out.println(grade);


        // 2 user enterde number is greater or not
        int m = 10;
        System.out.println("Enter a number: ");
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        if(a>m){
            System.out.println(a + " is greater");
        } 
        else{
            System.out.println(m + " is greater");
        }

    }
}
