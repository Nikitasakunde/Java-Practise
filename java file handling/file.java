import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class file{
    public static void main(String[] args) {
    

        // create a new file in java
        // File f = new File("Nikita.txt");

        // try {
        //     f.createNewFile();
        // } catch (Exception e) {
        //     System.out.println("Unable to create a new file");
        //    System.out.println(e);
        // }




        // write in java file
        
        // try {
        //     FileWriter myFileWriter = new FileWriter("Nikita.txt");
        //     myFileWriter.write("Nikita is a good girl");
        //     myFileWriter.close();

        // } 
        // catch (Exception e) {
        //     System.out.println("Unble to write into the file");
        //     System.out.println(e);
        // }


        // file reading
        // File f = new File("Nikita.txt");
        // try {
        //    Scanner sc = new Scanner(f);
        //    while (sc.hasNextLine()) { 
        //         String line = sc.nextLine();
        //         System.out.println(line);
        //    }
        //    sc.close();
        // } catch (FileNotFoundException e) {
        //     e.printStackTrace();
        // }

        


        //  how to file delete
        File f = new File("file.txt");
        if(f.delete()){
            System.out.println("you have deleted the file name " + f.getName());
        }
        
    }
}