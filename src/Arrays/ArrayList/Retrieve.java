package Arrays.ArrayList;

import java.util.ArrayList;

public class Retrieve {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ujjwal");
        list.add("Ram");
        list.add("Priyam");
        list.add("Divyam");
        list.add("Suyam");
        System.out.println("First Element : "+list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println("Last Element : "+list.get(4));
    }
}
