//multiply in java
package Basic;
import java.util.Scanner;
public class multiply {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first(a) number : ");
        double a = sc.nextDouble();
        System.out.println("Enter the second(b) number : ");
        double b = sc.nextDouble();
        double multiplication;
        multiplication = a*b;
        System.out.println("Result is: ");
        System.out.println(multiplication);
        sc.close();
    }
}
