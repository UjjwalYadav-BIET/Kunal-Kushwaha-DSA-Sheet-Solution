package Arrays.Min_Max_Searching_Sorting_Problems;

import java.util.Scanner;

public class Bubble_Sort_Descending{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array.");
        int n = in.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array.");
        for (int i=0; i<n; i++) {
            arr[i] = in.nextInt();
        }


        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) { // Swap if elements are in wrong order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.print("Sorted Array : ");
        for (int i=0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
