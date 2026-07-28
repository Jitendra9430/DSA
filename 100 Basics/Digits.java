import java.util.*;

public class Digits {

    // This method will count the number of digits in a given number
    public static void countDigits(int n) {
        int cnt = 0;
        int digit;
        while (n != 0) {
            digit = n % 10;
            cnt++;
            n = n / 10;
        }
        System.out.println("Number of digits in the given number is:" + cnt);
    }

    // Display all the digits of a given number
    public static void displayDigits(int n) {
        int digit;
        while (n != 0) {
            digit = n % 10;
            System.out.println("Digits of the given number are:" + digit);
            n = n / 10;
        }
    }

    // Sum and product of all the digits of a given number
    public static void sumOfDigits(int n) {
        int sum = 0;
        int product = 1;
        int digit;
        while (n != 0) {
            digit = n % 10;
            sum = sum + digit;
            product = product * digit;
            n = n / 10;

        }
        System.out.println("Sum of all the digits of the given number is:" + sum);
        System.out.println("Product of all the digits of the given number is:" + product);
    }

    //Reverse the digits of a given number
    public static void reverseDigits(int n){
        int reverse = 0;
        int digit = 0;
        while(n != 0){
            digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }
        System.out.println("Reverse of the given number is:" + reverse);
    }

    //Find the largest and smallest digit of a given number
    public static void largestDigit(int n) {
        int largest = 0;
        int digit = 0;
        if(n < 0) {
            n = -n;
            System.out.println("The number is negative, so we will consider its absolute value");
        }
        while(n != 0){
            digit = n%10;
            if(digit > largest) {
                largest = digit;
            }
            n = n/10;
            System.out.println("Largest digit of the given number is:" + largest);

        }
    }

    //Find the smallest digit of a given number
    public static void smallestDigit(int n) {
        int smallest = 9;
        int digit = 0;
        if( n < 0){
            n = -n;
            System.out.println("The number is negative, so we will consider its absolute value");

        }
        if(n == 0){
            smallest = 0;
        }
        while(n != 0) {
            digit = n % 10;
            if(digit < smallest){
                smallest = digit;
            }
            n = n/10;
        }
        System.out.println("Smallest digit of the given number is:" + smallest);
    }

    //Count the number of even digits and odd digits of a given number
    public static void countEvenOddDigits(int n) {
        int evenCnt = 0;
        int oddCnt = 0;
        int digit = 0;
        if(n < 0) {
            n = -n;
            System.out.println("The number is negative, so we will consider its absolute value");
    }
            while(n != 0) {
                digit = n % 10;
                if(digit % 2 == 0){
                    evenCnt ++;
                } else {
                    oddCnt++;
                }
                n = n/10;
            }
        System.out.println("Number of even digits in the given number is:" + evenCnt);
        System.out.println("Number of odd digits in the given number is:" + oddCnt);
    }

    // Check if a given number is palindrome or not
    public static void checkPalindrome(int n) {
        int original = n;
        int reverse = 0;
        int digit = 0;
        if(n < 0) {
            n = -n;
            System.out.println("The number is negative, so we will consider its absolute value");
        }
        while(n != 0) {
            digit = n % 10;
            reverse = reverse * 10 +digit;
            n = n/10;
        }
        if(reverse == original) {
            System.out.println("The given number is a palindrome");
        } else {
            System.out.println("The given number is not a palindrome");
        }
    }

    //Write a program to replace all zeros in a number n with the digit 5.
    public static void replaceZeroWithFive(int n) {
        int result = 0;
        int digit = 0;
        if(n < 0) {
            n = -n;
            System.out.println("The number is negative, so we will consider its absolute value");
        }
        while(n != 0) {
            digit = n % 10;
            if(digit == 0){
                digit = 5;
            }
        }
        result = result * 10 + digit;
         n = n/10;
        System.out.println("The number after replacing all zeros with 5 is:" + result);
    }

    //Write a program to find the sum of the first and last digit of a number n.
    public static void sumOfFirstAndLastDigit(int n) {
        int firstDigit = 0;
        int lastDigit = 0;
        if(n < 0) {
            n = -n;
            System.out.println("The number is negative, so we will consider its absolute value");
        }
        lastDigit = n % 10;
        while(n > 10) {
            n = n/10;
        }
        firstDigit = n;
        System.out.println("Sum of the first and last digit of the given number is:" + (firstDigit + lastDigit));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        countDigits(n);
        displayDigits(n);
        sumOfDigits(n);
        reverseDigits(n);
        largestDigit(n);
        smallestDigit(n);
        countEvenOddDigits(n);
        checkPalindrome(n);
        replaceZeroWithFive(n);
        sumOfFirstAndLastDigit(n);
    }
}