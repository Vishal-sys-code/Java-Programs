import java.util.Scanner;
import java.lang.Math;
public class powinbuilt {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        System.out.print("Base: ");
        double a = sc.nextFloat();
        System.out.print("Exponent: ");
        double b = sc.nextFloat();
        double power = Math.pow(a, b);
        System.out.println("Result is: " + power);
        sc.close();
    }
}
