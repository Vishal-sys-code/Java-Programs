import java.util.Scanner;
public class sumnatnum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        System.out.println("The sum is: " + naturalsum(number));
        sc.close();
    }

    static  int naturalsum(int number){
        if(number < 0){
            return -1;
        }
        if(number != 0){
            return (number+naturalsum(number-1));
        }
        else{
            return number;
        }
    }

}
