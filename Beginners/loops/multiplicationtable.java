//creating the multiplication table
import java.util.Scanner;
public class multiplicationtable {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        int multiplication;
        System.out.println("---MULTIPLICATION TABLE---");
        for(int i=1;i<=10;++i){
            multiplication = number*i;
            System.out.println(number + "x" + i + " = " + multiplication);
        }
        sc.close();
    }
}
