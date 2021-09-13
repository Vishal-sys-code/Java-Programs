//sum of N natural numbers (without using formula)
import java.util.Scanner; 
public class sumofnaturalnum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int sum = 0;
        for(int i=0;i<=num;++i){
            sum = sum+i;
        }
        /*The second method is to apply the direct formula of the sum of n natural numbers
           sum = (n) {(n+1)/2}
        */
        System.out.println("The sum of N natural numbers is: " + sum);
        sc.close();
    }
}
