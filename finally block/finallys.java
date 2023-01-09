public class finallys{
    public static int greet() {
        try {
            int a = 50;
            int b = 0;
            int c = a/b;
            return c;

        } catch (Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println("This is end of this program");
        }
        return -1;

    }
   
    
    public static void main(String[] args) {
        int k = greet();
        System.out.println(k);
        
        
    }
}