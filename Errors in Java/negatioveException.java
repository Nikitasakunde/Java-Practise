class NegativeRadiusException extends Exception{
    public String toString(){
        return "Negative radius Exception";
    }

    public String getMessage(){
        return "you entered negative radius";
    }
}

public class negatioveException {
    public static double areaOfCircle(int r) throws NegativeRadiusException{
        if (r < 0){
            throw new NegativeRadiusException();
        }
        return Math.PI * r * r;

    }
    public static void main(String[] args) {
    
        try {
            double d = areaOfCircle(-2);
            System.out.println(d);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
