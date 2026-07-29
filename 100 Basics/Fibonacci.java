import java.util.*;
// Fibonacci series is a sequence of numbers in which each number is the sum of the sum of the previous two numbers.
// F(n) = f(n-1) + f(n-2) where f(0) = 0 and f(1) = 1


public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int first = 0, second = 1;
        int sum = 0;
        for(int i=0; i<=n; i++) {
            System.out.print(first + " ");
            sum = sum + first;
            
            int next = first + second;
            first = second;
            second = next;

        }
        System.out.println("\nSum of first n terms of fibonacci series are =" + sum);

        sc.close();

    }
}