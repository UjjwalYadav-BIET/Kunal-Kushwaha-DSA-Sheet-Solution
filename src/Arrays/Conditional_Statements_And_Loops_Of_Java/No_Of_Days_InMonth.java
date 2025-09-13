package Arrays.Conditional_Statements_And_Loops_Of_Java;

import java.util.Scanner;
//Q. 5. Write a program to Find the number of days in a month using a switch statement
public class No_Of_Days_InMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the month.");
        String month = sc.next();
        switch (month) {
            case "January" -> System.out.println("No. of days are 31.");
            case "February" -> System.out.println("No. of days are 28.");
            case "March" -> System.out.println("No. of days are 31.");
            case "April" -> System.out.println("No. of days are 30.");
            case "May" -> System.out.println("No. of days are 31.");
            case "june" -> System.out.println("No. of days are 30.");
            case "July" -> System.out.println("No. of days are 31.");
            case "August" -> System.out.println("No. of days are 31.");
            case "September" -> System.out.println("No. of days are 30.");
            case "October" -> System.out.println("No. of days are 31.");
            case "November" -> System.out.println("No. of days are 30.");
            case "December" -> System.out.println("No. of days are 31.");
            default -> System.out.println("Enter the valid month.");
        }
    }
}
