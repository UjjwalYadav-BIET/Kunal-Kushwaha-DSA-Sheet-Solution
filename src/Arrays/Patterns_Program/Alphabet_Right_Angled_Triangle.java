package Arrays.Patterns_Program;

import java.util.Scanner;

public class Alphabet_Right_Angled_Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows.");
        int n = in.nextInt();

        for (int i = 1; i <= n ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print((char)('A'+j)+" ");
            }
            System.out.println();
        }
        
    }
}
