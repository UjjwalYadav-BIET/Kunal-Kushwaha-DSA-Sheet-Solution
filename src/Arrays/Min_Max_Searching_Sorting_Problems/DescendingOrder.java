package Arrays.Min_Max_Searching_Sorting_Problems;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class DescendingOrder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the length of the array.");
//        int n = in.nextInt();
        Integer[] arr = {8,9,5,8};
        System.out.println("The element of the array is : "+ Arrays.toString(arr));
//        for (int i=0;i< arr.length;i++) {
//            arr[i] = in.nextInt();
//        }
//        for (int i : arr) {
//            System.out.print(i + " ");]
//        }

        Arrays.sort(arr, Collections.reverseOrder()); // Sort in descending order
        System.out.println("Array in descending order is : ");
        for (int num :arr) {
            System.out.print(Arrays.toString(new int[]{num}));
        }
    }
}
