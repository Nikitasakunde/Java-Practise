interface bicycle{

    // all elements in interfaces are final
    void applyBreak(int decrement);
    void speedUp(int increment);
    final int a = 67;
}

interface blow{
    void blowHornkuch();
    void blowHornmein();
}

class avonCycle implements bicycle , blow{
    void blowHorn(){
        System.out.println("Pee Pee Poo Poo");
    }



    // interface implement kartana public  banavava

    public void applyBreak(int decrement){
        System.out.println("appying break");
    }
    public void speedUp(int increment){
        System.out.println("incresing speed");
    }


    public void blowHornkuch(){
        System.out.println("kuch kuch hota hai");
    };
    public void blowHornmein(){
        System.out.println("mein hoon na");
    };
}




public class interfaces{
    public static void main(String[] args) {
        avonCycle c = new avonCycle();


        
        // c.applyBreak(0);
        // c.speedUp(0);
        // c.blowHorn();
        // System.out.println(c.a);


        c.blowHornkuch();
        c.blowHornmein();
    }
}