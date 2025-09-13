package Arrays.ArrayList;

import java.util.ArrayList;

public class Iterate_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ujjwal");
        list.add("Ram");
        list.add("Priyam");
        list.add("Divyam");
        list.add("Suyam");

        for (int i = 0; i < list.size(); i++) {
            String element = list.get(i);
            System.out.println(element);
        }

    }
}
