
class Circle{
    public int radius;

    Circle(int r){
        this.radius = r;
    }

    public void area(){
        System.out.println(Math.PI*this.radius * this.radius);
    }
}
class Cylinder extends Circle{
    public int radius;
    public int height;

    Cylinder(int r , int h){
        super(r);
        this.height = h;
    }

    public void volume(){
        System.out.println(Math.PI  * this.radius  * this.radius * this.height);
    }
}

public class inherit {
    public static void main(String[] args) {
        // Circle c = new Circle(12);

        Cylinder cy = new Cylinder(10, 10);
        System.out.println(cy);
    }
}
