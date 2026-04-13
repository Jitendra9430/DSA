import java.util.*;

public class Sort01{

    //Better Force 
    public static void sort012(int[]arr) {
        int cnt0 = 0;
        int cnt1 = 0;
        int cnt2 = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0) {
                cnt0++;
            } else if(arr[i] == 1) {
                cnt1++;
            } else{
                cnt2++;
            }
        }
        int i = 0;
        while(cnt0 > 0){
            arr[i] = 0;
            i++;
            cnt0--;
        }
        while(cnt1 > 0){
            arr[i] = 1;
            i++;
            cnt1--;
        }
        while(cnt2 > 0){
            arr[i++] = 2;
            cnt2--;
        }

    }

    //Optimal using Dutch National Flag Algorithm

    public static void sortArray(int[] arr){
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while(mid <= high){
            if(arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }
            else if (arr[mid] == 1) {
                mid++;
                
            } else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size if the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        //sort012(arr);
        sortArray(arr);

        System.out.println("Sorted array is:");
        for(int num : arr) {
            System.out.print(num +" ");
        }
        sc.close();
    }
    
}