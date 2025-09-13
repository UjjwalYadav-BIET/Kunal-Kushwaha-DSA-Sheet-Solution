package Arrays.GFG_50_Ques.Easy;

import java.util.Scanner;

public class Remove_Duplicates {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array.");
        int n = in.nextInt();

        System.out.println("Enter the elements of the array.");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter the elelment arr[%d] : ", i);
            arr[i] = in.nextInt();
        }

        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        int j = 0;
        for (int i = 0; i < n-1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j] = arr[i];
                j++;
            }
        }

        arr[j] = arr[n-1];
        j++;

        System.out.println("Array after removing duplicates : ");
        for (int i = 0; i < j; i++) {
            System.out.println(arr[i]+" ");
        }


    }
}
