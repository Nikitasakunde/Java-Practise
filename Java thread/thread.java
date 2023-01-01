class MyThread1 extends Thread{
    public void run(){
        int i =0;
        while (i<10) {
        System.out.println("this is thread 1 for cooking");
        i++;
        }
    }
}


class MyThread2 extends Thread{
    public void run(){
        int i =0;
        while (i<10) {
        System.out.println("this is thread 2 for chatting");
        i++;
        }
    }
}


public class thread{
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();


        // methods of threads


        // start will run any of method at any time
        t1.start();
        t2.start();


        // it will run the 1 st method firstly then second method secondly
        // t1.run();
        // t2.run();

        // t1.isAlive();
        // System.out.println(t1.isAlive());
        // // t2.isAlive();
        // System.out.println(t2.isAlive());


        // isdemon
        // System.out.println(t1.isDaemon());
        // System.out.println(t2.isDaemon());


        // isInterrupted
        // System.out.println(t1.isInterrupted());
        // System.out.println(t2.isInterrupted());

    }
}