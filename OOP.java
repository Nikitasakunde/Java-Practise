



class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println("the name of Student is: " + this.name);
        System.out.println("the age of student is: " + this.age);

    }


    // constuctors
    Student(String name , int age){
        this.name = name;
        this.age = age;
    }
}


public class OOP {
    public static void main(String[] args) {
        Student s1 = new Student("Nikita" , 20);
        s1.printInfo();
    }
}
