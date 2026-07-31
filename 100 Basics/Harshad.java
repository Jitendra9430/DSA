import java.util.*;

public class Harshad {
    public static void main(Main[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;
        while(temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        if(num % sum == 0) {
            System.out.println(num + " is a Harshad number.");
        } else {
            System.out.println(num + " is not a Harshad number.");  
        }
    }
}