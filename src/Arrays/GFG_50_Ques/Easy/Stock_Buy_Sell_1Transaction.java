package Arrays.GFG_50_Ques.Easy;


import java.util.Scanner;

class Stock_Buy_Sell_1Transaction {

    static int maxProfit(int[] prices) {
        int n = prices.length;
        int res = 0;

        // Explore all possible ways to buy and sell stock
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                res = Math.max(res, prices[j] - prices[i]);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array.");
        int n = sc.nextInt();

        System.out.println("Enter the elements of the array.");
        int prices[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter the element arr[%d] : ", i);
            prices[i] = sc.nextInt();
        }
        System.out.println(maxProfit(prices));
    }
}