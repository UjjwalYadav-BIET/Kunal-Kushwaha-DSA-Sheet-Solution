package Arrays.Min_Max_Searching_Sorting_Problems;

import java.util.Scanner;

public class Sum_Cubic_Values {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array.");
        int n = sc.nextInt();
        int [] arr = new int[n];

        for (int i=0 ; i<n ; i++) {
            System.out.printf("Element of arr[%d] :",i);
            arr[i]  = sc.nextInt();
        }

        int sum = 0;
        int cube =1;
        for (int j=0 ; j<n ; j++) {
            cube = arr[j]*arr[j]*arr[j];
            sum = sum +cube;
//            System.out.printf("Cube of arr[%d] :",j);
        }
            System.out.println("Cubic Sum = "+sum);

//        for (int i = 0; i<n ; i++) {
//            sum = sum +cube;
//            System.out.println(sum);
//        }
    }
}
