package Arrays.Min_Max_Searching_Sorting_Problems;

import java.util.Scanner;

public class Average_Values {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array.");
        int n = in.nextInt();
        float sum = 0;

        int[] arr = new int[n];
        for (int i = 0 ; i<n ; i++) {
            arr[i] = in.nextInt();
        }

        for (int i=0;i<n;i++) {
            sum = sum + arr[i];
        }

        System.out.println("Sum of the element of array = "+sum);

        float avg = sum/n;

        System.out.println("Average = "+avg);

    }
}
