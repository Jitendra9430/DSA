 import java.util.Scanner;

public class LargestElement {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int large = arr[0];
        for(int i=0; i < n; i++){
            if(arr[i] > large) {
                large = arr[i];
            }
        }

        System.out.println("Largest element is: " + large);
        sc.close();
        

    }

} 
