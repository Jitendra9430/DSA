import java.util.*;

public class BuyAndSellStock{


    // Best aprroach by using Kadane's Algo.
    public static int buySellStock(int[] prices){
        int mini = prices[0];
        int maxProfit = 0;
        for(int i=0; i<prices.length; i++){
            int cost = prices[i] - mini;
            maxProfit = Math.max(maxProfit, cost);
            mini = Math.min(mini,  prices[i]);
        }

        return maxProfit;
    }

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int profit = buySellStock(arr);
        System.out.print("The maximum profit is:" + profit);

        sc.close();
    }
}