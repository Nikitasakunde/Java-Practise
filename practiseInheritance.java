// consructors in inheritance in java


// car extends two wheeler and 4 wheeler
class Base{

    public int x;

    Base(){
        System.out.println("I am base constructor");
    }

    public int getx(){
       return x;
    }

    public void setx(int x){
        this.x = x; 

    }
}

class Derived extends Base{
    public int y;

    Derived(){
        System.out.println("I am a derived constructor");
    }


    public int gety(){ 
        return y;
     }
 
     public void sety(int y){
         this.y = y; 
 
     }
}


public class practiseInheritance{
    public static void main(String[] args) {
        Base b = new Base();
        b.setx(10);

        System.out.println("the value of x is: " + b.getx());


        Derived d = new Derived();
        d.sety(12);
        System.out.println("the value of y is : " + d.gety());
         
    }
}