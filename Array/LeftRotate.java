import java.util.*;
public class LeftRotate {
     

    // Function to left rotate an array by one position
    public static void leftRotateByOne(int[] arr, int n){
        if(n <= 1) return;

        int temp = arr[0];
        for(int i=1; i<n; i++) {
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
    }

    // Function to left rotate an array by d positions
    //Brute Force Approach
    public static void leftRotateByDPos(int[] arr, int n, int d) {
        if(d <= 0 || d >= n) return;
        int temp[] = new int[d];
        for(int i=0; i<d; i++){
            temp[i] = arr[i];
        }
        for(int i=d; i<n; i++){
            arr[i-d] = arr[i];
        }
        //int j=0;
        for(int i=n-d; i<n; i++){
            arr[i] = temp[i-(n-d)];
            //j++;
        }
    }

    //Reversal Function
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    //Optimal Approach
     public static void leftRotateByK(int[] arr, int n, int k) {
        if (n <= 1) return;

        k = k % n; // handle k > n

        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);
    }


    //Function to print an array
    public static void printArray(int[] arr, int n) {
        for(int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main (String args[]) {
        int d= 3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of array:");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        //leftRotateByOne(arr, n);
        //leftRotateByDPos(arr, n, d);
        leftRotateByK(arr, n, d);

        System.out.println("Array after left rotation:");
        printArray(arr, n);

        sc.close();
    }


}