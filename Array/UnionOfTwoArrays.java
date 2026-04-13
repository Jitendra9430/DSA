import java.util.*;

public class UnionOfTwoArrays {

    //Brute Force Approach
    public static int[] unionOfTwoArrays(int[] arr1, int[] arr2){
        Set<Integer> set = new HashSet<>();
        for(int num : arr1) {
            set.add(num);
        }
        for(int num : arr2) {
            set.add(num);

        }
        int[] union = new int[set.size()];
        int index = 0;
        for(int num : set) {
            union[index++] = num;
        }
        return union;
        
    }

    //Optimal Approach
     public static ArrayList<Integer> union(int[] arr1, int[] arr2) {
        ArrayList<Integer> result = new ArrayList<>();

        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                if (result.isEmpty() || result.get(result.size() - 1) != arr1[i]) {
                    result.add(arr1[i]);
                }
                i++;
            } else {
                if (result.isEmpty() || result.get(result.size() - 1) != arr2[j]) {
                    result.add(arr2[j]);
                }
                j++;
            }
        }

        while (i < arr1.length) {
            if (result.isEmpty() || result.get(result.size() - 1) != arr1[i]) {
                result.add(arr1[i]);
            }
            i++;
        }

        while (j < arr2.length) {
            if (result.isEmpty() || result.get(result.size() - 1) != arr2[j]) {
                result.add(arr2[j]);
            }
            j++;
        }

        return result;
    }

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of first array:");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Enter the elements of first array:");
        for(int i=0; i<n; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the size of second array:");
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        System.out.println("Enter the elements of second array:");
        for(int i=0; i<m; i++){
            arr2[i] = sc.nextInt();
        }

        int[] union = unionOfTwoArrays(arr1, arr2);
        System.out.println("Union of two arrays is:");  
        for(int num : union) {
            System.out.print(num + " ");
        }
    }
    
}
