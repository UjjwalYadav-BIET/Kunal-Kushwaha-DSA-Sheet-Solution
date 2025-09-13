package Arrays.Patterns_Program;

import java.util.Scanner;

public class Inverted_Pyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            // print leading spaces
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            // print stars
            for (int j = 0; j < (2 * (n - i) - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        in.close();
    }
}
