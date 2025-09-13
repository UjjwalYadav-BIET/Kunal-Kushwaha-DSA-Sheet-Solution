package Arrays.GFG_50_Ques.Easy;

import java.util.Scanner;

public class Move_AllZeroesToEnd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array.");
        int size = in.nextInt();

        System.out.println("Enter the elements of the array.");
        int [] arr = new int[size];
        for (int i=0; i<size; i++) {
            System.out.printf("Enter the element arr[%d] : ",i);
            arr[i] = in.nextInt();
        }

        int index = 0;
        int arr2[] = new int[size];
        for (int i=0; i<size; i++) {
            if (arr[i] != 0) {
                arr2[index++] = arr[i]; // This line take the first value of the index and after that it will update to the index = index+1.
            }
        }

        System.out.println("Array after moving all zeroes to the end:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr2[i] + " ");
        }

    }
}
