import java.util.Scanner; 
public class reversenumber {
    public static void main(String[] args){
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int new_number = 0;
        int remainder;
        while(number !=0 ){
            remainder = (number % 10);
            new_number = remainder+(new_number*10);
            number/=10;
        }
        System.out.print("The reversed number is: " + new_number);
        sc.close();
    }
}
