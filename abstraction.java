// abstraction - hiding the implementation details and showing only the functionality



abstract class Animal{
    abstract void walk();
    public void eats(){
        System.out.println("Animal eats");
    }
}


class Horse extends Animal{
    public void walk(){
        System.err.println("walks on 4 legs");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("walks on 2 legs");
    }
}

public class abstraction {
    public static void main(String[] args) {
        Horse hr = new Horse();
        hr.walk();
        hr.eats();

        Chicken ck = new Chicken();
        ck.walk();
        ck.eats();
    }
}
