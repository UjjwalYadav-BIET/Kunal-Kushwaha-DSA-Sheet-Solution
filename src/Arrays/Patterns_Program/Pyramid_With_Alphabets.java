package Arrays.Patterns_Program;

import java.util.Scanner;

public class Pyramid_With_Alphabets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            // print leading spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            // ascending part
            for (int j = 0; j < i; j++) {
                System.out.print((char)('A' + j));
            }

            // descending part
            for (int j = i - 2; j >= 0; j--) {
                System.out.print((char)('A' + j));
            }

            System.out.println();
        }

        in.close();
    }
}
