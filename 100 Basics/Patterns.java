import java.util.*;

public class Patterns {

    public static void rightAngledTriangle(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j <= i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        

        }
        
    }

    public static void invertedRightAngleTriangle(int n) {
        for(int i=n; i>= 1; i--){
            for(int j=1; j<= i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void pyramidTriangle(int n) {
        for(int i=1; i<=n; i++){

            //Print Spaces
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }

            //Print Stars
            for(int j=1; j <= (2 * i - 1); j++){
                System.out.print("*");
            }

            //Move to next line
            System.out.println();
        }
    }

    public static void numberTriangle(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();

        }
    }
    
    public static void main (Main[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
       // rightAngledTriangle(n);
        //invertedRightAngleTriangle(n);
        //pyramidTriangle(n);
        numberTriangle(n);

        sc.close();
    }
}
