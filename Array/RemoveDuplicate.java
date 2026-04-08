//Remove duplicate in-place from sorted array
import java.util.*;

public class RemoveDuplicate{
    
    //Brute force using set collection 
    public static  int removeDuplicate(int[] arr){
        Set <Integer> set = new LinkedHashSet<>();
        for(int i=0; i<arr.length; i++){
            set.add(arr[i]);
        }
        int index = 0;
        for(int val : set){
            arr[index++]= val;
        }
        return index;

    }

    //Optimal approach using two pointer technique
    public static int removeDuplicates(int[] arr){
        int i=0; 
        for(int j=1; j<arr.length; j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        
        }
        return i+1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter sorted elements:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();

        }
        //int newLength = removeDuplicate(arr);
        int newLength = removeDuplicates(arr);
        System.out.println("Unique elements:");
        for(int i=0; i<newLength ; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();

    }
}