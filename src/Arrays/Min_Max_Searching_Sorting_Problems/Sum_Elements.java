package Arrays.Min_Max_Searching_Sorting_Problems;

import java.util.Scanner;

public class Sum_Elements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of element of the array.");
        int a = in.nextInt();
        int[] arr = new int[a];
        int sum =0;
        System.out.println("Enter the element of the array.");
        for (int i=0;i< arr.length;i++) {
            arr[i] = in.nextInt();
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
            sum = sum +arr[j];
        }
        System.out.println(sum);
    }
}
