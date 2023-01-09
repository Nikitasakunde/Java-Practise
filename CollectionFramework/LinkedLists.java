import java.util.LinkedList;


public class LinkedLists{
    public static void main(String[] args) {
        LinkedList<Integer> L1 = new LinkedList<>();
        LinkedList<Integer> L2 = new LinkedList<>();


        L1.add(1);
        L1.add(2);
        L1.add(3);
        L1.add(4);

        L2.add(5);
        L2.add(6);
        L2.add(7);
        L2.add(8);

        L1.addAll(L2);
        L1.addLast(10);
        L1.addFirst(1000);


        for (int i = 0; i < L1.size(); i++) {
            System.out.print(L1.get(i) + " ");
        }

    }
}