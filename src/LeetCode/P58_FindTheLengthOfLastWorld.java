package LeetCode;

import java.util.Scanner;

public class P58_FindTheLengthOfLastWorld {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string.");
        String str = in.next();
        System.out.println(lengthOfLastWord(str));
    }
    public static int lengthOfLastWord(String s) {
        // Trim the string to remove trailing and leading spaces
        s = s.trim();

        // Find the last space in the trimmed string
        int lastSpace = s.lastIndexOf(' ');

        // The length of the last word is the total length minus index of last space minus one
        return s.length() - lastSpace - 1;
    }
}
