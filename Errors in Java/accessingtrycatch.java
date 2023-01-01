import java.util.Scanner;

// Nested Try catch


public class accessingtrycatch {
    public static void main(String[] args) {

        int arr[] = new int[4];
        arr[0] =78;
        arr[1] =57;
        arr[2] =89;
        arr[3] =32;

        Scanner sc = new Scanner(System.in);


        boolean flag = true;

        while (flag) {
            System.out.println("enter the index you want to access ");
            int ind = sc.nextInt();
            try {
                try {
                    System.out.println("array at index entered is "+ arr[ind]);
                    flag = false;
        
                } 
                catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("ArrayIndexOutOfBoundsException is occured");
                    System.out.println("exception at level 2");
                }
    
            } 
            catch (Exception e) {
                System.out.println("Exception in level 1 " + e);
            } 
        }
       
    }
}