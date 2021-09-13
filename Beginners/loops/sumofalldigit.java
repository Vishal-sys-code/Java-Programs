import java.util.Scanner;
public class sumofalldigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        int sum=0;
        int remainder;
        while(number > 0){
            remainder = number%10;
            sum = sum+remainder;
            number/=10;
        }
        System.out.println("Sum of all digits: " + sum);
        sc.close();
    }
}
