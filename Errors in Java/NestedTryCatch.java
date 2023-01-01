// Nested Try catch


public class NestedTryCatch {
    public static void main(String[] args) {
        try {
        
            
            try {
                int arr[] = new int[4];
                arr[0] =78;
                arr[1] =57;
                arr[2] =89;
                arr[3] =32;

                System.out.println("array at index 4 is "+arr[4]);

                
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException is occured");
                System.out.println("exception at level 2");
            }

        } catch (Exception e) {
            System.out.println("Exception in level 1 " + e);
        }
    }
}
