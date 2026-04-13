import java.util.*;

public class TwoSum {

    // Brute Force Approach
    public static int[] twoSumBrute(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    // Better Approach using HashMap
    public static int[] twoSumMap(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(arr[i], i);
        }
        return new int[]{-1, -1};
    }

    // Optimized Approach (Two Pointer with index preservation)
    public static int[] twoSumTwoPointer(int[] arr, int target) {
        int n = arr.length;

        // Store value + index
        int[][] temp = new int[n][2];
        for (int i = 0; i < n; i++) {
            temp[i][0] = arr[i]; // value
            temp[i][1] = i;      // original index
        }

        // Sort based on values
        Arrays.sort(temp, Comparator.comparingInt(a -> a[0]));

        int left = 0, right = n - 1;

        while (left < right) {
            int sum = temp[left][0] + temp[right][0];

            if (sum == target) {
                return new int[]{temp[left][1], temp[right][1]};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target: ");
        int target = sc.nextInt();

        // Choose approach
        // int result[] = twoSumBrute(arr, target);
        int result[] = twoSumMap(arr, target);
        // int result[] = twoSumTwoPointer(arr, target);

        System.out.println("The Indices: " + result[0] + " " + result[1]);

        sc.close();
    }
}