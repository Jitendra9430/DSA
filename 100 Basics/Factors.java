import java.util.*;
public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int cnt =0;
        System.out.println("Factors of " + num + " are:");
        for(int i=1; i<=num; i++) {
            if(num % i == 0) {
                cnt++;
                System.out.println(i);

            }
        }
        System.out.println("Total number of factors are:" + cnt);
    }

}