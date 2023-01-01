
class Employee{
    int id;
    String name;
    int salary;

    public void printName(){
        System.out.println("my id is " + id);
        System.out.println("my name is " + name);
    }

    public int getSalary(){
        return salary;
    }
}

public class class1 {
    public static void main(String[] args) {
        Employee nikita = new Employee();
        Employee john = new Employee();

        // setting properties
        nikita.id = 21;
        nikita.name = "nikita";
        nikita.salary = 89000;
        // System.out.println(nikita.id);
        // System.out.println(nikita.name);
        john.id = 22;
        john.name = "john";
        john.salary = 45000;


        nikita.printName();
        john.printName();
        john.getSalary();
        // System.out.println("the salary of john is " +john.getSalary());
        // System.out.println("the salary of nikita is " +nikita.getSalary());




    }
}
