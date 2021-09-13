//Check if an number can be expressed as the sum of two prime numbers
//if yes print all the possible combination

import java.util.Scanner;
public class sumof2prime {

    static boolean isPrime(int number){
        boolean prime = true;
        for(int i=2;i<=(number/2);i++){
            if(number%i == 0){
                prime = false;
                break;
            }
        }
        return prime;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        boolean flag = false;
        for(int i=2;i<=(number/2);i++){
            if(isPrime(i)){
                if (isPrime(number-i)) {
                    System.out.println(number + " = " + i + " + " +  (number - i));
                    flag = true;
                }
            }
        }
        if(!flag){
            System.out.println("Cannot be expressed");
        }
        sc.close();
    }
}
