import java.util.Scanner;
public class calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double number1,number2,answer;
        char operator;
        System.out.print("Enter the first number: ");
        number1 = sc.nextDouble();
        System.out.print("Enter the second number: ");
        number2 = sc.nextDouble();
        System.out.print("What operation you need?: ");
        operator = sc.next().charAt(0);
        switch(operator){

            case '+':
                answer = (number1 + number2);
                System.out.println("Running...........");
                System.out.print(number1 + " + " + number2 + " = ");
                System.out.println(answer);
                break;
            
            case '-':
                answer = (number1 - number2);
                System.out.println("Running...........");
                System.out.print(number1 + " - " + number2 + " = ");
                System.out.println(answer);
                break;
                
            case '*':
                answer = (number1 * number2);
                System.out.println("Running...........");
                System.out.print(number1 + " * " + number2 + " = ");
                System.out.println(answer);
                break;

            case '/':
                answer = (number1 / number2);
                System.out.println("Running...........");
                System.out.print(number1 + " % " + number2 + " = ");
                System.out.println(answer);
                break;

            case '%':
                answer = (number1 % number2);
                System.out.println("Running...........");
                System.out.print(number1 + " % " + number2 + " = ");
                System.out.println(answer);
                break;
            
            default:
                System.out.println("Hey Bitch!!!!!!!");
                System.out.println("Invalid operator!");
                break;
        }
        sc.close();
    }
}
