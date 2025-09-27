package LeetCode;

// This program is basically used to return the index of the peak element.
public class P852_PeakIndexInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4,3,2,1};
        System.out.println("Index of the peak element : "+PeakIndex(arr));

    }
    static int PeakIndex(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while (start<end) {
            int mid = start + (end-start) / 2;
            if (arr[mid]>arr[mid+1]) {
                //You are in the decreasing part of the array
                // this may be the answer, but look at the left
                //this is why end != mid - 1;
                end = mid ;
            }
            else {
                // We are in the increasing part of the array.
                start = mid + 1;
            }
        }
        return start; // or return end
    }
}
