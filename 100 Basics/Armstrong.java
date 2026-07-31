import java.util.*;

public class Armstrong {
    public static void main(Main[] args){
        // int digits=0, remainder, result = 0 , originalNum = 0;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number");
        // int num = sc.nextInt();
        // originalNum = num;
        // while(originalNum != 0){
        //     digits++;
        //     originalNum /= 10;
            
        // }
        // originalNum = num;
        // while(originalNum != 0) {
        //     remainder = originalNum % 10;
        //     result = (int) Math.pow(remainder, digits);
        //     originalNum /= 10;
        // }

        // if(result == originalNum) {
        //     System.out.println(num + " is an Armstrong number");
        // } else {
        //     System.out.println(num + " is not an Armstrong number");        

        // }
        // sc.close();



        // Print all Armstrong numbers between 1 to n
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        for(int num = 1; num <= n; num++) {
            int digits = 0;
            int temp = num;
            int sum = 0;

            while(temp != 0){
                digits++;
                temp /= 10;
            }
            temp = num;
            while(temp != 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }

            if(sum == num) {
                System.out.println(num + " is an Armstrong number");
            } else{
                System.out.println(num + " is not an Armstrong number");
            }
        }
    }
}
