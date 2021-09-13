//how to take the user input in java
import java.util.Scanner;

public class userinput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert a number");
        int number = sc.nextInt();
        System.out.println("The output is: ");
        System.out.println(number);
        sc.close();
    }
}
