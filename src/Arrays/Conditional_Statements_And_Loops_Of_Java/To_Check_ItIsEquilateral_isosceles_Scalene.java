package Arrays.Conditional_Statements_And_Loops_Of_Java;

import java.util.Scanner;

public class To_Check_ItIsEquilateral_isosceles_Scalene {
    // To determine whether a triangle is equilateral, isosceles, or scalene, you can use the lengths of its three sides, say a, b, and c:
    //Equilateral Triangle: All three sides are equal.
    //Condition: a == b == c
    //Isosceles Triangle: Exactly two sides are equal.
    //Condition: (a == b && b != c) || (a == c && b != c) || (b == c && a != b)
    //Scalene Triangle: All three sides are different.
    //Condition: a != b && b != c && a != c
    //
    //Ensure the sides satisfy the triangle inequality theorem:
    //a + b > c && a + c > b && b + c > a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the triangle.");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a==b && b==c) {
            System.out.println("Its a Equilateral triangle.");
        } else if((a == b && b != c) || (a == c && b != c) || (b == c && a != b)){
            System.out.println("It is a Isosceles triangle.");
        } else {
            System.out.println("Its is a Scalene triangle.");
        }
    }
}
