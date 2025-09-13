package Arrays.ArrayList;

import java.util.ArrayList;

public class Search_Element {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        str.add("Ujjwal");
        str.add("Umang");
        str.add("Shaurya");
        str.add("Shyam");
        str.add("Ram");
        System.out.println("List is : "+str);
        if (str.contains("Ujjwal")) {
            System.out.println("Yes this string present in the list.");
        } else {
            System.out.println("No, this string does not present in the string.");
        }
    }
}
