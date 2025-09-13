package Arrays.Conditional_Statements_And_Loops_Of_Java;

import java.util.Scanner;

public class Alph_Char_Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the any character, alphabet and digit.");
        char ch = sc.next().charAt(0);
        if (ch>='a' && ch<='z'|| ch>='A' && ch<='Z'){
            System.out.println("It is Alphabet.");
        } else if (ch>='0' && ch<='9') {
            System.out.println("Entered character is the digit.");
        } else {
            System.out.println("It is a special symbol.");
        }
    }
}
