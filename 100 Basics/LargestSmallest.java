import java.util.*;

public class LargestSmallest {
    
    public static int findLargest(int a, int b, int c){
        int largest = a;
        if(b > largest){
            largest = b;
        }
        if(c > largest){
            largest = c;
        }
        return largest;
    }

    public static int findSmallest(int a, int b, int c){
        int smallest = a;
        if(b < smallest){
            smallest = b;
        }
        if(c < smallest){
            smallest = c;
        }
        return smallest;
    } 

    public static void leapYear(int year){
        if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)){
            System.out.println(year + " is a leap year.");

        }else {
            System.out.println("" + year + " is not a leap year.");
        }
    }
    public static void main (Main[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int largest = findLargest(num1, num2, num3);
        int smallest = findSmallest(num1, num2, num3);
        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);

    }
}
