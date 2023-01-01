

abstract class Parent{
    public Parent(){
        System.out.println("I am parent constructor");
    }

    public void sayhello() {
        System.out.println("Hello");
    }

    abstract public void greet();
}

class Child extends Parent{

    public void greet(){
        System.out.println("Good Monrning");
    }

   
}



public class abstract1 {
    public static void main(String[] args) {
               
    }
}
