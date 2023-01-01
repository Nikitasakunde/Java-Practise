import java.util.Random;
import java.util.Scanner;


public class gameRock {
    public static void main(String[] args) {
    
        // 0 for Rock
        // 1 for Paper
        // 2 for Scissor


        Scanner sc = new Scanner(System.in);
        System.err.println("Enter your choice");
        System.out.println("0 for Rock , 1 for paper and 2 for scissor");
        int userChoice = sc.nextInt();

        Random random = new Random();
        int computerChoice = random.nextInt(3);

        if(userChoice == computerChoice){
            System.out.println("Draw");
        }else if(userChoice == 0 && computerChoice == 2 || userChoice == 2 && computerChoice == 1 || userChoice == 1 && computerChoice == 0){
            System.out.println("You Win!");
        }
        else{
            System.out.println("Computer Win!");
        }

        System.out.println("computer choice was: " + computerChoice);

    }
}
