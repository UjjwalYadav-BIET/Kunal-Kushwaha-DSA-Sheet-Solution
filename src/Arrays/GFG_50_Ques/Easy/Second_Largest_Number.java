package Arrays.GFG_50_Ques.Easy;

import java.util.Scanner;

public class Second_Largest_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array.");
        int size = in.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of the array.");
        for (int i=0; i<size; i++) {
            System.out.printf("Enter element at arr[%d] : ",i);
            arr[i] =in.nextInt();
        }

        int temp;
        for (int i=0; i<size; i++) {
            for (int j=i+1; j<size; j++) {
                if (arr[i]<arr[j]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println("Second Largest Element : "+arr[1]);
    }
}
