public class Hello {

    
    
    public static void main (Main[] args){
        //System.out.println("Hello world");

        int a = 10;
        int b = 5;
        int rad = 10;
        System.out.println("Two numbers are:" + a + " and " + b);
        System.out.println("Sum of two numbers is:" + (a + b) );
        System.out.println("Difference of two numbers is:" + (a - b));
        System.out.println("Product of two numbers is:" + (a * b));
        System.out.println("Quotient of two numbers is:" + (a / b));
        System.out.println("Radius of a circle is:" + rad + "cm");
        System.out.println("Area of a circle is:" + (3.14*rad*rad) + "cm");
        System.out.printf("Circumference of a circle is : %.2f cm%n", 2*3.14*rad );
    }
}