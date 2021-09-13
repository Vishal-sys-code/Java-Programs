import java.util.Scanner;
public class palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int number = sc.nextInt();
        int temporary_number = number;
        int remainder;
        int reverse = 0;
        while(number != 0){
            remainder = number%10;
            reverse = remainder + (reverse*10);
            number/=10;
        }
        if(temporary_number == reverse){
            System.out.println("The given number is PALINDROME ");
        }
        else{
            System.out.println("The given number is not a PALINDROME");
        }
        sc.close();
    }
}
