import java.util.*;

public class AlternateSign {

    public static void rearrange(int[] arr) {
        int n = arr.length;

        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        // Step 1: Separate
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) pos.add(arr[i]);
            else neg.add(arr[i]);
        }

        // Step 2: Merge alternately
        int i = 0, p = 0, ne = 0;

        while (p < pos.size() && ne < neg.size()) {
            arr[i++] = pos.get(p++);
            arr[i++] = neg.get(ne++);
        }

        // Step 3: Add remaining elements
        while (p < pos.size()) {
            arr[i++] = pos.get(p++);
        }

        while (ne < neg.size()) {
            arr[i++] = neg.get(ne++);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, -4, -5, 3, 4};

        rearrange(arr);

        System.out.println(Arrays.toString(arr));
    }
}