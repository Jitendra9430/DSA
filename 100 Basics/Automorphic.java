import java.util.*;

public class Automorphic {
    public static void main(Main[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int square = num * num;
        int temp = num;
        int digits = 0;
        while(temp > 0) {
            digits++;
            temp /= 10;
        }
        int divisor = 1;
        for(int i=0; i<digits; i++) {
            divisor *= 10;
        }
        if(square % divisor == num) {
            System.out.println(num + " is an Automorphic number.");
        } else {
            System.out.println(num + " is not an Automorphic number.");     
        }
      }
}