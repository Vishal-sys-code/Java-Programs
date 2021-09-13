 /*     The quadratic equation is:- ax^2+bx+c and the discriminant is:- b^2-4ac
        We need a Math.pow() function to calculate the roots
            if D>0 => both roots are to be printed (two real and distinct roots)
               D<0 => roots are imaginary (complex number)
               D=0 => roots are r = -b/2a (only one solution)
*/
import java.util.Scanner; 
public class quadratic {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //taking co-efficient for making quadratic equation and checking the roots of it.
        System.out.println("Enter the co-efficients: ");
        System.out.print("a: ");
        double a = sc.nextDouble();
        System.out.print("b: ");
        double b = sc.nextDouble();
        System.out.print("c: ");
        double c = sc.nextDouble();
        double root1, root2;
        //discriminant = (b*b)-4*a*c
        double discriminant = (b*b)-(4*a*c);
        root1 = (-b + Math.sqrt(discriminant))/(2*a);
        root2 = (-b - Math.sqrt(discriminant))/(2*a);
        if(discriminant > 0){
            System.out.println("The discriminant is positive so there will be two roots.");
            System.out.println("Two Roots are:- " + "  Root1: " + root1 + "  Root2: " + root2);
        }
        else if(discriminant == 0){
            System.out.println("The discriminant is equal to 0 so there will be only one solution roots.");
            root1 = root2 = (-b)/(2*a);
            System.out.println("Both roots are same so the result is:- " + "Root1: %.2f" + root1 + "Root2: %.2f" + root2);
        }
        else{
            System.out.println("The discriminant is neagtive which means that the roots are imaginary and the complex number should be introduced.");
        }
        sc.close();
    }
}
