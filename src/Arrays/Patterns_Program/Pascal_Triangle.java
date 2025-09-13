package Arrays.Patterns_Program;

import java.util.Scanner;

public class Pascal_Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            // print leading spaces for alignment
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            int num = 1; // first number in every row
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                // compute next value using binomial coefficient
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }

        in.close();
    }
}
