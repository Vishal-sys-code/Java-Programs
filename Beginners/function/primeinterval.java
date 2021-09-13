import java.util.Scanner;
public class primeinterval {

    static int Checkprime(int number){
        int flag = 1;
        for(int i=2;i<(number/2);i++){
            if(number%i == 0){
                flag = 0;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("---Enter the Bound--- ");
        System.out.print("Enter the Lower Bound: ");
        int lower_bound = sc.nextInt();
        System.out.print("Enter the Upper Bound: ");
        int upper_bound = sc.nextInt();
        int flag;
        for(int i=lower_bound;i<=(upper_bound);i++){
            if((i == 0) || (i == 1)){
                continue;
            }
            flag = Checkprime(i);
            if(flag == 1){
                System.out.println("The prime numbers in the range of " + lower_bound + " and " + upper_bound + " is: " + i);
            }
        }
        sc.close();
    }
}
