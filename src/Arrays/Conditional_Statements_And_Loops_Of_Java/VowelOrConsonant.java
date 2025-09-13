package Arrays.Conditional_Statements_And_Loops_Of_Java;

import java.util.Scanner;
//Q. 3. Write a program to Check whether a character is a vowel or consonant using switch statement
public class VowelOrConsonant{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the any Character.");
        char ch = sc.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant!");
        }
    }
}
