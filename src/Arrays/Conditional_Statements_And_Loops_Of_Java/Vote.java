package Arrays.Conditional_Statements_And_Loops_Of_Java;

import java.util.Scanner;

// Q. Write a program to check whether a person is eligible to vote or Not using switch statement
public class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age.!!!!");
        int age = sc.nextInt();
        int status;
        if (age>=18){
            status =0;
        }else{
            status=1;
        }
        switch (status){
            case 0 -> System.out.println("You are eligible for vote.");
            case 1 -> System.out.println("You are not eligible for vote.");
        }
    }
}
