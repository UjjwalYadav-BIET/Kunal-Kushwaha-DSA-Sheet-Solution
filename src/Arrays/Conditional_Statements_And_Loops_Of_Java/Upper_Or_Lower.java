package Arrays.Conditional_Statements_And_Loops_Of_Java;

import java.util.Scanner;

public class Upper_Or_Lower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character");
        char ch = sc.next().charAt(0);
        if (ch>='A' && ch<='Z') {
            System.out.println("Upper Case");
        } else if (ch>='a' && ch<='z') {
            System.out.println("Lower case.");
        } else {
            System.out.println("Enter the valid character.");
        }
    }
}
