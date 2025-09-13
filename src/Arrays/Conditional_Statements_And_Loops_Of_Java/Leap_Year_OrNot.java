package Arrays.Conditional_Statements_And_Loops_Of_Java;

import java.util.Scanner;

public class Leap_Year_OrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year to check it is leap or not.");
        int yr = sc.nextInt();
        if (yr % 4 == 0 && yr % 100 != 0 || yr%400 == 0 ) {
            System.out.println(yr + " year is the leap year.");
        } else {
            System.out.println(yr + " is not the leap year.");
        }
    }
}
