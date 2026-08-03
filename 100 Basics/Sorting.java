import java.util.*;

public class Sorting {

    public static void selectionSort(int[] arr, int n) {
        for(int i=0; i <= n-2; i++) {
            int mini = i;
            for(int j = i; j <= n-1; j++) {
                if(arr[j] < arr[mini]) {
                    mini = j;
                } 
            }
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
    }

    public static void bubble_sort(int[] arr, int n) {
        for(int i = n-1; i >= 0; i--){
            int didSwap = 0;
            for(int j=0; j <= i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    didSwap = 1;
                }
            }
            if(didSwap == 0) {
                break;
            }
            
        }
    }

    public static void insertion_sort(int[]arr, int n ) {
        for(int i=0; i <= n-1; i++) {
            int j = i;
            while( j > 0 && arr[j] < arr[j-1] ){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();

        }
        // selectionSort(arr, n);
        // System.out.println("Sorted array:");
        // for(int i = 0; i < n; i++){
        //     System.out.print(arr[i] + " ");
        // }

        // bubble_sort(arr, n);
        // System.out.println("Sorted array:");
        // for(int i = 0; i < n; i++){
        //     System.out.print(arr[i] + " ");
        // }

        insertion_sort(arr, n);
        System.out.println("Sorted array:");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

