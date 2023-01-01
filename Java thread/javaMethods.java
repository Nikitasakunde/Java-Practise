class Mythr extends Thread{
    public Mythr(String name){
        super(name);

    }

    public void run(){
        while(true){
            System.out.println("Thank you thread 1");
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        
    }
}

class Mythr1 extends Thread{
  

    public void run(){
        while(true){
        System.out.println("thank you thread 2");

        }
        
    }
}
// methods in java
// 1. join
// 2 . 

public class javaMethods {
    public static void main(String[] args) {
        Mythr m1 = new Mythr("Nikita");
        Mythr1 m2 = new Mythr1();

        m1.start();

        // try {
        //     m1.join();

            
        // } catch (Exception e) {
        //     System.out.println(e);
        // }
        



        m2.start();
    }
}
