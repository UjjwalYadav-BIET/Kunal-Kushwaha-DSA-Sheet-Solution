package Arrays.Patterns_Program;

import java.util.Scanner;

public class Diamond_With_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // decreasing numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }


            System.out.println();
        }

        for (int i = n-1; i >= 1; i--) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // decreasing numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }


            System.out.println();
        }



        in.close();
    }
}
