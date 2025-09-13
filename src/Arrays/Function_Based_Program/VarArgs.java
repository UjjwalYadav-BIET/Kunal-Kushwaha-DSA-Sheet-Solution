package Arrays.Function_Based_Program;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(23,3,4,2,5,6,5,8,89,6,0); // Since it means we can print the multiple arguments inside the function.
        fun2(2,4,4233,542,5,2,5,3,6,3);
    }



    // Possible
    static void fun2(int a, int b,int ...v){ // Variable length argument should be at the length.Means fun2(int ...vint a, int b) it is not possible.
        System.out.println(Arrays.toString(v));// We can pass only one parameter in this.
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
