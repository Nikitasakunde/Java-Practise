class Mythr extends Thread{
    public Mythr(String name){
        super(name);

    }

    public void run(){
        int i = 6589;
        // System.out.println("Thank you");
        
        // System.out.println("this is Thread");
        
    }
}

public class threadConstructor {
    public static void main(String[] args) {
        Mythr t1= new Mythr("Nikita");
        Mythr t2= new Mythr("Nikita Sakunde");

        t1.start();
        t2.start();


        System.out.println("The id of thread is : " + t1.getId());
        System.out.println("The id of thread is : " + t2.getId());

        System.out.println("The name of thread is : " + t1.getName());
        System.out.println("The name of thread is : " + t2.getName());

        System.out.println("The class of thread is : " + t1.getClass());
        System.out.println("The class of thread is : " + t2.getClass());

        System.out.println("The priority of thread is : " + t1.getPriority());
        System.out.println("The priority of thread is : " + t2.getPriority());

        System.out.println("The state of thread is : " + t1.getState());
        System.out.println("The state of thread is : " + t2.getState());




        
    }
}
