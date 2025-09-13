package Arrays.Conditional_Statements_And_Loops_Of_Java;

import java.util.Scanner;

public class MaximumOf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three number.");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a>b && a>c) {
            System.out.println("Greatest number is "+a);
        } else if (b>a && b>c){
            System.out.println("Greatest number is "+b);
        } else {
            System.out.println("Greatest number is "+c);
        }
    }
}
