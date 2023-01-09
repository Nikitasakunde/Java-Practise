class MyDeprecated{
    @Deprecated
    void meth(){
        System.out.println("I am meth 1");
    }
}

public class deprecateds {
    public static void main(String[] args) {
        MyDeprecated d = new MyDeprecated();
        d.meth();
    }
}
