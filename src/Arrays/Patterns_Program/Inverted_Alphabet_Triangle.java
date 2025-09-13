package Arrays.Patterns_Program;

import java.util.Scanner;

public class Inverted_Alphabet_Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print((char)('A'+j)+" ");
            }
            System.out.println();
        }

    }
}
