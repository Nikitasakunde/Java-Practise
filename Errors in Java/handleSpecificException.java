import java.util.Scanner;

public class handleSpecificException {
    public static void main(String[] args) {
        int arr[] = new int[4];
        arr[0] =78;
        arr[1] =57;
        arr[2] =89;
        arr[3] =32;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter arry index");
        int ind = sc.nextInt();


        System.out.println("Enter the number you wnat to divide teh value with: ");
        int number = sc.nextInt();


        try {
            System.out.println("The value at array index enterd is  "+ arr[ind]);
            System.out.println("The value of arr[index]/number is "  + arr[ind]/number);
        } 
        catch (ArithmeticException e) {
            System.out.println("Arithmetic exception occured");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException exception occured");
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println("some other exception occured");
            System.out.println(e);
        }
     

    }
}
