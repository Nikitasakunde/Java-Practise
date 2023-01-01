package calc;


class Calculator{
    public void calculate(int a , int b) {
        System.out.println("sum is " + a+b);
    }
}

class ScCalculator{
    public void calculate(int a , int b) {
        System.out.println("sin sum of a+b is " + Math.sin(a+b));
    }
}

class HybridCalculator{
    public void calculate(int a , int b) {
        System.out.println("cos sum of a+b is " + Math.cos(a+b));
    }
}
public class problem1 {
    public static void main(String[] args) {
        System.out.println("this is main method");
    }
}
