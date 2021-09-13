// package if-else;
import java.util.Scanner; 
public class oddandeven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        System.out.println("----ODD---OR---EVEN----");
        if(number%2 == 0){
            System.out.println("The number is: EVEN");
        }
        else{
            System.out.println("The number is: ODD");
        }
        sc.close();
    }
}
