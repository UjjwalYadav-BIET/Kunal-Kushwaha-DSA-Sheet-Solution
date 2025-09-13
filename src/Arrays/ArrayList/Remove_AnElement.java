package Arrays.ArrayList;

import java.util.ArrayList;

public class Remove_AnElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(7);
        list.add(9);
        list.remove(4);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
    }
}
