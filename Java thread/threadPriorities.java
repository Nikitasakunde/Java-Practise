
class Mythread extends Thread{
        public Mythread(String name){
            super(name);
    
        }
    
        public void run(){
            int i = 6589;
            System.out.println("Thank you " + this.getName());
            
            // System.out.println("this is Thread");
            
        }
    
    
}

public class threadPriorities{
    public static void main(String[] args) {
        Mythread m = new Mythread("Nikita");
        Mythread m1 = new Mythread("Nikita1");
        Mythread m2 = new Mythread("Nikita2");
        Mythread m3 = new Mythread("Nikita3");
        Mythread m4 = new Mythread("Nikita4 (Most Important)");
        m4.setPriority(Thread.MAX_PRIORITY);
        m1.setPriority(Thread.MIN_PRIORITY);


        m.start();
        m1.start();
        m2.start();
        m3.start();
        m4.start();

    }
}