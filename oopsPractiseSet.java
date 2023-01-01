class Employee{
    String name;
    int salary;


    public int getSalary(){
        return salary;
    }

    public void getName(){
       System.out.println("the name of em is: " + this.name);

    }

    // public String setName(String n){
    //     n = name;
    //     return n;
    // }

    

}



public class oopsPractiseSet {
    public static void main(String[] args) {
        Employee em = new Employee();
        em.salary = 90000;
        em.name = "haris";

        Employee niks = new Employee();
        niks.salary = 80000;
        niks.name = "Nikita";
        



        System.out.println("haris salary is "+ em.getSalary());
        System.out.println("Nikita salary is "+ niks.getSalary());

        System.out.println("em name is "+ em.name);
        System.out.println("niks name is "+ niks.name);

        // System.out.println("haris name is "+ em.setName("Nikita"));


        // em.getName();
        // niks.getName();
        // em.setName("nikita");


    }
}
