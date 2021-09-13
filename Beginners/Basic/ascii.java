//finding the ASCII of any character
import java.util.Scanner;  
public class ascii {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char ch1 = 'a';  
        char ch2 = 'b'; 
        int asciivalue1 = ch1;  
        int asciivalue2 = ch2;  
        System.out.println("The ASCII value of " + ch1 + " is: " + asciivalue1);  
        System.out.println("The ASCII value of " + ch2 + " is: " + asciivalue2);
        sc.close();
    }
}
