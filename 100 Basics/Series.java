import java.util.*;


public class Series {

    public static int sumOfN(int n) {
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum = sum+i;
        }
        return sum;

    }

    // series = 1^2+2^2+3^2+_____+n^2.
    public static int series(int n) {
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    //Series: 1+1/2+1/3+1/4+______+1/n
     public static double  seriesOfFraction(int n) {
        double sum = 0;
        for(int i=1; i<=n; i++){
            sum = sum + (1.0/i);
        }
        return sum;
    }

    //Find the value of x raise to the power y without inbuilt pow function.
    public static int xRaiseToY(int base,  int exponent) {
        int result = 1;
        for(int i=1; i<=exponent; i++){
            result = result *base;

        }
       return result;
    }


    public static void main(Main[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the base");
        int x = sc.nextInt();
        System.out.println("Enter the exponent");
        int y = sc.nextInt();
        // System.out.println("Enter the base");
        // int x = sc.nextInt();
        //int result = sumOfN(n);
        // int result = series(n); 
        //double result = seriesOfFraction(n); 
        int result = xRaiseToY(x, y );
        
        
        System.out.println("Sum = " + result);

        
        sc.close();
    }
    
}
