package Arrays.Conditional_Statements_And_Loops_Of_Java;

import java.util.Scanner;
//Q. 2. Write a program to read gender(M/F) and print the corresponding gender using a switch statement
public class Gender_Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first letter of the gender.");
        char gen = sc.next().charAt(0);
        switch (gen){
            case 'M' -> System.out.println("Male ");
            case 'F' -> System.out.println("Female");
            default -> System.out.println("Enter the valid Gender's first letter.");
        }
    }
}
