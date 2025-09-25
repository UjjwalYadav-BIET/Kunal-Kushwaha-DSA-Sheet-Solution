package LeetCode;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 7, 7, 8, 8, 9, 68};
        int target = 10;

        int result = ans(arr, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }

    static int ans(int[] arr, int target) {
        // First find the range
        int start = 0;
        int end = 1;

        // Expand range until target <= arr[end] or end crosses array length
        while (end < arr.length && target > arr[end]) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2; // double the range size
            start = temp;
        }

        // To prevent ArrayIndexOutOfBounds in finite arrays
        if (end >= arr.length) {
            end = arr.length - 1;
        }

        // Now do binary search in the found range
        return binary_Search(arr, target, start, end);
    }

    static int binary_Search(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid; // target found
            }
        }
        return -1; // target not found
    }
}
