package Arrays.ArrayList;

import java.util.*;

public class Compare_Two_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(10, 20, 30, 45, 50));

        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < list1.size(); i++) {
            result.add(list1.get(i).equals(list2.get(i)) ? "Yes" : "No");
        }

        System.out.println(result);
    }
}
