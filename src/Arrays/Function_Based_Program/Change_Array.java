package Arrays.Function_Based_Program;

import java.util.Arrays;

public class Change_Array {
    public static void main(String[] args) {
        int [] arr = {1,3,45,86,9};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void change(int [] nums){
        nums[0] = 98;
    }
}
