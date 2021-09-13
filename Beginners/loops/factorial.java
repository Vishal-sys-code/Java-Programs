//finding the factorial
import java.util.Scanner; 
public class factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int factorial = 1;
        for(int i=1;i<=num;++i){
            factorial = factorial*i;
        }
        System.out.println("The Factorial of " + num + " is: " + factorial);
        sc.close();
    }
}
