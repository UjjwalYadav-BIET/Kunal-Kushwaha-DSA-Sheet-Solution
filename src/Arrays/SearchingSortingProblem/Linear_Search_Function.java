package Arrays.SearchingSortingProblem;

public class Linear_Search_Function {

    public static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] data = {10, 25, 3, 47, 8, 19, 32};
        int valueToFind = 8;

        int result = search(data, valueToFind);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
