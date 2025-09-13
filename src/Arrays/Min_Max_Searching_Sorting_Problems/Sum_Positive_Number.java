package Arrays.Min_Max_Searching_Sorting_Problems;

import java.util.Scanner;

public class Sum_Positive_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array.");
        int n = in.nextInt();

        int [] arr = new int[n];

        for (int i=0 ; i<n ; i++) {
            System.out.printf("Element of a[%d] :",i);
            arr[i]  = in.nextInt();
        }

        int sum = 0;
        for (int i = 0 ; i<n ;i++) {
            if (arr[i] > 0) {
                System.out.println("Positive Numbers are = "+arr[i]);
                sum = sum + arr[i];
            }
        }
        System.out.println(sum);

//        for (int i = 0 ; i<n ; i++ ) {
//            sum = sum +arr[i];
//        }
//        System.out.println("Total sum = "+sum);

    }
}
