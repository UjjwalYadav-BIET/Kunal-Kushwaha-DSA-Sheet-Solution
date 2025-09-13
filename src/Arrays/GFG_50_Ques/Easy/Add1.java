package Arrays.GFG_50_Ques.Easy;

import java.util.Scanner;

public class Add1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array.");
        int n = sc.nextInt();

        System.out.println("Enter the elements of the array.");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter the element arr[%d] : ", i);
            arr[i] = sc.nextInt();
        }

        int[] res = addOne(arr);
        System.out.println("Array after adding one.");
        for (int j = 0; j < res.length; j++) {
            System.out.print(res[j]+" ");
        }

    }


    static int[] addOne(int[] arr) {

        int carry = 1;

        for(int i = arr.length - 1; i >= 0; i--) {
            int sum = arr[i] + carry;
            arr[i] = sum % 10;
            carry = sum / 10;
        }

        if(carry > 0) {
            int[] newArr = new int[arr.length + 1];
            newArr[0] = carry;
            System.arraycopy(arr, 0, newArr, 1, arr.length);
            return newArr;
        }

        return arr;
    }

}
