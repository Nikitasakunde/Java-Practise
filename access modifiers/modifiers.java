class C1{
    // public 
    public int x = 6;
    // protected
    protected int y =78;
    // default
    int z = 90;
    // private
    private int a = 89;


    // we can access all modidiers in same class
    public void meth(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);

    }
}

class C2 extends C1{
    public void meth2(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        // we cannot access the private modifiers outside the same class
        // System.out.println(a);
    }
}

public class modifiers{
    public static void main(String[] args) {
        // C1 c = new C1();
        // c.meth();

        // System.out.println(c.x);
        // System.out.println(c.y);
        // System.out.println(c.z);
        // we cannot access the private modifiers outside the class
        // System.out.println(c.a);
        


        C2 c = new C2();
        c.meth2();
    }
}