package Arrays.Patterns_Program;

import java.util.Scanner;

public class ReverseTriangle {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        System.out.println("Enter the number of rows to be print.");
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = n; j >i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
