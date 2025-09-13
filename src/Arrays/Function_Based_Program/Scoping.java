package Arrays.Function_Based_Program;

import java.util.Scanner;

public class Scoping {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
//        System.out.println(num);//Not possible because it is not allowed.

    }
    static void random(int a){ //Same as for the arguments.(We can access these arguments only in the random function.)
        Scanner sc = new Scanner(System.in);
        // Since the variable num is only accessible inside the function Random, so it is called as Function scope.
        int num = sc.nextInt();
        System.out.println(num);
        // Scoping in for loop.
        for (int i =0;i<=9;i++){ // since the variable i is only accessible inside the only for loop.
            System.out.println("Rahul.");
        }
    }
}
