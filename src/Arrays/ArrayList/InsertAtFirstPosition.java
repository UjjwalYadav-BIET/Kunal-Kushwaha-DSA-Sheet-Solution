package Arrays.ArrayList;

import java.util.ArrayList;

public class InsertAtFirstPosition {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(32);
        list.add(42);
        list.add(55);
        list.add(23);
        list.add(12);
        list.add(21);
        System.out.println(list);
        list.add(0,5);
        list.add(5,9);
        System.out.println(list);
    }
}
