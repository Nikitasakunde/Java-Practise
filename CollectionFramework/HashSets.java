import java.util.HashSet;

public class HashSets {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>(6,0.6f);

        myHashSet.add(1);
        myHashSet.add(2);
        myHashSet.add(1);
        myHashSet.add(1);
        myHashSet.add(7);
        myHashSet.add(6);
        myHashSet.add(7);


        System.out.println(myHashSet);


    }
}
