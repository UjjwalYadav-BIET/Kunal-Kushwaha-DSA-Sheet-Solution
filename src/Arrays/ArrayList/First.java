package Arrays.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(); // Arraylist is the part of the collection framework in the java
        list.add(5);                                 // Note: We have to write the wrapper class instead of the datatypes.
        list.add(8);
        list.add(3);
        list.add(9);
        System.out.println(list);

        ArrayList<String> str = new ArrayList<>();
        str.add("Ram");
        str.add("Shyam");
        str.add("Kunal");
        str.add("Ghanshyam");
        str.add("Ujjwal");
        System.out.println(str);
        System.out.println(str.contains("Ram"));
        System.out.println(str.contains(39));
        System.out.println(str.contains("ujjwal"));
        System.out.println(str.contains("Ujjwal "));
        System.out.println(list.set(0,3));
        list.remove(2);
        System.out.println(list);

    }
}
