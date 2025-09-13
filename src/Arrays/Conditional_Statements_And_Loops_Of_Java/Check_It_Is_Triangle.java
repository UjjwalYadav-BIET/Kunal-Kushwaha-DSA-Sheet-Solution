package Arrays.Conditional_Statements_And_Loops_Of_Java;

import java.util.Scanner;

public class Check_It_Is_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the computer.");
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        if ((s1+s2)>s3 && (s2+s3)>s1 && (s1+s3)>s2) {
            System.out.println("Since entered sides are of valid triangle.");
        } else {
            System.out.println("Since it is not the valid triangle.");
        }
    }
}
