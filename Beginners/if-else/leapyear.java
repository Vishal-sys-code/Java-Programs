import java.util.Scanner;
public class leapyear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your favorite year: ");
        int year = sc.nextInt();
        if((year%4 == 0) || (year%400 == 0)){
            System.out.println("The year: " + year + " is a leap year");
        }
        else{
            System.out.println("The year: " + year + " is not a leap year");
        }
        sc.close();
    }
}
