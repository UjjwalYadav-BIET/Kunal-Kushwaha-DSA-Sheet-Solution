package Arrays.Conditional_Statements_And_Loops_Of_Java;

import java.util.Scanner;

public class Switch_Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the fruit name.");
        String F_name = sc.next();
        switch (F_name) { // We replace Traditional switch with the new switch case.
            case "Mango" -> System.out.println("King of the fruit.");
            case "Apple" -> System.out.println("Red in the color.");
            case "Grapes" -> System.out.println("Small in size.");
            case "Orange" -> System.out.println("Sour in taste.");
            default -> System.out.println("Enter the valid fruit name.");
        }
    }
}
