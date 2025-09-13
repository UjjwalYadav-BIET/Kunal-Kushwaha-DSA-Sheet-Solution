package Arrays.Patterns_Program;

import java.util.Scanner;

public class Repeated_Alphabet_Pattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char)('A'+i)+" ");
            }
            System.out.println();
        }
    }
}
