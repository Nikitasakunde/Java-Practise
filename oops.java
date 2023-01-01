// class pen{
//     String color;
//     String type;

//     public void printColor(){
//         System.out.println(this.color);
//     }
// }


class Student{
    String name;
    Number age;
    
    
    public void studentData(){
        System.out.println("My name is " + this.name  + " and My age is " + this.age);
    }
    Student(){
        System.out.println("Construcor called");
    }
}

public class oops {
    
    public static void main(String[] args) {
        // pen pen1 = new pen();
        // pen1.color = "red"; 
        // pen1.type = "black";

        // pen1.printColor();



        



        // print student name age using class
        Student std = new Student();
        std.name = "Nikita";
        std.age = 19;

        std.studentData();

    }
}
