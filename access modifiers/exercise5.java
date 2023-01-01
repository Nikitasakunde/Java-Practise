package com.codewithnikita.shape;

class Shape{
    public int radius;
    public int height;
    public int breadth;
    public int length;

}
class Rectangle extends Shape{
    public float area(int length , int breadth){
        return length * breadth;
    }

    public double volume(int radius , int height){
        return 2* Math.PI * radius * height;
    } 

    public int getradius(){
        return this.radius;
    }

    public void setRadius(int radius){
        this.radius = radius;
    }
   
}




public class exercise5 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        System.out.println(r.area(100, 100));
        System.out.println(r.volume(100, 100));
    
    
        // setter
        r.setRadius(10);
        // getter
        System.out.println(r.getradius());
    }
}




