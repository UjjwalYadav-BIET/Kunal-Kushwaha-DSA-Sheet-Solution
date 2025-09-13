package Arrays.Conditional_Statements_And_Loops_Of_Java;

import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number.");
        int num = sc.nextInt();
        if (num%2==0) {
            System.out.println("Entered number is even.");
        } else {
            System.out.println("Entered number is Odd.");
        }
    }
}
