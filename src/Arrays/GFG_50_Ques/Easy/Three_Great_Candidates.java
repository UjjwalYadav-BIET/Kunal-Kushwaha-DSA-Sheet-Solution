package Arrays.GFG_50_Ques.Easy;

import java.util.Scanner;

public class Three_Great_Candidates {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array.");
        int size = in.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of the array.");
        for(int i = 0; i< size; i++) {
            System.out.printf("Enter element at arr[%d] : ",i);
            arr[i] = in.nextInt();
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

        int[] Great_Three = new int[3];
        System.out.print("The First three great are : ");
        for(int i=0; i<3; i++) {
            Great_Three[i] = arr[i];
            System.out.print(Great_Three[i]+" ");
        }
        System.out.println();
        int great = Great_Three[0]*Great_Three[1]*Great_Three[2];
        System.out.println("Maximum product of a triplet : "+great);

    }
}
