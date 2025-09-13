package Arrays.Conditional_Statements_And_Loops_Of_Java;

import java.util.Scanner;

public class Loop_Exm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // For Loop ------
        // Q. Print from 1 to 5
//        for (int i =1;i<=5;i++){
//            System.out.println(i);
//        }

        //Q. Numbers from 1 to n
//        System.out.print("Enter the any number:");
//        int n = input.nextInt();
//        for (int j=1;j<=n;j++) {
//            System.out.println(j);
//        }
        //<--------------------------------------->

        //While Loop
//        System.out.println("Enter the number:");
//        int n = input.nextInt();
//        int i=1;
//        while(i<=n){
//            System.out.println(i);
//            i++;
//        }

        // Do While
        int n = 1;
        do {
            System.out.println(n);
            n++;
        }while(n<=5);

    }
}
