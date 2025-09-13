package Arrays.Conditional_Statements_And_Loops_Of_Java;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input the Salary.");
        int Salary = input.nextInt();
        if (Salary>10000){
            System.out.println("Incremented Salary =>"+(Salary+2000));
        } else {
            System.out.println("Incremented Salary =>"+(Salary+1000));
        }
    }
}
