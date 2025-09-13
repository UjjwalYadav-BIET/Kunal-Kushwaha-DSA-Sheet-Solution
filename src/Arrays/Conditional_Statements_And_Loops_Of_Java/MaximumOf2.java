package Arrays.Conditional_Statements_And_Loops_Of_Java;

import java.util.Scanner;

public class MaximumOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two number.");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a>b){
            System.out.println("Greatest number is "+a);
        } else {
            System.out.println("Greatest number is "+b);
        }
    }
}
