import java.util.*;

public class Prime {
    public static void main(Main[] args) {
        // int num = 29;
        // boolean isPrime = true;
        // for(int i=2; i<= num/2; i++){
        //     if(num %i == 0) {
        //         isPrime = false;
        //         break;
        //     }

        // }
        // System.out.println(isPrime);

        // print all prime numbers between 1 to n
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        for(int i=2; i<=n; i++){
            boolean isPrime = true;
            for(int j=2; j<=i/2; j++){
                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(i);
            }
        }
        sc.close();
    }
}