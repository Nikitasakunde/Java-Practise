interface camera{
    void takePicture();
    void takeVideo();

    // by default it will run this function
    default void takewalk(){
        System.out.println("taking the walk");
    }

}

interface blow{
    void blowHorn();
}

class MyCellPhone implements camera{
    void calling(int number){
        System.out.println("you are calling the number " + number);
    }
    public void takePicture(){
        System.out.println("taking picture");
    }
    public void takeVideo(){
        System.out.println("taking the video");
    }
}

class MySmartPhone extends MyCellPhone implements blow{
    public void takePicture(){
        System.out.println("taking picture");
    }
    public void takeVideo(){
        System.out.println("taking the video");
    }
    public void blowHorn(){
        System.out.println("horn is blowing");
    }

    public void greet(){
        System.out.println("greetings");
    }


    public void takewalk(){
        System.out.println("are you walking?");
    }
}



public class polymorphism1{
    public static void main(String[] args) {

        // it will only allows camera functions
        camera c = new MySmartPhone();
        c.takePicture();

        // it willl not allow lbowHorn function
        // c.blowHorn();
        // c.greet();


        // it will allow only blow function to run
        blow b = new MySmartPhone();
        b.blowHorn();
    }
}