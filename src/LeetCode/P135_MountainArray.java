package LeetCode;

import Arrays.SearchingSortingProblem.OrderAgnosticBS;

public class P135_MountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        System.out.println("Targeted peak element : "+search(arr,target));
    }

    static int search (int[] arr, int target ) {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBS(arr,target,0,peak);
        if (firstTry != -1) {
            return firstTry;
        }
        return orderAgnosticBS(arr, target, peak+1,arr.length-1);
    }

    static int orderAgnosticBS(int[] arr, int target,int start, int end) {

        // Find whether the array is sorted in ascending or descending.
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            // safer mid calculation
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1; // element not found
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                //You are in the decreasing part of the array
                // this may be the answer, but look at the left
                //this is why end != mid - 1;
                end = mid;
            } else {
                // We are in the increasing part of the array.
                start = mid + 1;
            }
        }
        return start; // or return end
    }
}
