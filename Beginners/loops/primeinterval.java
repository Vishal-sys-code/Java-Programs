import java.util.Scanner;
public class primeinterval {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("---Enter the bounds---");
        System.out.print("Enter the Lower Bound: ");
        int lower_bound = sc.nextInt();
        System.out.print("Enter the Upper Bound: ");
        int upper_bound = sc.nextInt();
        int flag;
        for(int i=(lower_bound); i<=(upper_bound); i++){
            if(i == 0 || i == 1){
                //System.out.println("The number " + i + " is not a prime number");
                continue;
            }
            flag = 1;
            for(int j=2;j<(i/2);j++){
                if(i%j == 0){
                    System.out.println("The number " + i + " is not a prime number");
                    flag = 0;
                    break;
                }
            }
            if(flag == 1){
                System.out.println("The prime numbers in the range of " + lower_bound + " and " + upper_bound + " is: " + i);
            }
        }
        sc.close();
    }
}
