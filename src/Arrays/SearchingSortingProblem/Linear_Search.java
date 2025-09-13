package Arrays.SearchingSortingProblem;

import java.util.Scanner;

public class Linear_Search {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array.");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element of the array.");
        for (int i = 0; i <n ; i++) {
            System.out.printf("Enter the element arr[%d] : ",i);
            arr[i]=in.nextInt();
        }

        System.out.print("The entered array :- ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.println("Now enter the element which you want to search.");
        int ser = in.nextInt();

        for (int i = 0; i < n; i++) {
            if (arr[i]==ser) {
                System.out.println("Your element " +arr[i]+" is at the position :- "+i);
            }
        }

    }
}
