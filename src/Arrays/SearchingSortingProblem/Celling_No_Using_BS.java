package Arrays.SearchingSortingProblem;

public class Celling_No_Using_BS {
    public static void main(String[] args) {
        int[] arr = {-12, -5, -1, 0, 4, 8, 9, 19};
        int target = 9;
        int ans = binary_Search(arr, target);
        System.out.printf("Element %d is at position %d",target,ans);
    }

    static int binary_Search(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // Finding the target element......
            // int mid = (start+end)/2 this might show the error in the some cases because it can go beyond the limit of the integer type.
            int mid = start + (end - start) / 2; /// that's why we use this formula.
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return start;
    }

}
