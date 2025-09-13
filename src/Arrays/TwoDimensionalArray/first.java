package Arrays.TwoDimensionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 3 rows, 2 columns
//        int[][] arr1 = new int[4][2];

        /*// Input values
        System.out.println("Enter the element of the first Matrix.");
        for (int i = 0; i < arr1.length; i++) {            // rows
            for (int j = 0; j < arr1[i].length; j++) {     // cols
                arr1[i][j] = sc.nextInt();
            }
        }

        // Print values
        System.out.println("Matrix is:");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }


        int[][] arr = new int[4][2] ;
        System.out.println("Enter the element of the second Matrix.");
        for (int i = 0; i < arr.length; i++) {            // rows
            for (int j = 0; j < arr[i].length; j++) {     // cols
                arr[i][j] = sc.nextInt();
            }
        }

        // Print values
        System.out.println("Matrix is:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int arr2[][] = new int [4][2];
        for (int i=0;i<arr2.length;i++) {
            for (int j=0;j<arr2[j].length;j++){
                arr2[i][j] =arr[i][j] +arr[i][j];
            }
        }

        System.out.println("Answered Matrix.");
        for (int i=0 ; i<arr2.length ; i++){
            for (int j=0 ; j<arr2[i].length ;j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }*/


        /*int[][] arr2 = {{3, 5, 1},
                {3, 4, 8, 9},
                {4, 3, 5, 8}};

        System.out.println(Arrays.toString(arr2[0]));
        for (int i = 1; i < arr2.length; i++) {
            System.out.println(Arrays.toString(arr2[i]));
        }*/


        int n = sc.nextInt();   // rows
        int m = sc.nextInt();   // cols
        int[][] arr2D = new int[n][m];

        System.out.println("Enter the element of the array.");
        // take input
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                arr2D[i][j] = sc.nextInt();
            }
        }

        System.out.println("Your array is : ");
        // print after input
        /*for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }*/


        // Printing the array through using the inbuilt arras. method...........
        for (int row = 0; row < arr2D.length; row++) {
            System.out.println(Arrays.toString(arr2D[row]));
        }



    }
}
