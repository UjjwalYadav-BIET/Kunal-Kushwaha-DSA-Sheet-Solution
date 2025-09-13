package Arrays.Min_Max_Searching_Sorting_Problems;

import java.util.Scanner;

public class Search_Element {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array.");
        int n = in.nextInt();
        System.out.println("Enter the element which you want to search.");
        int src = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Element of a[%d] :", i);
            arr[i] = in.nextInt();
        }

        for (int i = 0; i<n ; i++) {
            if(src == arr[i]) {
                System.out.println("Your element is at the position "+i+" and the element is "+arr[i]);
                return;
            }
        }
        System.out.println("Element doesn't found.");
    }
}
