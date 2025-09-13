package Arrays.Min_Max_Searching_Sorting_Problems;

import java.util.Scanner;

public class Store_Elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i=0 ; i<n ; i++) {
            System.out.printf("Element of a[%d] :",i);
            arr[i]  = sc.nextInt();
        }

        System.out.println("\nDisplay Array Elements...\n");

        for(int e:arr)
        {
            System.out.println(e);
        }
    }
}
