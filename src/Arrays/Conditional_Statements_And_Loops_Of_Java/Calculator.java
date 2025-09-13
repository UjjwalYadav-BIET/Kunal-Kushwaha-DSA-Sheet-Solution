package Arrays.Conditional_Statements_And_Loops_Of_Java;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the operator.");
        char op=sc.next().trim().charAt(0);
        float ans;
        if (op=='+'||op=='-'||op=='%'||op=='*'||op=='/') {

            System.out.println("Write the number one.");
            float n1=sc.nextInt();
            System.out.println("Enter the number two.");
            float n2 = sc.nextInt();
            if (op=='+'){
                ans = n1+n2;
                System.out.println("Your Answer = "+ans);
            }else if (op=='-'){
                ans = n1-n2;
                System.out.println("Your Answer = "+ans);
            }else if (op=='*'){
                ans = n1*n2;
                System.out.println("Your Answer = "+ans);
            }else if (op=='/'){
                ans = n1/n2;
                System.out.println("Your Answer = "+ans);
            } else {
                ans = n1%n2;
                System.out.println("Your Answer = "+ans);
            }

        }else {
            System.out.println("Enter the valid operator");
        }
    }
}
