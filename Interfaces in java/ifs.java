
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

public class ifs {
    public static void main(String[] args) {
        MySmartPhone s = new MySmartPhone();
        s.blowHorn();
        s.takePicture();
        s.takeVideo();
        s.takewalk();
        s.greet();

        String ar[] = {" nikita " ," anjum " , " tejal " ," mrunal " , " vaishnavi " , " komal "};
        int i[] = {1, 2,4,5,6,7,8,9,0};
        for (int item : i) {
            System.out.println(item);
        }


        for (String item : ar) {
            System.out.print(item);
        }
    }
}
