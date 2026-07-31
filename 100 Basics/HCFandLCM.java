import java.util.*;

public class HCFandLCM {
    public static void main (Main[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first numbers:");
        int num1 = sc.nextInt();
         System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        int hcf = 1;
        for(int i=1; i<= Math.min(num1, num2); i++) {
            if(num1 % i == 0 && num2 % i == 0) {
                hcf= i;
            }
        }
        System.out.println("HCF = " + hcf);

       
    }
    
}
