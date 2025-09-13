package Arrays.Min_Max_Searching_Sorting_Problems;

import java.util.Scanner;

public class Second_Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array.");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("The element of the array : ");
        for (int i = 0; i < n; i++) {
            System.out.printf("Element of arr[%d] :", i);
            arr[i] = sc.nextInt();
        }

        System.out.println("The second largest number is "+ SecondLargest(arr,n));

    }
    public static int SecondLargest(int[] a, int len){
        int t;
        for (int i = 0; i < len; i++)
        {
            for (int j = i + 1; j < len; j++)
            {
                if (a[i] < a[j])
                {
                    t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
        return a[1];
    }
}
