package Basic;
import java.util.Scanner;
//swapping the two numbers in java
public class swap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first(a) number : ");
        int a = sc.nextInt();
        System.out.println("Enter the second(b) number : ");
        int b = sc.nextInt();

        int temp = a;
        a = b;
        b = temp;
        System.out.println("--------------After Swapping----------------");
        System.out.println("The value of a is: " + a + " " + "||" + " " + "The value of b is: " + b);
        sc.close();
    }
}
