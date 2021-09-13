import java.util.Scanner;
public class expo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        System.out.print("NUMBER: ");
        int number = sc.nextInt();
        System.out.print("EXPONENT: ");
        int exponent = sc.nextInt();
        int answer = expo(number,exponent);
        System.out.println("The exponent is: " + answer);
        sc.close();
    }
    static int expo(int number, int exponent){
        if(exponent != 0){
            return (number * expo(number,exponent-1));
        }
        else{
            return 1;
        }
    }
}
