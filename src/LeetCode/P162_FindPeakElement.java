package LeetCode;

public class P162_FindPeakElement {
    public static void main(String[] args) {
        int[] arr = {1,3,4,6,5,3,4,1};
        System.out.println("Peak Element is at the index : "+findPeakElement(arr));
    }
    static int findPeakElement(int[] arr) {
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
