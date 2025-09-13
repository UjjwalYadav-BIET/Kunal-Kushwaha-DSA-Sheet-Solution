package Arrays.Conditional_Statements_And_Loops_Of_Java;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number.");
        int num = input.nextInt();
        int ans=0;
        while (num>0){
            int rem = num%10;
            num/=10;
            ans= ans*10+rem;
        }
        System.out.println(ans);
    }
}
