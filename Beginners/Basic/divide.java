/* Problem:- User is asked to enter two numbers find the remainder and quotient*/

//dividing the two integers in java
import java.util.Scanner;
public class divide {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dividend: ");
        int dividend = sc.nextInt();
        System.out.println("Enter the divisor: ");
        int divisor = sc.nextInt();
        int quotient,remainder;
        quotient = (dividend / divisor);
        remainder = (dividend % divisor);
        System.out.println("The quotient is:- "+ quotient);
        System.out.println("The remainder is:- "+ remainder);
        sc.close();
    }
}
