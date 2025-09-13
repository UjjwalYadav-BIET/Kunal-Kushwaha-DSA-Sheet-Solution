package Arrays.Conditional_Statements_And_Loops_Of_Java;

import java.util.Scanner;

public class Profit_Loss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the Selling price");
        int SP = sc.nextInt();
        System.out.println("Enter the value of the Cost price");
        int CP = sc.nextInt();
        if (SP>CP){
            int profit = SP-CP;
            System.out.println("Profit = "+profit);
        } else if(CP>SP) {
            int loss = CP-SP;
            System.out.println("Loss = "+loss);
        } else {
            System.out.println("No profit no loss.");
        }
    }
}
