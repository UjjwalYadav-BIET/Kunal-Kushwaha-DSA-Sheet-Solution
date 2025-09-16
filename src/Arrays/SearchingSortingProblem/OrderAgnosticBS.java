package Arrays.SearchingSortingProblem;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        // Example test
        int[] arr1 = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22};
        int[] arr2 = {99, 85, 70, 60, 42, 35, 21, 10, 5, 1};

        OrderAgnosticBS obs = new OrderAgnosticBS();

        System.out.println("Index in ascending array: " + obs.orderAgnosticBS(arr1, 15));
        System.out.println("Index in descending array: " + obs.orderAgnosticBS(arr2, 60));
    }

    public int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

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
}
