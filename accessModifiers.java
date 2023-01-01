import org.w3c.dom.css.Rect;

// class Account{

    // public access modifiers
    // public String name;



    // private access modifiers
    // protected String email;



    // private aceess modifiers
    // private String password;



    // getter and setters to access th e private access modifiers
    // public String getPassword() {
    //     return this.password;
    // } 

    // public void setPassword(String pass) {
    //     this.password = pass;
  
    // }



    // default aceess modifiers
    //String name;

// }


class Cylinder{
    private int radius;
    private int height;

    public int getRadius(){
        return radius;
    }
    public int setRadius(int h){
        radius = h;
        return radius;
    }

    public int getHeight(){
        return this.height;
    }
    public int setHeight(int h1){
        height = h1;
        return height;
    }



    public double surfaceArea(){
        // return 2 * 3.142 * radius *radius + 2*3.142*radius*height;
        // or
        return 2 * Math.PI * radius *radius + 2* Math.PI *radius*height;

    }

    public double volume(){
        return 3.142 * radius *radius *height;
    }


}

class Rectangle{
    private int length;
    private int breadth;

    public Rectangle(int length , int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength(){
        return this.length;
    }

    public int getBreadth(){
        return this.breadth;
    }
}


public class accessModifiers{
    public static void main(String[] args) {
        // Account ac = new Account();
        // ac.name = "bank of india account";
        // ac.email ="niktiasakunde3@gmail.com";


        // cannot access the private access modifiers outside the class
        // ac.password = "abcd"; 



        // after getter and setter 
        // ac.setPassword("1234");
        // System.out.println(ac.getPassword());



        Cylinder cy = new Cylinder();
        
        cy.setRadius(9);
        cy.setHeight(12);

        System.out.println("The radius is: " + cy.getRadius());
        System.out.println("The height is: " +cy.getHeight());

        // int surface = cy.surfaceArea();
        System.out.println("Surface area of cylinder is: " + cy.surfaceArea());
        System.out.println("volume of cylinder is: " + cy.volume());


        Rectangle rec = new Rectangle(4, 5);
        System.out.println("the breadth of rectanagle is " + rec.getBreadth());
        System.out.println("the length of rectangle is"+rec.getLength());
    }
}