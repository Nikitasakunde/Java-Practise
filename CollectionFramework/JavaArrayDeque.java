import java.util.ArrayDeque;

public class JavaArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ArrayDeque<Integer> ad2 = new ArrayDeque<>();

        ad1.add(67);
        ad1.add(6787);

        ad2.add(45);
        ad2.add(32);

        ad1.addFirst(57874);
        ad2.addLast(7346479);

        
        // it does not throw exception
        ad1.offerFirst(84388386);

        ad1.addAll(ad2);
    
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
        System.out.println(ad1.getClass());

    }
}
