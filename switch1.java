import java.util.Scanner;

public class switch1{
    public static void main(String[] args) {
        System.out.println("Enter your age: ");
        Scanner sc= new Scanner(System.in);
        int age = sc.nextInt();

        switch (age) {
            case 19:
                System.out.println("you are 19");
                break;
        
            default:
                System.out.println("you are of unknown age");
                break;
        }
    }
}