import java.util.Scanner;
public class primeornot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers: ");
        int number = sc.nextInt();
        int flag = 0;
        if(number == 0 || number == 1){
            System.out.println("The number " + number + " is not a prime number");
        }
        else{
            for(int i=2;i<(number/2);i++){
                if(number%i == 0){
                    System.out.println("The number " + number + " is not a prime number");
                    flag = 1;
                    break;
                }
            }
        }
        if(flag == 0){
            System.out.println("The number " + number + " is a prime number");
        }
        sc.close();
    }
}
