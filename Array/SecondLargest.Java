import java.util.*;


public class SecondLargest {

    //Brute force approach
    public static int findSecondLargest(int[] arr, int n){
        Arrays.sort(arr);
        for(int i=n-2; i>=0; i--){
            if(arr[i] != arr[n-1]){
                return arr[i];
            }
        }
        return -1;

    }

    //Better Approach
    public static int findSecondLargestElement(int[] arr, int n){
        int largest = arr[0];
        int secondLargest = -1;
        for(int i=1; i<n; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }

        }  
        for(int i=0; i<n; i++){
            if(arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    //Optimal Approach
    public static int SecondLargest(int[] arr, int n){
        int largest = arr[0]; 
        int secLargest = -1;
        for(int i=1; i<n; i++){
            if(arr[i] > largest){
                secLargest = largest;
                largest = arr[i];
            } else if(arr[i] > secLargest && arr[i] < largest){
                secLargest = arr[i];
            }
        }
        return secLargest;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:"); 
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<n; i++){ 
            arr[i] = sc.nextInt();
        }
        //int result = findSecondLargest(arr, n);
        //int result = findSecondLargestElement(arr, n);
        int result = SecondLargest(arr, n);
        if(result == -1){
            System.out.println("No second largest element");
        } else{
            System.out.println("Second largest element is:" + result);
        }
        sc.close();
    }
 
}