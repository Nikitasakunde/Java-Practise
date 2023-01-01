public class arrayPractise {
    public static void main(String[] args) {
        // // array of 5 float and calculate their sum
        // float arr[] = {3.7f, 7.667f, 45.68f , 576.48f, 56.78f};
        // float sum =0;
        // for (int i = 0; i < arr.length; i++) {
        //     sum += arr[i];
        // }
        // System.out.println("The value of sum is: " + sum);



        // 2 write a program to find wheather the given array is present or not
        // int m= 10;
        // int arr[] = {56,49,30,36,8598,10};
        // boolean isin = false;
        // for (int i = 0; i < arr.length; i++) {
        //     if(m==arr[i]){
        //         isin = true;
        //         break;
        //     }

        // }
        // if(isin){
        //     System.out.println("element is present in array");
        // }
        // else{
        //     System.out.println("element is not present in array");
        // }



        // 3. calculate the average marks of students using for each loop using array
        // int m[] = {18,29,57,79,80,90,78};
        // int sum = 0;
        // for (int element : m) {
        //     sum += element;
        // }
        // System.out.println("average of marks is : " + sum/m.length);


        // 4. reverse an array
        // int marks[] = {56,47,78,89,20,57,45};
        // for (int i = marks.length-1; i >= 0; i--) {
        //     System.out.print(marks[i] + " ");
        // }



        // 5. maximum of element in array
        // int marks[] = {56,47,78,89,5678,20,57,45};
        // int max = 0;
        // for (int i = 0; i < marks.length; i++) {
        //     if(marks[i] > max){
        //         max = marks[i];
        //     }
        // }
        // System.out.println("maximum element is: " + max);

        // 5. maximum of element in array
        


        // 6. find wheather the array is sorted or not
        int marks[] ={1,2,3,4,5,6,7,9};
        boolean isSorted= true;
        for (int i = 0; i < marks.length-1; i++) {
            if(marks[i] > marks[i+1]){
                isSorted = false;
                break;
            }
        
        }

        if(isSorted){
            System.out.println("yes array is sorted ");
        }
        else{
            System.out.println("no array is not sorted");
        }
        
        
    }
}