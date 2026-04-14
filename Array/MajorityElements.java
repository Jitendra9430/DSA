import java.util.*;

//Majority Elements > N/2 

public class MajorityElements{

    //Brute Force Approach O(n^2) time complexity and O(1) space complexity

    public static int majorityElement(int arr[]){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i] == arr[j]) {
                    count++;
                }
                if(count > arr.length/2) {
                    return arr[i];
                }
            }
        }
        return -1;
    }

    //Better Approach O(n) time complexity and O(n) space complexity
    public static int majorityElementBetter(int arr[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
            if(map.get(arr[i]) > arr.length/2) {
                return arr[i];
            }
        }
        return -1;
    }

    // Optimal Approach O(n) time complexity and O(1) space complexity by using Boyer-Moore Voting Algorithm
    public static int majorityElementOptimal(int arr[]){
        int cnt = 0;
        int el = 0;
        for(int i=0; i<arr.length; i++){
            if(cnt == 0){
                el = arr[i];
                cnt = 1;
            } else if(arr[i] == el) {
                cnt++;
            }
            else{
                cnt--;
            }
        }
        int cnt1 = 0;
        for(int i=0; i<arr.length; i++) {
           if(arr[i] == el)  cnt1++;
        } if(cnt1 > arr.length/2){
            return el;
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int result = majorityElement(arr);
        //int result = majorityElementOptimal(arr);
        if(result != -1) {
            System.out.println("The majority element is: " + result);
        } else {
            System.out.println("No majority element found.");
        }
        sc.close();
    }
}