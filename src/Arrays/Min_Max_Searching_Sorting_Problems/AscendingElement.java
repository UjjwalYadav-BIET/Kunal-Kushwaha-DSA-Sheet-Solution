package Arrays.Min_Max_Searching_Sorting_Problems;

import java.util.Arrays;
import java.util.Scanner;

public class AscendingElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of the array.");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element of the array.");
        for (int i=0;i< arr.length;i++) {
            arr[i] = in.nextInt();
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();

        Arrays.sort(arr);
        System.out.println("Array in ascending order is : ");
        for (int num : arr){
            System.out.print(num+" ");
        }

    }
}
