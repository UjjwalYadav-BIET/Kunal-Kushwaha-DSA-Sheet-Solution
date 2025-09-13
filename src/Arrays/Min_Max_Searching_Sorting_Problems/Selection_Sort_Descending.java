package Arrays.Min_Max_Searching_Sorting_Problems;

import java.util.Scanner;

public class Selection_Sort_Descending {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array.");
        int n = in.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the element of the array.");
        for (int i =0; i<n; i++) {
            System.out.printf("Element at a[%d] : ",i);
            arr[i] = in.nextInt();
        }

        for (int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
