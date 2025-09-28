package LeetCode;

// This question is solved through the help of the striver Sir.
import java.util.Scanner;

public class P81_Search_Element_InRotated_SortedArrayII {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array.");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element of the array !!!!");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the element which you want to search!!!!!");
        int target = in.nextInt();
        System.out.println("Result : "+search(arr,target));

    }
    static boolean search(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return true;
            }

            // When duplicates exist, skip them
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                start++;
                end--;
            }
            else if (arr[start] <= arr[mid]) { // left half sorted
                if (arr[start] <= target && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            else { // right half sorted
                if (arr[mid] < target && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return false;
    }
}
