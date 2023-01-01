// problem 1 print good morninig  anda welcome using thread continuously
class Myth extends Thread{
    public void run(){
        while (true) {
            try{
                Thread.sleep(200);
            }
            catch(Exception e){
                System.out.println(e);
            }


            System.out.println("Welcome");
        }
    }
}

class Myth1 extends Thread{
    public void run(){
        while (true) {
            System.out.println("Good Monrning");
        }
    }
}



public class ThreadPractise{
    public static void main(String[] args) {
        Myth m = new Myth();
        Myth1 m1 = new Myth1();

        m.setPriority(Thread.MAX_PRIORITY);
        // m1.setPriority(9);

        System.out.println(m.getPriority());
        System.out.println(m1.getPriority());
        System.out.println(m.getState());
        System.out.println(Thread.currentThread().getState());


        // m.start();
        // m1.start();
    }
}