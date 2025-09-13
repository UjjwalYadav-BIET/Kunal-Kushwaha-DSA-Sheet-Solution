package Arrays.Conditional_Statements_And_Loops_Of_Java;

import java.util.Scanner;
//Q.6. Write a program to create simple calculator using switch Statement
public class Calculator_Using_Switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the operator.");
        char op=sc.next().trim().charAt(0);
        float ans;
        switch (op) {
            case '+', '-', '%', '*', '/' -> {

                System.out.println("Write the number one.");
                float n1 = sc.nextInt();
                System.out.println("Enter the number two.");
                float n2 = sc.nextInt();
                switch (op) {
                    case '+' -> {
                        ans = n1 + n2;
                        System.out.println("Your Answer = " + ans);
                    }
                    case '-' -> {
                        ans = n1 - n2;
                        System.out.println("Your Answer = " + ans);
                    }
                    case '*' -> {
                        ans = n1 * n2;
                        System.out.println("Your Answer = " + ans);
                    }
                    case '/' -> {
                        ans = n1 / n2;
                        System.out.println("Your Answer = " + ans);
                    }
                    default -> {
                        ans = n1 % n2;
                        System.out.println("Your Answer = " + ans);
                    }
                }
            }
            default -> System.out.println("Enter the valid operator");
        }
    }
}
