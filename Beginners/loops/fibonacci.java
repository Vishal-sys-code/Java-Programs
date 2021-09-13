//finding the Fibonacci number
import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements: ");
        int elements = sc.nextInt();
        int first_number = 0;
        int second_number = 1;
        int third_number;
        System.out.println("---Fibonacci Number---");
        System.out.print(first_number + " " + second_number + " ");
        for(int i=2;i<elements;++i){
            third_number = (first_number+second_number);
            System.out.print(" " + third_number + " ");
            first_number = second_number;
            second_number = third_number;
        }
        sc.close();
    }
}
