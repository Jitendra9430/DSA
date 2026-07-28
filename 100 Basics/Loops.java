
import java.util.*;
public class Loops {
    
    public static void displayNaturalNumbers(int n) {
        for(int i=0; i<=n; i++) {
            System.out.println("Natural Numbers are: " + i);
        }
    }
    public static void reverseDisplayNaturalNumbers(int n) {
        for(int i=n; i>0; i--) {
            System.out.println("Reverse natural numbers are:" + i);
        }
    }

    public static void displayEvenNumbers(int n) {
        for(int i=1; i<=n; i++) {
            if ( i % 2 == 0) {
                System.out.println("Even numbers are:" +i);
            }
        }
    }

    public static void displayOddNumbers(int n) {
        for(int i=1; i<=n; i++){
            if (i % 2 != 0) {
                System.out.println("Odd numbers are:" + i);
            }
        }
    }

    public static void SumOfNaturalNumbers(int n) {
        int sum = 0;
        for(int i=1; i<=n; i++) {
            sum += i;
            System.out.print("Sum of natural numbers is:" + sum);
        }

        
    }

    public static void sumOfEvenNumbers(int n) {
        int sum = 0;
        for(int i=1; i<=n; i++) {
            if(i%2 == 0) {
                sum = sum+i;
                System.out.println("Sum of all even numbers is:" + sum);
            }
        }
    }

    public static void sumOfOddNumbers(int n) {
        int sum = 0;
        for(int i=1; i<=n; i++) {
            if(i%2 != 0) {
                sum = sum+i;
                System.out.println("Sum of all odd numbers is:" + sum);
            }
        }
    }

    public static void productOfNaturalNumbers(int n) {
        int product = 1;
        for(int i=1; i<=n; i++) {
            product = product*i;
            System.out.println("Product of natural numbers is:" + product);
        }
    }

    public static void multiplicatiionTable(int n) {
        for(int i=1; i<=10; i++) {
            System.out.println(n + "x" + i + "=" + (n*i));
        }
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
       //displayNaturalNumbers(n);
        //reverseDisplayNaturalNumbers(n);
        //displayEvenNumbers(n);
        //displayOddNumbers(n);
        //SumOfNaturalNumbers(n);
        //sumOfEvenNumbers(n);  
        //sumOfOddNumbers(n);
        //productOfNaturalNumbers(n);
        multiplicatiionTable(n);

    }
}
