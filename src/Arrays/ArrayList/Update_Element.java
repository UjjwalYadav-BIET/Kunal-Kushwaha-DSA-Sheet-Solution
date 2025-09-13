package Arrays.ArrayList;

import java.util.ArrayList;

public class Update_Element {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(7);
        list.add(9);
        System.out.println("List Before updating : "+list);
        System.out.println(list.set(0,32));
        System.out.println(list.set(1,30));
        System.out.println("List After updating : "+list);
    }
}
