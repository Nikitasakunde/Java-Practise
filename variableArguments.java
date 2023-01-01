public class variableArguments {
    // static int sum(int a , int b){
    //     int c = a+b;
    //     return c;
    // }

    static int sum(int x,int ...arr){
        // available as array 
        int result = x;
        for (int a: arr) {
            result += a;
        }
        return result;
    }


    static int avg(int ...arr){
        int result = 0;
        for (int i : arr) {
            result += i;

        }
        return result/arr.length;
    }
    public static void main(String[] args) {
        // System.out.println("the sum is : " + sum(78,78));
        System.out.println("The average of numbers is: "+avg(10,20,30));




    }
}
