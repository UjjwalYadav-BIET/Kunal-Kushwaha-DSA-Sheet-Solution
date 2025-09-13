package Arrays.Conditional_Statements_And_Loops_Of_Java;

import java.util.Scanner;

public class ToCountNotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Amount.");
        int amt = sc.nextInt();
        System.out.println("note count for the amount.");
        if (amt>=500){
            int count = amt/500;
            amt = amt%500;
            System.out.println("500 x "+count);
        }if (amt>=200){
            int count = amt/200;
            amt = amt%200;
            System.out.println("200 x "+count);
        }if (amt>=100){
            int count = amt/100;
            amt = amt%100;
            System.out.println("100 x "+count);
        }if (amt>=50){
            int count = amt/50;
            amt = amt%50;
            System.out.println("50 x "+count);
        }if (amt>=10){
            int count = amt/10;
            amt = amt%10;
            System.out.println("10 x "+count);
        }
    }
}
