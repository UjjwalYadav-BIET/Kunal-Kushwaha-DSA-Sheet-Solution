package Arrays.Conditional_Statements_And_Loops_Of_Java;

import java.util.Scanner;

public class Nested_Switch_Case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day number.");
        int day = sc.nextInt();
        switch (day){
            case 1,2,3,4,5 -> System.out.println("Weekday");
            case 6,7 -> System.out.println("Weekend");
        }
    }
}
