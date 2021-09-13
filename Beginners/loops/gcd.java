//finding gcd of two integers
import java.util.Scanner;
public class gcd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        System.out.print("a: ");
        int num1 = sc.nextInt();
        System.out.print("b: ");
        int num2 = sc.nextInt();
        int gcd = 0;
        for(int i=1; i<=num1 && i<= num2; i++){
            if(num1%i == 0 && num2%i == 0){
                gcd = i;
            }
        }
        System.out.println("GCD is : " + gcd);
        sc.close();
    }
}
