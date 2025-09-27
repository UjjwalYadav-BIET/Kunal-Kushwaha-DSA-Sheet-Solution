package LeetCode;

// This question is solved through the help of the striver Sir.
import java.util.Scanner;

public class P33_Search_Element_InRotated_SortedArray {
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
        System.out.println(search(arr,target));

    }
    static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        while (start <= end) {
            int mid = (start+end) / 2;
            if (arr[mid]==target){
                return mid;
            } else if (arr[start] <= arr[mid] ) {
                if (arr[start]<=target && target<=arr[mid]) {
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            } else {
                if (arr[mid] <= target && target <= arr[end]) {
                    start = mid + 1;
                }else {
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}
