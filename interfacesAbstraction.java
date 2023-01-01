interface Animal{
    void walk();
    int eyes = 2;
}

class Horse implements Animal{
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}
 
public class interfacesAbstraction {
    public static void main(String[] args) {
        Horse hr = new Horse();
        hr.walk();
    }
}
