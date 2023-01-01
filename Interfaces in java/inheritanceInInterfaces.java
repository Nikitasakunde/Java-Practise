interface sampleInterface{
    void meth1();
    void meth2();

}

interface childSample extends sampleInterface{
    void meth3();
    void meth4();

}

class MysampleClass implements childSample{
    public void meth1(){
        System.out.println("meth 1");
    }
    public void meth2(){
        System.out.println("meth 2");
    }
    public void meth3(){
        System.out.println("meth 3");
    }
    public void meth4(){
        System.out.println("meth 4");
    }


}


public class inheritanceInInterfaces {
    public static void main(String[] args) {
        MysampleClass object = new MysampleClass();
        object.meth1();
        object.meth2();
        object.meth3();
        object.meth4();

    }
}
