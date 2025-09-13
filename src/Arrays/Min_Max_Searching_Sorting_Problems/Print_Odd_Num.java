package Arrays.Min_Max_Searching_Sorting_Problems;

import java.util.Scanner;

public class Print_Odd_Num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array.");
        int n = in.nextInt();

        int [] arr1 = new int[n];
        int [] arr2 = new int[n];

        System.out.println("Enter the element of the first array.");
        for (int i = 0 ; i<n ;i++ ) {
            arr1[i] = in.nextInt();
        }

        System.out.println("Enter the element of the Second array.");
        for (int j=0 ; j<n ; j++ ) {
            arr2[j] = in.nextInt();
        }

        // Third array to store odd elements
        int[] C_arr = new int[arr1.length + arr2.length];
        int k = 0; // index for third array

        // Add odd elements from first array
        for (int i = 0; i < n; i++) {
            if (arr1[i] % 2 != 0) {
                C_arr[k++] = arr1[i];
            }
        }

        // Add odd elements from second array
        for (int i = 0; i < n; i++) {
            if (arr2[i] % 2 != 0) {
                C_arr[k++] = arr2[i];
            }
        }

        // Print third array (only filled elements)
        System.out.println("Odd elements stored in the third array:");
        for (int i = 0; i < k; i++) {
            System.out.print(C_arr[i] + " ");
        }

        in.close();

    }
}
