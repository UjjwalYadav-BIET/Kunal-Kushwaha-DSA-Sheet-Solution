package Arrays.Patterns_Program;

import java.util.Scanner;

public class Hollow_Diamond_In_Square {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size (odd number): ");
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // print border or diagonals
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1 || i == j || i + j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        in.close();
    }
}
