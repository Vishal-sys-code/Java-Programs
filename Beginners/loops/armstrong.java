import java.util.Scanner;
public class armstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int original_number;
        int remainder = 0;
        int first_digit = 0;
        int sum = 0;
        original_number = num;
        while(original_number>0){
            original_number/=10;
            first_digit++;
        }
        while(original_number>0){
            remainder = original_number%10;
            sum+= (Math.pow(remainder,first_digit));
            original_number/=10;
        }
        if(original_number == sum){
            System.out.println("The number you have enterd is ARMSTRONG NUMBER.");
        }
        else{
            System.out.println("The number you have enterd is not an ARMSTRONG NUMBER.");
        }
        sc.close();
    }
}
