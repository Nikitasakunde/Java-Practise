
class Student{
    String name;
    static String school;

}

public class staic {
    public static void main(String[] args) {

        // we can directly access the static keyword
        Student.school ="MESA";
        
        Student s1 = new Student();
        s1.name = "nikita";

        System.out.println(Student.school);

    }
}
