package Arrays.SearchingSortingProblem;

import java.util.Arrays;
import java.util.Scanner;

public class Bubble_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,4,3,6};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
        System.exit(0);
    }
    static void bubble(int[] nums) {
        boolean swap;
        for (int i = 0; i < nums.length; i++) {
            swap = false;
            for (int j = 1; j < nums.length-i; j++) {
                if (nums[j] < nums[j-1]) {
                    // Now swap the numbers
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
    }
}
