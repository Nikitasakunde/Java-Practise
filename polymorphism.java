class Student{
    String name;
    int age;

    public void printInfo(String name) {
        System.out.println(name);
    }

    public void name() {
        
    }
}


public class polymorphism {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.printInfo("Nikita");
    }
}
 