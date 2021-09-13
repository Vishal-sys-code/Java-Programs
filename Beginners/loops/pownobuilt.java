import java.util.Scanner;
public class pownobuilt {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        System.out.print("Base: ");
        double a = sc.nextFloat();
        System.out.print("Exponent: ");
        double b = sc.nextFloat();
        double power = 1;
        while(b != 0){
            power*=a;
            --b;
        }
        System.out.println("Result is: " + power);
        sc.close();
    }
}
