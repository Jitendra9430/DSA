import java.util.*;

//FIND THE MAXIMUM SUBARRAY 
public class MaxSubArray{

    // Brute Force
    public static int maxSubArray(int[] arr) {
    int maxi = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
        for (int j = i; j < arr.length; j++) {
            int sum = 0;
            for (int k = i; k <= j; k++) {
                sum += arr[k];
            }
            maxi = Math.max(maxi, sum);
        }
    }

    return maxi;
    }

    //Better Approach

    public static int maxSubArrayBetter(int[] arr) {
        int maxi = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            int sum = 0;
            for(int j=i; j<arr.length; j++){
                sum += arr[j];
                maxi = Math.max(sum, maxi);
            }
            
        }
        return maxi;
    }

    //Optimal Approach using Kadane's Algorithm
    public static int MaxSubArrayKadane(int[] arr) {
        int sum =0;
        int maxi = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            maxi = Math.max(sum, maxi);
            if(sum < 0) sum=0;
        }
        return maxi;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter ther array elements");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        //int subarray = MaxSubArrayKadane(arr);
        //int subarray = MaxSubArray(arr);
        int subarray = maxSubArrayBetter(arr);
        System.out.println("Maximum subarray is:" + subarray);
    }
}