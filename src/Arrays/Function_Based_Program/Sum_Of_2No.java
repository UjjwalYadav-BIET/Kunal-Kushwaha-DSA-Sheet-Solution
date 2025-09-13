package Arrays.Function_Based_Program;

import java.util.Scanner;

public class Sum_Of_2No {
    public static void main(String[] args) {
        int ans = sum();
        System.out.println("Required answer = "+ans);
    }

    //Return the value integer,
    static int sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number 1.");
        int a = in.nextInt();
        System.out.println("Enter the number 2.");
        int b = in.nextInt();
        return a+b;
    }

    //THis function has the return value void, so it doesn't return the any value.
    static void Sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number 1.");
        int a = in.nextInt();
        System.out.println("Enter the number 2.");
        int b = in.nextInt();
        int c = a+b;
        System.out.println("The sum of the two number. "+c);
    }
}
