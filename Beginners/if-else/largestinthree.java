// package if-else;
import java.util.Scanner;
public class largestinthree {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three numbers: ");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();

        //for number1
        if((number1 >= number2) && (number1 >= number3)){
            System.out.println("The number: " + number1 + " is greater");
        }
        //for number2
        else if((number2 >= number1) && (number2 >= number3)){
            System.out.println("The number: " + number2 + " is greater");
        }
        else{
            System.out.println("The number: " + number3 + " is greater");
        }
        sc.close();
    }
}
