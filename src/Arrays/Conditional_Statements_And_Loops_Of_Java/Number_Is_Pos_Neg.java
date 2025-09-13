package Arrays.Conditional_Statements_And_Loops_Of_Java;

import java.util.Scanner;

public class Number_Is_Pos_Neg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number.");
        int num = sc.nextInt();
        if(num<0){
            System.out.println("Entered number is the negative number.");
        } else if (num>0) {
            System.out.println("Entered number is the positive number.");
        } else {
            System.out.println("Entered number is zero.");
        }
    }
}
