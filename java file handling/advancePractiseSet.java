import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

// write a program to generate a multiplication talbe and write it to file.txt table by java program


public class advancePractiseSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number you want to create a multiplication table : " );
        int a = sc.nextInt();

      

        try {
            FileWriter f = new FileWriter("file1/file2.txt");
            for (int i = 1; i <= 10; i++) {
                f.write(a + " X "+ i + " = " + a*i + " " );
            }
            
            f.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
