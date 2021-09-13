import java.util.Scanner;
import java.lang.Math;
public class binarytodecimal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        System.out.println("The result is: " + conversion(number));
        sc.close();
    }

    static int conversion(int number){
        int sum=0;
        double i=0;
        double remainder;
        while(number != 0){
            remainder = number%10;
            number/=10;
            sum += (remainder)*(Math.pow(2, i));
            i++;
        }
        return sum;
    }
}
