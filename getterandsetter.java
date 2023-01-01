
class MyEmoloyee{

    private String name;
    // Private int id;

    public String getName() {
        return name;
    }

    public String setName(String n){
        name = n;
        return name;
    }
}


public class getterandsetter {
    public static void main(String[] args) {
        MyEmoloyee em1 = new MyEmoloyee();

        em1.setName("Nikita");
        System.out.println("The name of employee is: " + em1.getName());

    }
}
