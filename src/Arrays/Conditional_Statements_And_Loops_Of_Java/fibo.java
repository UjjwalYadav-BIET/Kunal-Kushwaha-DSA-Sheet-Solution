package Arrays.Conditional_Statements_And_Loops_Of_Java;

import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the series.");
        int n = input.nextInt();
        int a=0;
        int b=1;
        for (int i=1;i<=n;i++){
            System.out.println(a);
            int c = a + b;
            a=b;
            b=c;
        }
    }
}
