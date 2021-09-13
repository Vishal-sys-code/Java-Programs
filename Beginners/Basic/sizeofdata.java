//finding the size of dataypes
package Basic;
import java.util.Scanner;
public class sizeofdata {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("The size of consecutive datatypes are:  ");
        System.out.println("TYPES:      SIZE: ");
        System.out.println("INTEGER =>   "+Integer.BYTES);
        System.out.println("FLOAT =>     "+Float.BYTES);
        System.out.println("DOUBLE =>    "+Double.BYTES);
        System.out.println("CHAR =>      "+Character.BYTES);
        sc.close();
    }
}
