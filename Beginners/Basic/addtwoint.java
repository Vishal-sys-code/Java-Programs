//adding two integers
import java.util.Scanner;
public class addtwoint {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        sum = a+b;
        System.out.println("The sum is: ");
        System.out.println(sum);
        sc.close();
    }    
}
