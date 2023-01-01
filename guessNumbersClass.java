import java.util.Random;
import java.util.Scanner;


class Game{
    int userInput;
    public int number;
    public int noOfGuesses = 0;

    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }

    public int getNoOfGuesses(){
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses){
        this.noOfGuesses = noOfGuesses; 
    }


    void takeUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Guess: ");
        userInput = sc.nextInt();
        
    }

    boolean isCorrectNumber(){
        noOfGuesses++;
        if(userInput == number){
            System.out.printf("You guessed it right the number was %d and you guessed it in %d attempts\n" , number , noOfGuesses);
            return true;
        }else if(userInput < number){
            System.out.println("please guess the greater number");
        }
        else if(userInput > number){
            System.out.println("Please guess the smaller number");
        }
        return false;
    }
}


public class guessNumbersClass {
    public static void main(String[] args) {
        Game g = new Game();


        boolean b = false;
        while(!b) {
            g.takeUserInput();
            b = g.isCorrectNumber();
            System.out.println(b);

        }
    }
}
