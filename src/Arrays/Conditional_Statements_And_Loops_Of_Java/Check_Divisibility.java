package Arrays.Conditional_Statements_And_Loops_Of_Java;

import java.util.Scanner;

public class Check_Divisibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number.");
        int num = sc.nextInt();
        if (num%5==0 && num%11==0 ){
            System.out.println("Entered number is divisible 5 and 11");
        } else {
            System.out.println("Entered number is not divisible 5 and 11");
        }
    }
}
