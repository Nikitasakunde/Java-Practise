class MythreadRunnable1 implements Runnable{
    public void run(){
        while (true) {
        System.out.println("I am Thread1 not a threat");
            
        }
    }
}

class MythreadRunnable2 implements Runnable{
    public void run(){
        while (true) {
        System.out.println("I am Thread2 not a threat");
            
        }
    }
}

public class runnableInterface{
    public static void main(String[] args) {
        MythreadRunnable1 bullet1 = new MythreadRunnable1();
        Thread gun1 = new Thread(bullet1);

        MythreadRunnable2 bullet2 = new MythreadRunnable2();
        Thread gun2 = new Thread(bullet2);
        

        gun1.start();
        gun2.start();

    }
}