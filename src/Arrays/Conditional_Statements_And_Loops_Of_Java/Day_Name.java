package Arrays.Conditional_Statements_And_Loops_Of_Java;

import java.util.Scanner;

public class Day_Name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day number.");
        int day = sc.nextInt();
        //By using the new syntax of the switch case statement we can remove using break statement again and again.[
        switch(day){
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednesday");
            case 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("Friday");
            case 7 -> System.out.println("Saturday");
            default -> System.out.println("Enter the valid day number.");
        }
    }
}
