package Arrays.Min_Max_Searching_Sorting_Problems;

import java.util.Scanner;

public class Sum_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array.");
        int n = sc.nextInt();
        int [] arr = new int[n];

        for (int i=0 ; i<n ; i++) {
            System.out.printf("Element of a[%d] :",i);
            arr[i]  = sc.nextInt();
        }
        int sum = 0;
        for (int i=0 ; i<n ; i++) {
            if (arr[i]%2==0) {
                System.out.println("Odd Numbers are = "+arr[i]);
                sum = sum +arr[i];
            }
        }

        System.out.println("The sum of the odd Numbers = "+sum);

    }
}
