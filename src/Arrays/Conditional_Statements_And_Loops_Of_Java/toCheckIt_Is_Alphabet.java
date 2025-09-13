package Arrays.Conditional_Statements_And_Loops_Of_Java;

import java.util.Scanner;

public class toCheckIt_Is_Alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character.");
        char ch = sc.next().charAt(0);
        if (ch>='a' && ch<='z'|| ch>='A' && ch<='Z' ) {
            System.out.println("Entered character is Alphabet.");
        } else {
            System.out.println("It is the not the alphabet.");
        }
    }
}
