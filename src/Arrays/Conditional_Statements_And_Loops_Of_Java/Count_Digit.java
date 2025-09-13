package Arrays.Conditional_Statements_And_Loops_Of_Java;

import java.util.Scanner;

public class Count_Digit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number.");
        long n = input.nextInt();
        long count=0;
        while (n>0){
            long rem = n%10;
            if (rem==7){
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
    }
}
