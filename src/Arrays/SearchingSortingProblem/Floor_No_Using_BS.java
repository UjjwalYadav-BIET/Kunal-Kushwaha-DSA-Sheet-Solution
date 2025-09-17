package Arrays.SearchingSortingProblem;

public class Floor_No_Using_BS {

    static int floor (int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while (start<=end) {
            int mid = start + (end - start) / 2; /// that's why we use this formula.
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return end;
    }

    public static void main(String[] args) {
        int[] arr = {-12, -5, -1, 0, 4, 8, 9, 19};
        int target = 3;
        int ans = floor(arr, target);
        System.out.println("The floor of the target number is at index : "+ans+" and the number is "+arr[ans]);
    }
}
