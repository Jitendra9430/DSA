
public class Arrays {

    public static void largestAndSmallest(int[] arr) {
        int largest = arr[0];
        int smallest = arr[0];
        for(int i=0; i<=arr.length-1; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
            if(arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("Largest element in the array is: " + largest);
        System.out.println("Smallest element in the array is: " + smallest);
    }
    
    public static void oddEvenCount(int[] arr) {
        int oddCount = 0;
        int evenCount = 0;
        for(int i=0; i<=arr.length-1; i++) {
            if(arr[i] % 2 == 0){
                evenCount++;
            }
            else {
                oddCount++;
            }
        }
        System.out.println("Number of odd elements in the array is: " + oddCount);
        System.out.println("Number of even elements in the array is: " + evenCount);
    }

    public static void linearSearch(int[] arr, int key) {
        boolean found = false;
        for(int i=0; i <= arr.length-1; i++){
            if(arr[i] == key){
                found = true;
                System.out.println("Element " + key + " found at index: " + i);
                break;
            }
        }
        if(!found) {
            System.out.println("Element " + key + " not found in the array.");
        }
    }

    public static void reverseArray(int[] arr) {
        int first = 0;
        int last = arr.length-1;
        while(first < last) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
        System.out.println("Reversed array is:");
        for(int i=0; i<=arr.length-1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void sec_largest(int[] arr ){
        int largest = arr[0];
        int sec_largest = arr[0];
        for(int i=0; i <= arr.length-1; i++) {
            if(arr[i] > largest) {
                sec_largest = largest;
                largest = arr[i];
            }
            if(arr[i] > sec_largest && arr[i] != largest) {
                sec_largest = arr[i];
            }

        }
        System.out.println("Second largest element in the array is: " + sec_largest);
    }

    public static void removeDuplicates(int[] arr) {
        int n = arr.length;
        if(n == 0 || n == 1) {
            System.out.println("Array has no duplicates.");

        }
        int[] temp = new int[n];
        int j = 0;
        for(int i=0; i<n-1; i++) {
            if(arr[i] != arr[i+1]) {
                temp[j++] = arr[i];
            }
        }
        //copy the last element
        temp[j++] = arr[n-1];
        //copy the temp array to original array
        for(int i=0; i<j; i++){
            arr[i] = temp[i];
        }
        System.out.println("Array after removing duplicates:");
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,5,6};
        int key = 6;
        // int sum = 0;
        // int avg = 0;
        // System.out.println("Array elements are:");
        // for(int i=0; i<=arr.length-1; i++){
        //     sum += arr[i];
            

        // }
        // System.out.println("Sum of array elements are: " + sum);
        // avg = sum / arr.length;
        // System.out.println("Average of array elements are: " + avg);
        // largestAndSmallest(arr);
        // oddEvenCount(arr);
        //linearSearch(arr, key);
        // reverseArray(arr);
        sec_largest(arr);
    }
    
}
