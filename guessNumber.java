import java.util.Random;
import java.util.Scanner;

public class guessNumber {
    


    public static void main(String[] args) {

        // guess the number form 0 to 100

        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the number");
        int userInput = sc.nextInt();

        Random random = new Random();
        int ComputerInput = random.nextInt(100);

        if(userInput == ComputerInput){
            System.out.println("You guessed it right");
        }else if(userInput > ComputerInput){
            System.out.println("Please guess the smaller number");
        }
        else{
            System.out.println("Please guess the larger number");
        }

        // System.out.println("The computer choice was : " + ComputerInput);
    }
}
