package Arrays.Min_Max_Searching_Sorting_Problems;

import java.util.Scanner;

public class Print_Even_Num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array.");
        int size = in.nextInt();
        int [] arr1 = new int[size];
        int [] arr2 = new int[size];

        System.out.println("Enter the element of the first array.");
        for (int i=0 ; i<size ;i++ ) {
            arr1 [i] = in.nextInt();
        }

        System.out.println("Enter the element of the second array.");
        for (int j =0 ;j<size ; j++ ) {
            arr2 [j] = in.nextInt();
        }

        int [] C_arr = new int [arr1.length+ arr2.length] ;
        int K = 0;

        for (int i = 0 ; i<size ;i++ ) {
            if (arr1[i]%2==0) {
                C_arr[K++] = arr1[i] ;
            }
        }

        for (int i = 0 ; i<size ;i++ ) {
            if (arr2[i]%2==0) {
                C_arr[K++] = arr2[i] ;
            }
        }

        //The third array is.........
        System.out.print("The Third array is = ");
        for (int i = 0; i<K ;i++ ){
            System.out.print(C_arr[i]+" ");
        }

        in.close();
    }
}
