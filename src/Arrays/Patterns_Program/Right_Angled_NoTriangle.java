package Arrays.Patterns_Program;

import java.util.Scanner;

public class Right_Angled_NoTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows for star printing.");
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
