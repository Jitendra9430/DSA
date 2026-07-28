import java.util.*;

public class EvenOdd {

    public static void positiveNegativeZero(int num){
        if(num > 0){
            System.out.println("Number is positive");
        } else if(num < 0) {
            System.out.println("Number is negative");
        } else{
            System.out.println("Number is zero");
        
        }
    }
    public static void main(String[] args) {
        int num = 105;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int nums = sc.nextInt();
        if(num% 2 == 0){
            System.out.println("Number is even");
        } else{
            System.out.println("Number is odd");
        }
        



        positiveNegativeZero(num);
    }
}