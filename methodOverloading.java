public class methodOverloading {
    // static void change(int a){
    //     a =76;
    // }




    // static void change2(int arr[]){
    //     arr[0] = 67;
    // }



    // static void tellJoke(){
    //     System.out.println("Hii i am nikita");
    // }




    static void foo(){
        System.out.println("good morning girl");
    }


    static void foo(int a){
        System.out.println("good morning " + a  + " bro");
    }

    static void foo(int a, int b){
        System.out.println("good morning " + a  + " bro "  +  b + " girl");
    }
    public static void main(String[] args) {
        // method overloading
        // tellJoke();




        // changing the integer
        // int x = 45;
        // change(x);
        // System.out.println("x after runnig change is: " + x);




        // // changing the array
        // int marks[] = {12,34,56,78,90};
        // change2(marks);
        // System.out.println("x after runnig change is: " + marks[0]);






        // method overloading
        foo();
        foo(10); //argumets are actual
        foo(10 , 67);


    }
}
