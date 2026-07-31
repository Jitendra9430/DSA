import java.util.*;

public class Swap {

    public static void swapWithoutVariable(int a, int b){
        System.out.println("Before swapping" + "a =" +a +" and b =" +b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After swapping" + "a =" +a + " and b =" +b);

    }

    public static void marksAvg(int a, int b, int c){
        System.out.println("Total marks are:" + (a+b+c));
        int avg = (a+b+c)/3;
        System.out.println("Average of marks is: " + avg);
    }
    public static void main (Main[] args){
        int a = 10;
        int b = 5;
       // System.out.println("Before swapping" + " a =" +a + " and b =" +b);
        int temp = a;
        a = b;
        b = temp;
       // System.out.println("After swapping" + "a =" +a + " and b =" +b);

       swapWithoutVariable(a, b);
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the marks of three subjects:");
       int maths = sc.nextInt();
       int science = sc.nextInt();
       int english = sc.nextInt();
       marksAvg(maths, science, english);

    }
}
