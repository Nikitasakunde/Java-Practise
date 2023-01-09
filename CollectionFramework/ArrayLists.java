import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> L1 =new ArrayList<>();
        ArrayList<Integer> L2 =new ArrayList<>();

        L2.add(14);
        L2.add(24);
        L2.add(34);
        L2.add(44);
        L2.add(0,490);



        L1.add(4);
        L1.add(5);
        L1.add(6);
        L1.add(7);
        L1.add(8);

        L1.add(0,9);
        L1.add(0,5);
        L1.addAll(L2);
        L1.add(8);
        L1.set(0, 67899);

        // addlast method is not present in arraylist
        // L1.addLast(3);


        System.out.println(L1.contains(6));
        System.out.println("The index of 568 is " +L1.indexOf(568));
        System.out.println("The last index of 8 is " +L1.lastIndexOf(8));




        for (int i = 0; i < L1.size(); i++) {
            System.out.print(L1.get(i));
            System.out.print(", ");

        }
        

    }
}
