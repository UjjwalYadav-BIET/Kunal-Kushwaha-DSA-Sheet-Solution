package Arrays.Min_Max_Searching_Sorting_Problems;

import java.util.Scanner;

public class First {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        //How to Declare the array--->

        //Method 1
        //This method of array creation is called Object array.
        int [] arr = new int[5];

        // Method 2
        // This is called as primitive array.
        int [] arr2 = {3,4,5,6};

        //Method 3
        int [] arr3;
        arr3 = new int[]{3, 6, 4, 8};

        //Syntax---->
        // datatype[] variable_name = new datatype[size];
        System.out.println("Enter the element of the array.");
        for (int i=0;i<arr.length;i++){
            arr[i]= in.nextInt();
        }

        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            System.out.print(" ");
        }

        String [] arr1 = new String[6];
        System.out.println(arr1[0]);// This line the print the null value.
        System.out.println(arr1[1]);

        arr1[0]="U";
        arr1[1]="J";
        arr1[2]="J";
        arr1[3]="W";
        arr1[4]="A";
        arr1[5]="L";

        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println(arr1[3]);

    }
}
