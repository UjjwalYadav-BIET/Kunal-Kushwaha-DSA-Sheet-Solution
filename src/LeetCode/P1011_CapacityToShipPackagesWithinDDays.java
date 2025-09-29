package LeetCode;

import java.util.Scanner;

public class P1011_CapacityToShipPackagesWithinDDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] weights = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            weights[i] = sc.nextInt();
        }

        System.out.println("Enter k (number of subarrays): ");
        int k = sc.nextInt();

        // Solve
        int result = shipWithinDays(weights, k);
        System.out.println("Minimized largest sum = " + result);

        sc.close();
    }
    static int shipWithinDays(int[] weights, int days) {

        int low = 0, high = 0;
        for (int num : weights) {
            low = Math.max(low, num); // max element
            high += num; // total sum
        }

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (canSplit(weights, days, mid)) {
                high = mid; // try smaller max sum
            } else {
                low = mid + 1; // need bigger max sum
            }
        }

        return low;
    }

    // Helper to check if we can split with maxSum limit
    private static boolean canSplit(int[] weights, int days, int maxSum) {
        int count = 1;  // start with one subarray
        int currentSum = 0;

        for (int num : weights) {
            if (currentSum + num > maxSum) {
                count++;        // start new subarray
                currentSum = num;
                if (count > days) return false;
            } else {
                currentSum += num;
            }
        }

        return true;
    }
}
