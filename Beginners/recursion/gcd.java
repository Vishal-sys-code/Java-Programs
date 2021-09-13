import java.util.Scanner;
public class gcd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        System.out.print("a: ");
        int a = sc.nextInt();
        System.out.print("b: ");
        int b = sc.nextInt();
        System.out.println("The GCD of " + " a and b is: " + gcd(a,b) );
        sc.close();
    }

    static int gcd (int a, int b){
        if(a%b == 0){
            return b;
        }
        return gcd(b,a%b);
    }
}
