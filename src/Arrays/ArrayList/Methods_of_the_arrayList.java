package Arrays.ArrayList;

import java.util.*;
import java.util.Collections;

public class Methods_of_the_arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(4);
        list.add(2);
        list.add(7);
        list.add(9);

        // Sort the element of the arrayList
        /*System.out.println("List before sort: "+list);
        Collections.sort(list);
        System.out.println("List after sort: "+list);*/

        // Copy the List
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(4);
        list2.add(21);
        list2.add(42);
        list2.add(29);
        /*Collections.copy(list,list2);
        System.out.println("Since the copied list is : "+list);*/

        // Shuffle the arrayList
        /*Collections.shuffle(list);
        System.out.println("Shuffled list : "+list);*/

        //Reverse the arrayList
       /* Collections.reverse(list);
        System.out.println(list);*/

        //Extracting the sublist from the arrayList
       /* List<Integer> sub_List = list.subList(0, 3);
        System.out.println("List of first three elements: " + sub_List);*/

        // Clone the array list
        /*ArrayList<Integer> newc1 = (ArrayList<Integer>)list.clone();
        System.out.println(newc1);*/

        // Syntax to clear the arrayList
        /*System.out.println("Before clearing the elements : "+list);
        list.clear();
        System.out.println("After clearing the elements : "+list);*/

        //Checking the arrayList is empty or not..
        /*System.out.println("The original ArrayList is : "+list);
        System.out.println("Now, checking the above arrayList is empty or not");
        System.out.println(list.isEmpty()+" ,the arrayList is empty.");

        //After removing the all elements.
        list.clear();// list.removeAll()
        System.out.println(list.isEmpty()+", the arrayList is empty");*/

        // Trim the size of the arrayList
       /* list.trimToSize(); // It will trim the size of the array.
        System.out.println(list);*/

        // Replace the n element from the arrayList.
        /*list.remove(1);
        list.add(1,10);
        System.out.println("New arrayList : "+list);*/

        //Print the element by their position
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("The element at index %d is %d", i, list.get(i));
            System.out.println();
        }
        

    }
}
