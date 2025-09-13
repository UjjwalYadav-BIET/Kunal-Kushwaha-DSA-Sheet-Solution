package Arrays.Conditional_Statements_And_Loops_Of_Java;

import java.util.Scanner;
//Q. 4. Write a program to Check whether the number is even or odd using switch statement
public class Even_OddBySCase {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number.");
        int n = sc.nextInt();
        n = n%2;
        switch (n) {
            case 0 -> System.out.println("Number is Even.");
            default -> System.out.println("Number is Odd.");
        }
    }
}
