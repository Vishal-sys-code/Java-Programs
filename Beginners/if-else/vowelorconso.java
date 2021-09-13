import java.util.Scanner; 
public class vowelorconso {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the characters: ");
        // char word = sc.nextChar();
        char word = sc.next().charAt(0);
        if(word == 'a' || word == 'e' || word == 'i' || word == 'o' || word == 'u' || word == 'A' || word == 'E' || word == 'I' || word == 'O' || word == 'U'){
            System.out.print("The character you have entered is a Vowel. ");
            System.out.println("ITS' A VOWEL");
        }
        else{
            System.out.print("The character you have entered is a Consonant. ");
            System.out.println("ITS' A CONSONANT");
        }
        sc.close();
    }
}
