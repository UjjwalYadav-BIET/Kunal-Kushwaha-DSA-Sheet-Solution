package Arrays.Min_Max_Searching_Sorting_Problems;

import java.util.Scanner;

public class Delete_Duplicate_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array.");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Element of arr[%d] :", i);
            arr[i] = sc.nextInt();
        }

        n = removeDuplicates(arr,n);

        System.out.println("Array after removing duplicates: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
    public static int removeDuplicates (int[] arr, int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int j = 0; // index for the new array
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[n - 1];

        return j;
    }
}
