package Arrays.Function_Based_Program;

import java.util.Scanner;

public class Swap_2No {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        swap(x,y);
    }
    static void swap(int a, int b){
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("A = "+a);
        System.out.println("B = "+b);
    }
}
