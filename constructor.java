class Base{
    Base(){
        System.out.println("I am base constructor");
    }
}
class Derived extends Base{
    Derived(){
        System.out.println("I am Derived constructor");
    }
}

class Derived1 extends Derived{
    Derived1(){
        System.out.println("I am derived1 constructor");
    }
} 

public class constructor {
    public static void main(String[] args) {
        Derived1 d = new Derived1();

    }
}
