// use built-in package in java to write a class which displays a message after taking input from user
package input;

import java.util.Scanner;

class Msg{

    public void printMsg() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the String you want to: ");
        String t = sc.nextLine();
        System.out.println("Your entered String is: " + t);
        
    }
    
}


public class problem2 {
    public static void main(String[] args) {
        Msg m = new Msg();
        m.printMsg();
    }
}
