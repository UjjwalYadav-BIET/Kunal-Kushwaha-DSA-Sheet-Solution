package Arrays.SearchingSortingProblem;

import java.util.Scanner;

public class Rotation_Count {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array.");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element of the array !!!!");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int rotations = countRotations(arr);
        System.out.println("Number of rotations = " + rotations);
    }

    static int countRotations(int[] arr) {
        int n = arr.length;
        int low = 0, high = n - 1;

        while (low <= high) {
            // If array is already sorted
            if (arr[low] <= arr[high]) {
                return low;
            }

            int mid = (low + high) / 2;
            int next = (mid + 1) % n;
            int prev = (mid + n - 1) % n;

            // Check if mid is minimum
            if (arr[mid] <= arr[next] && arr[mid] <= arr[prev]) {
                return mid;
            }

            // Decide search side
            if (arr[mid] <= arr[high]) {
                high = mid - 1; // Search left half
            } else {
                low = mid + 1;  // Search right half
            }
        }
        return 0;
    }

}
