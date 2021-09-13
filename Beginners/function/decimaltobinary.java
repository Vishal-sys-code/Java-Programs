import java.util.Scanner;
public class decimaltobinary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        System.out.println("The result is: " + conversion(number));
        sc.close();
    }
    static int conversion(int number){
        double remainder;
        int sum=0;
        int i=1;
        while(number != 0){
            remainder = number%2;
            number/=2;
            sum += remainder*i;
            i*=10;
        }
        return sum;
    }
}
