package Arrays.GFG_50_Ques.Easy;

import java.util.Scanner;

public class Rotate_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array.");
        int n = in.nextInt();

        int [] arr = new int[n];
        System.out.println("Enter the elements of the array.");
        for (int i=0; i<n; i++) {
            System.out.printf("Enter the element arr[%d] : ",i);
            arr[i] = in.nextInt();
        }

        System.out.println("Enter the position from which you want to rotate the array.");
        int d =in.nextInt();

        // Step 1: Store first d elements in temporary array
        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        // Step 2: Shift the rest of the array left
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }

        // Step 3: Copy temporary array elements to the end
        for (int i = 0; i < d; i++) {
            arr[n - d + i] = temp[i];
        }

        // Step 4: Print the rotated array
        System.out.println("Array after left rotation:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
