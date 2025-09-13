package Arrays.GFG_50_Ques.Easy;

import java.util.Scanner;

public class Wave_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array.");
        int n=in.nextInt();

        System.out.println("Enter the element of the array.");
        int arr[] = new int[n];
        for (int i=0; i<n; i++ ){
            System.out.printf("Enter the element arr[%d] : ",i);
            arr[i] = in.nextInt();
        }

        System.out.println("The array in the wave form.");
        for (int i=0; i<n-1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }

        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }

    }
}
