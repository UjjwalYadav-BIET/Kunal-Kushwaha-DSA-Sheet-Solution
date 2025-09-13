package Arrays.Conditional_Statements_And_Loops_Of_Java;

import java.util.Scanner;
//Q. 3. Write a program to Check whether a character is a vowel or consonant using switch statement
public class Check_Vowel_Consonant{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the any Character.");
        char ch = sc.next().charAt(0);
        switch(ch){
            case 'a','e','i','o','u','A','E','I','O','U' -> System.out.println("Vowel");
            default -> System.out.println("Consonant!");
        }
    }
}
