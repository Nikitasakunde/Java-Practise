import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        boolean flag = true;
        int i =0;

        int marks[] = new int[3];
        marks[0] = 1;
        marks[1] = 2;
        marks[2] = 3;


        Scanner sc = new Scanner(System.in);


        while(flag && i < 5){
            try {
                System.out.println("Enter the index ");
                int index = sc.nextInt();
                System.out.println("marks at index is " + marks[index]);
                break;
                
            } catch (Exception e) {
               System.out.println("Invalid Index");
               i++;
            }
        }

        if(i <=5 ){
            System.out.println("Error");
        }
    }
}
