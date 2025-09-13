package Arrays.Conditional_Statements_And_Loops_Of_Java;

import java.util.Scanner;

public class Largest_Among3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number.");
        int num1 = input.nextInt();
        System.out.println("Enter the second number.");
        int num2 = input.nextInt();
        System.out.println("Enter the third number.");
        int num3 = input.nextInt();
//        if(num1>num2 && num1>num3){
//            System.out.println("The greatest number is : "+num1);
//        }else if(num2>num1 && num2>num3){
//            System.out.println("The greatest number is : "+num2);
//        }else{
//            System.out.println("The greatest number is : "+num3);
//        }
        //By using the inbuilt function.
        int Max = Math.max(num3,Math.max(num1,num2));
        System.out.println(Max);
    }
}
