import java.util.*;

public class ArrayLeader{


public static int[] leaderElements(int[] arr) {
    ArrayList<Integer> ans = new ArrayList<>();

    for (int i = 0; i < arr.length; i++) {
        boolean leader = true;

        for (int j = i + 1; j < arr.length; j++) {
            if (arr[j] > arr[i]) {
                leader = false;
                break;
            }
        }

        if (leader) {
            ans.add(arr[i]);  // moved outside inner loop
        }
    }

    // Convert ArrayList to int[]
    int[] result = new int[ans.size()];
    for (int i = 0; i < ans.size(); i++) {
        result[i] = ans.get(i);
    }

    return result;
}


    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

         int[] leaders = leaderElements(arr);

        System.out.println("Leader elements are:");
        for (int x : leaders) {
            System.out.print(x + " ");
        }
    }
}